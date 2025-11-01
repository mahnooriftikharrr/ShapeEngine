import java.awt.*;

public abstract class Shape {
    protected int x, y;
    protected boolean filled;
    protected Color color;

    public Shape( int px, int py, boolean filled, Color color ) {
        x = px;
        y = py;
        this.filled = filled;
        this.color = color;
    }
    public abstract void draw( Graphics g );

    public abstract boolean contains( int x, int y );

    public String toString() {
        return String.format("%d %d %s %d %d %d", x, y, filled, color.getRed(), color.getGreen(), color.getBlue());
    }
}
