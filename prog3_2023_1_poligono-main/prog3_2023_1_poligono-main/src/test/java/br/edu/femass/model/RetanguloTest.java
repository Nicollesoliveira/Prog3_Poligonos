package br.edu.femass.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RetanguloTest {
    
    @Test
    void testGetArea() {
      Retangulo r = new Retangulo(
            new Reta(0.0, 0.0, 0.0, 5.0),
            new Reta(0.0, 0.0, 0.0, 6.0)
        );
        Double esperado = 30.0;
        assertEquals(esperado, r.getArea());
    }
    
    @Test
    void testGetPerimetro() {
        Retangulo r = new Retangulo(
            new Reta(0.0, 0.0, 0.0, 5.0),
            new Reta(0.0, 0.0, 0.0, 6.0)
        );
        Double esperado = 22.0;
        assertEquals(esperado, r.getPerimetro());
    }
}
