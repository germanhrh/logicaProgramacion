package com.sophos.logicaprogramacion;

public class Papa {

    private int pesoEnGramos;
    private String tipo;

    public Papa()
    {
        pesoEnGramos = 0;
        tipo = "Indefinido";
    }

    public int getPesoEnGramos() {
        return pesoEnGramos;
    }

    public void setPesoEnGramos(int pesoEnGramos) {
        this.pesoEnGramos = pesoEnGramos;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }



}
