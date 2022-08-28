/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jcapera.taller1_sofkau;

/**
 * Esta será mi super clase
 * @author caper
 */
public abstract class Bank {
    private String nameBank;
    private String city;
    public String branch;

    public Bank() {
    }

    public Bank(String nameBank, String city, String branch) {
        this.nameBank = nameBank;
        this.city = city;
        this.branch = branch;
    }

    public String getNameBank() {
        return nameBank;
    }

    public void setNameBank(String nameBank) {
        this.nameBank = nameBank;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    
    /**
     * creando metodo abstracto
     */
    public abstract void consignacion();
    
}
