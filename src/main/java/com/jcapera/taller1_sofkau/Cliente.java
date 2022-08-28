/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jcapera.taller1_sofkau;

import java.util.Date;

/**
 * Mi clase para crear objetos de tipo cliente heredando atributos 
 * @author caper
 */
public class Cliente extends Persona{
    
    private String phone;
    protected String address;

    public Cliente(String name, String lastName1, String lastName2, Date dateBirth, float height, String phone, String address) {
        super(name, lastName1, lastName2, dateBirth, height, phone, address);
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    private void abrirCuentaBancaria(){
        System.out.println("Ahora abrire una cuenta en Bancolombia");
    }
    
}
