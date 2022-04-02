package com.example.test_final;

public class Suma {
    double numero1;
    double numero2;

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public Suma(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public double resultado(double numero1, double numero2){
        return (this.getNumero1() + this.getNumero2() );
    }
}
