package br.edu.femass.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class QuadradoTest {
    @Test
    void testGetArea() {
        Quadrado l = new Quadrado(
            new Reta(0.0, 0.0, 0.0, 5.0)
        );
        Double esperado = 25.0;
        assertEquals(esperado, l.getArea());
    }

    @Test
    void testGetPerimetro() {
        Quadrado q = new Quadrado(
            new Reta(0.0, 0.0, 0.0, 5.0)
        );
        Double esperado = 20.0;
        assertEquals(esperado, q.getPerimetro());
    }
}
