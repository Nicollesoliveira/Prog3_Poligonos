package br.edu.femass.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RetaTest {

    @Test
    void testGetTamanhoComPonto() {
        Ponto p1 = new Ponto();
        Ponto p2 = new Ponto(0.0,5.0);
        Reta r = new Reta(p1, p2);
        Double esperado = 5.0;
        assertEquals(esperado, r.getTamanho());
    }

    @Test
    void testGetTamanhoComCoordenadas() {
        Reta p1 = new Reta(0.0, 0.0, 0.0, 5.0);
        Double esperado = (5.0);
        assertEquals(esperado, p1.getTamanho());
    }
    
}
