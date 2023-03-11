package br.edu.femass.model;

public class Ponto {
    private Double x;
    private Double y;

    public Ponto(Double x, Double y) {
        this.x = x;
        this.y = y;
    }

    public Ponto() /*construtor vazio */ { 
        this.x = 0.0;
        this.y = 0.0;
    }

    public Double getX() {
        return x;
    }

    public Double getY() {
        return y;
    }

    /*
     *  1o q = x,y>0
        2o q = x<0 e y>0
        3o q = x,y<0
        4o q = x>0 e y<0
        Eixo de x = x<>0 e y = 0
        Eixo de y = x = 0 e y<>0
        Origem x,y=0
     */
    public String getLocalizacao() {
        if (this.x>0.0 && this.y>0.0) return "1o Quadrante";
        if (this.x<0.0 && this.y>0.0) return "2o Quadrante";
        if (this.x<0.0 && this.y<0.0) return "3o Quadrante";
        if (this.x>0.0 && this.y<0.0) return "4o Quadrante";
        if (this.x!=0.0 && this.y==0.0) return "Eixo de X";
        if (this.x==0.0 && this.y!=0.0) return "Eixo de Y";
        return "Origem";
    }
    /* sqrt = raiz quadrada*/
    public Double getDistancia(Ponto p) {
        return Math.sqrt  (
            Math.pow(p.getX()-this.x,2)
            + Math.pow(p.getY()-this.y,2)
        );
    }
     /* novo ponto de x e y  */
    public Double getDistancia(Double x, Double y) {
        return this.getDistancia(
            new Ponto(x,y)
            );
    }
    
}
