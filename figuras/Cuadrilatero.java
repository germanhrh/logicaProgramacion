package com.sophos.logicaprogramacion.figuras;

public class Cuadrilatero extends Figura{

    private Double ladoA;
    private Double ladoB;


    public Cuadrilatero(Double ladoA, Double ladoB)
    {

        super();
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        super.setArea(calcularArea());
        super.setPerimetro(calcularPerimetro());
    }

    private double calcularPerimetro()
    {
        return (ladoA*2) + (ladoB*2);
    }

    private double calcularArea()
    {
        return ladoA * ladoB;
    }


    public String soyUnaFigura()
    {
        return "Soy un Cuadrilatero";
    }

}
