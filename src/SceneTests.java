import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

import java.io.File;
import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class SceneTests {


    private Scene scene;

    @BeforeEach
    public void setUp() {
        scene = new Scene();
        try {
            scene.load("simple.txt");
        } catch (IOException e) {

            e.printStackTrace();
            fail("Fail to get data");
        }
    }


    @Test
    public void testFindFirstContaining() {
        Shape shape = scene.findFirstContaining(0, 0);
        assertTrue(shape instanceof Rectangle, "Shape shas to be a rectangle.");
    }


    @Test
    public void testFindAllContaining() {
        List<Shape> shapes = scene.findAllContaining(200, 200);
        assertEquals(2, shapes.size());
    }


    @Test
    public void testNumEllipses() {
        int count = scene.numEllipses();
        assertEquals(1, count, " one ellipse allowed");
    }



    @Test
    public void testAveWidthOfRectanglesContaining() {

          double avgWidth = scene.aveWidthOfRectanglesContaining(200, 200);
        assertEquals(612.0, avgWidth, 0.1);
    }
    @Test
    public void testSaveMethod() {

        try {
            scene.save("scene.txt");
        } catch (IOException e) {
            e.printStackTrace();

            fail("Fall to save it ");
        }

        // Check if the file is there
        File savedFile = new File("scene.txt");
        assertTrue(savedFile.exists(),"File needs to be create");
    }

    @Test
    public void testSaveAndLoadScene() throws IOException {

        scene.save("scene.txt");

        // Load the scene from the saved file
        try {
            scene.load("scene.txt");
        } catch (IOException e) {
            e.printStackTrace();
            fail("Failed to load the scene from file");
        }


        BufferedImage image = new BufferedImage(1024, 768, BufferedImage.TYPE_INT_ARGB);
        Graphics g = image.getGraphics();

        scene.draw(g);

        File outputImage = new File("output_image.png");
        try {
            ImageIO.write(image, "PNG", outputImage);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Fail to make the image to file");
        }


        assertTrue(outputImage.exists());
    }
}


