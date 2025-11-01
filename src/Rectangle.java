import java.awt.Graphics;
import java.awt.Color;

public class Rectangle extends Shape {
    private int height;
    private int width;

    public Rectangle(int px, int py, int width, int height, boolean fill, Color c) {
        super(px, py, fill, c);
        this.width = width;
        this.height = height;
    }

    @Override
    public boolean contains(int px, int py) {

        boolean X = (px >=  this.x) && (px <= this.x + width);
        boolean Y = (py >= this.y) && (py <= this.y +  height);
        return X && Y;
    }
    @Override
    public void draw(Graphics g) {

        g.setColor(color);
        if (filled) {
            g.fillRect(x, y, width, height);
        } else {
            g.drawRect(x, y, width, height);
        }

    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public String toString() {
        return super.toString() + "width: " + width + "height: " + height;
    }
}
