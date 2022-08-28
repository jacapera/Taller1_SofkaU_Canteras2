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
    
    private String tecnologias;
    private String framework;
    private String experiencia;
    
    public Programador(String name, String lastName1, String lastName2, Date dateBirth, 
            float height, String phone, String address, String tecnologias, String framework, String experiencia) {
        super(name, lastName1, lastName2, dateBirth, height, phone, address);
        this.tecnologias = tecnologias;
        this.framework = framework;
        this.experiencia = experiencia;
    }

    public String getTecnologias() {
        return tecnologias;
    }

    public void setTecnologias(String tecnologias) {
        this.tecnologias = tecnologias;
    }

    public String getFramework() {
        return framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }
    
    public void programar(){
        System.out.println("Algun dia programare para Sofka");
    }
    
}
