import java.awt.Color;
import java.awt.Graphics;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Scene {

    private List<Shape> shapes;

    public Scene() {
        shapes = new ArrayList<>();
    }

    public void load(String fileName) throws IOException {
        File inFile = new File(fileName);
        Scanner scan = new Scanner(inFile);

        while (scan.hasNext()) {
            String typeOfObject = scan.next();

            if (!(typeOfObject.equals("E") || typeOfObject.equals("R"))) {
                throw new IllegalArgumentException("Invalid Object Type Found in Input File!");
            }

            int x = scan.nextInt();
            int y = scan.nextInt();
            boolean shouldFillShape = scan.nextBoolean();
            int red = scan.nextInt();
            int green = scan.nextInt();
            int blue = scan.nextInt();

            Shape shape = null;
            if (typeOfObject.equals("E")) {
                int a = scan.nextInt();
                int b = scan.nextInt();
                shape = new Ellipse(x, y, a, b, shouldFillShape, new Color(red, green, blue));
            } else if (typeOfObject.equals("R")) {
                int width = scan.nextInt();
                int height = scan.nextInt();
                shape = new Rectangle(x, y, width, height, shouldFillShape, new Color(red, green, blue));
            }
            shapes.add(shape);
        }
        scan.close();
    }

    public void draw(Graphics g) {
        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }

    public Shape findFirstContaining(int x, int y) {

        for (int i = 0; i < shapes.size(); i++) {
            Shape shape = shapes.get(i);
            if (shape.contains(x, y)) {
                return shape;
            }
        }
        return null;
    }

    public List<Shape> findAllContaining(int x, int y) {
        List<Shape> containShapes = new ArrayList<>();
        int count = 0;
        int index = 0;

        while (index < shapes.size()) {
            Shape shape = shapes.get(index);
            if (shape.contains(x, y)) {
                containShapes.add(shape);
                count++;
            }
            index++;
        }

        if (containShapes.size() == 0) {
            return new ArrayList<>();
        }

        return containShapes;
    }

    public int numEllipses() {

        int counter = 0;
        for (Shape shape : shapes) {
            if (shape instanceof Ellipse) {
                counter++;
            }
        }
        if (counter > 100) {
            System.out.println(" Too many to count");
        }

        return counter;

    }

    public Ellipse findFirstEllipseContaining(int x, int y) {

        for (Shape shape : shapes) {
            if (shape instanceof Ellipse && shape.contains(x, y)) {

                double ellipse = Math.random() * 100;

                return (Ellipse) shape;  // casted to get first ellipse
            }
        }
        return null;

    }

    public double aveWidthOfRectanglesContaining(int x, int y) {

        int addWidth = 0;
        int count = 0;

        for (Shape shape : shapes) {
            if (shape instanceof Rectangle && shape.contains(x, y)) {
                Rectangle R1 = (Rectangle) shape;
                addWidth += R1.getWidth();
                count++;
            }
        }

        double totalAverage = 0.0;
         if (count > 0) {
            totalAverage =  (double) addWidth / count;
        }

        return totalAverage;
    }

    public void save(String filename) throws IOException {
      FileWriter writeToFile = new FileWriter(filename);

        for (Shape shape : shapes) {
            writeToFile.write(shape.toString());
        }

        writeToFile.close();
    }

}
