package com.sophos.logicaprogramacion.Zapatos;

public class Zapato {

    private int talla;
    private String Modelo;
    private String marca;

    public Zapato(int talla, String modelo, String marca) {
        this.talla = talla;
        this.Modelo = modelo;
        this.marca = marca;
    }

    public Zapato() {
        this.talla = 0;
        this.Modelo = "Sin Modelo";
        this.marca = "Sin Marca";
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    public void setTalla(String talla) {

        switch (talla) {
            case "S":
                this.talla = 32;
                break;
            case "M":
                this.talla = 35;
                break;
            case "X":
                this.talla = 37;
                break;
            case "XL":
                this.talla = 40;
                break;
            default:
                System.out.println("Talla caracter no existe");
                break;
        }

    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
