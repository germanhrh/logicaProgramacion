package com.sophos.logicaprogramacion.Vehiculo;

public class Vehiculo {

    private int numeroLlantas;
    private String color;
    private String marca;

    public Vehiculo() {
        this(0, "Sin Color", "Sin Marca");
    }

    public Vehiculo(Integer cantidadDeLlantas, String color, String Marca)
    {
        this.numeroLlantas = cantidadDeLlantas;
        this.color = color;
        this.marca = Marca;
    }

    public int getNumeroLlantas() {
        return numeroLlantas;
    }

    public void setNumeroLlantas(int numeroLlantas) {
        this.numeroLlantas = numeroLlantas;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor()
    {
        return color;
    }
}
