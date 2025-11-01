import java.awt.Graphics;
import java.awt.Color;

 public class Ellipse extends Shape {

    private int a;
    private int b;

    public Ellipse(int px, int py, int a, int b, boolean fill, Color c) {
        super(px, py, fill, c);
        this.a = a;
        this.b = b;
    }

    @Override
    public boolean contains(int x, int y) {
        double Y = y - this.y;
        double X = x - this.x;
        return ((X * X) / (a * a)) + ((Y * Y) / (b * b)) <= 1;
    }

    @Override
    public void draw(Graphics g) {
          g.setColor(color);
         if (filled) {
            g.fillOval(x - a, y - b, 2 * a, 2 * b);
        } else {
            g.drawOval(x - a, y - b, 2 * a, 2 * b);
        }
    }

    @Override
    public String toString() {
        return String.format("E %d %d %b %d %d %d %d %d", x, y, filled,
                color.getRed(), color.getGreen(), color.getBlue(), a, b);
    }
}