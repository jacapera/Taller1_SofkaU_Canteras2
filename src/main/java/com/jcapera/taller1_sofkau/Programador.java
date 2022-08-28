/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jcapera.taller1_sofkau;

import java.util.Date;

/**
 *
 * @author caper
 */
public class Programador extends Persona {
    private String phone;
    private String address;
    private String technologies;
    private String framework;
    private String experience;
   
    
    public Programador(String  name, 
                        String  lastName1, 
                        String  lastName2, 
                        Date    dateBirth, 
                        float   height, 
                        String  phone, 
                        String  address, 
                        String  technologies, 
                        String  framework, 
                        String  experience ) 
    {
        
        super(name, lastName1, lastName2, dateBirth, height);
        this.phone = phone;
        this.address = address;
        this.technologies = technologies;
        this.framework = framework;
        this.experience = experience;
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

    public String getTechnologies() {
        return technologies;
    }

    public void setTechnologies(String technologies) {
        this.technologies = technologies;
    }

    public String getFramework() {
        return framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }
    
  
    public String programarJava(){
        String programar = "Soy un programador que utiliza el framework de SpringBoot";
        System.out.println(programar);
        return  programar;
    }
    
}
