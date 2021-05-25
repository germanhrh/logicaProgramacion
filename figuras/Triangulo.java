package com.sophos.logicaprogramacion.figuras;

public class Triangulo extends Figura{

    private Double base;
    private Double altura;
    private Double hipotenusa;

    public Triangulo(Double base, Double altura, Double hipotenusa)
    {
        super();
        this.base = base;
        this.altura = altura;
        this.hipotenusa = hipotenusa;
        super.setArea(calcularArea());
        super.setPerimetro(calcularPerimetro());
    }

    private double calcularPerimetro()
    {
        return base+altura+hipotenusa;
    }

    private double calcularArea()
    {
        return (base * altura)/2;
    }

    public String soyUnaFigura()
    {
        return "Soy un Triangulo";
    }

}
