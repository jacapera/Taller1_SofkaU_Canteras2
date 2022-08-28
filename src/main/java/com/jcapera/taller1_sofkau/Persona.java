/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jcapera.taller1_sofkau;

import java.util.Date;

/**
 * Esta será mi clase padre para crear objetos de tipo cliente al heredar a la clase hija Cliente
 * @author caper
 */
public class Persona {
    public String name;
    public String lastName1;
    public String lastName2;
    public Date dateBirth;
    public float height;
   
    public Persona(String name, String lastName1, String lastName2, Date dateBirth, float height, String phone, String address) {
        this.name = name;
        this.lastName1 = lastName1;
        this.lastName2 = lastName2;
        this.dateBirth = dateBirth;
        this.height = height;
        
    }
    
    public void programarJava(){
        System.out.println("Soy un programador que utiliza el framework de SpringBoot");
    }
    
}
