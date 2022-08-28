/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jcapera.taller1_sofkau;

import java.util.Date;

/**
 * Esta será mi clase padre para crear objetos de tipo cliente al heredar a la clase hija Cliente y Programador
 * @author caper
 */
public class Persona {
    public String name;
    public String lastName1;
    public String lastName2;
    public Date dateBirth;
    public float height;
   
    public Persona(String name, String lastName1, String lastName2, Date dateBirth, float height) {
        this.name = name;
        this.lastName1 = lastName1;
        this.lastName2 = lastName2;
        this.dateBirth = dateBirth;
        this.height = height;
        
    }
    
      public String work(){
        String work = "Algun dia programare para Sofka"; 
        System.out.println(work);
        return work;
    }
      
     public String apasionate(){
         String apasionate = "Me gusta el cine";
         return apasionate;
     } 
}
