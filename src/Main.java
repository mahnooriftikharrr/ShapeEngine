import javax.imageio.ImageIO;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Scene scene = new Scene();
        scene.load("forest.txt");

        BufferedImage image = new BufferedImage(1024, 768, BufferedImage.TYPE_INT_ARGB);
        Graphics g = image.getGraphics();

        scene.draw(g);

        File outFile = new File("image.png");
        ImageIO.write(image, "png", outFile);
    }

}