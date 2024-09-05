package org.example.TestThreeModel.DesserializadorJson;

public class Faturamento {
    private int dia;
    private Double valor;

    public Double getValor() {
        return valor;
    }

    public int getDia() {
        return dia;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }


    @Override
    public String toString(){
       return String.format("Dia:%d Valor:%.4f",getDia(),getValor());
    }
}