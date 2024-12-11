package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public void testSumar() {
        Main main = new Main();
        assertEquals(5, main.sumar(2, 3));
        assertEquals(0, main.sumar(-2, 2));
    }

    @Test
    public void testRestar() {
        Main main = new Main();
        assertEquals(1, main.restar(3, 2));
        assertEquals(-4, main.restar(-2, 2));
    }

    @Test
    public void testEsPositivo() {
        Main main = new Main();
        assertTrue(main.esPositivo(5));
        assertFalse(main.esPositivo(-1));
        assertFalse(main.esPositivo(0)); // Cubre el caso borde
    }
}
