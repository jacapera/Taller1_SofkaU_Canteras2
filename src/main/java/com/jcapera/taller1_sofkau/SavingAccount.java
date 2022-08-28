/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jcapera.taller1_sofkau;

/**
 * Clase que hereda atributos y metodos de la clase padre CuentaBancaria y de la super clase Bank
 * Aplicamos herencia de una super clase de la cual podemos disponer de los atributos
 * @author caper
 */
public class SavingAccount extends CuentaBancaria {
    protected double interest;

    public SavingAccount(String nameBank, String city, String branch, double interest) {
        super(nameBank, city, branch);
        this.interest = interest;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }
    
}
