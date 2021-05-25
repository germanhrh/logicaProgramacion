package com.sophos.logicaprogramacion.figuras;

public class Figura {
    private double perimetro;
    private double area;

    public Figura(double perimetro, double area) {
        this.perimetro = perimetro;
        this.area = area;
    }

    public Figura() {
        this.perimetro = 0;
        this.area = 0;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {

        if (perimetro>=0) {
            this.perimetro = perimetro;
        }
        else {
            throw new RuntimeException("El perimetro no puede ser menor que 0");
        }
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        if (area>=0) {
            this.area = area;
        }
        else {
            throw new RuntimeException("El area no puede ser menor que 0");
        }
    }
}
