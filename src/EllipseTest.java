import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.awt.Color;

/**
 * Tests for the Ellipse class.  Use this a starting point, you may want to create more.
 */
public class EllipseTest {

    private Ellipse el;

    @BeforeEach
    public void setUpEllipse() {
        el = new Ellipse(600, 200, 300, 100, false, new Color(1,2,3));
    }

    @Test
    public void testContains01() {
        // Contains center point
        Assertions.assertTrue( el.contains(600,200));
    }

    @Test
    public void testContains02() {
        // right edge
        Assertions.assertTrue( el.contains(899,200));
    }

    @Test
    public void testContains03() {
        // left edge
        Assertions.assertTrue( el.contains(301,200));
    }

    @Test
    public void testContains04() {
        // top
        Assertions.assertTrue( el.contains(600,101));
    }

    @Test
    public void testContains05() {
        // bottom
        Assertions.assertTrue(el.contains(600,299));
    }

    @Test
    public void testContains06() {
        // Way off
        Assertions.assertFalse( el.contains(1000,1000));
    }

    @Test
    public void testContains07() {
        // right edge
        Assertions.assertFalse( el.contains(901,200));
    }

    @Test
    public void testContains08() {
        // left edge
        assertFalse( el.contains(299,200));
    }

    @Test
    public void testContains09() {
        // top
        assertFalse( el.contains(600,99));
    }

    @Test
    public void testContains10() {
        // bottom
        assertFalse( el.contains(600,301));
    }

    @Test
    public void testToString() {
        assertEquals( "E 600 200 false 1 2 3 300 100", el.toString());
    }
}
