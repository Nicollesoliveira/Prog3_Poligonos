package br.edu.femass.model;

public class Retangulo extends Quadrado{
    private Reta altura;

    public Retangulo(Reta lado, Reta altura) {
        super(lado);
        this.altura = altura;
    }

    @Override
    public Double getArea() {
        return this.lado.getTamanho()*this.altura.getTamanho();
    }

    @Override
    public Double getPerimetro() {
        return 
            this.lado.getTamanho()*2
            + this.altura.getTamanho()*2;
    }
    
}
