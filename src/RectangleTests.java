import org.junit.Test;
import static org.junit.Assert.*;
import java.awt.Color;

public class RectangleTests {


    @Test
    public void testContains() {
        Rectangle r = new Rectangle(10, 10, 50, 40, true, Color.BLUE);
        assertTrue(r.contains(15, 15));
        assertFalse(r.contains(100, 50));


        assertTrue(r.contains(10, 10));
    }

    @Test
    public void testToString() {
        Rectangle r = new Rectangle(5, 6, 7, 8, false, Color.RED);
        String expected = "5 6 false 255 0 0 7 8";
        assertEquals(expected, r.toString());
    }
}