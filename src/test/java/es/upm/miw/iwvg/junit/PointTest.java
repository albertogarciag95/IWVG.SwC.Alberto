package es.upm.miw.iwvg.junit;

import es.upm.miw.iwvg.domain.Point;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PointTest {
    private Point point;

    @BeforeEach
    void before() {
        point = new Point(2, 3);
    }

    @Test
    void testPointIntInt() {
        assertEquals(2, point.getX());
        assertEquals(3, point.getY());
    }

    @Test
    void testPointInt() {
        point = new Point(2);
        assertEquals(2, point.getX());
        assertEquals(2, point.getY());
    }

    @Test
    void testPoint() {
        point = new Point();
        assertEquals(0, point.getX());
        assertEquals(0, point.getY());
    }

    @Test
    void testModule() {
        assertEquals(3.6055, point.module(), 10e-5);
    }

    @Test
    void testPhase() {
        assertEquals(0.9828, point.phase(), 10e-5);
    }

    @Test
    void testTranslateOrigin() {
        this.point.translateOrigin(new Point(1, 1));
        assertEquals(1, point.getX());
        assertEquals(2, point.getY());
    }

    @Test
    void testToString() {
        assertEquals("Point{x="+point.getX()+", y="+point.getY()+"}", point.toString());
    }

    @Test
    void testSetX() {
        point.setX(3);
        assertEquals(3, point.getX(), 10e-5);
        point.setX(2);
    }

    @Test
    void testSetY() {
        point.setY(8);
        assertEquals(8, point.getY(), 10e-5);
        point.setY(3);
    }
}
