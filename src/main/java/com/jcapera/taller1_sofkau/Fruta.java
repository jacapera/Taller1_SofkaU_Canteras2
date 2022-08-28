/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jcapera.taller1_sofkau;

import java.util.ArrayList;

/**
 * En esta clase implementando un ArrayList como atributo, pasar un ArrayList a el constructor y crear métodos para poder
 * enviar y optener sus valores
 * @author caper
 */
public class Fruta {

    public String name;
    private float averageWeight;
    public ArrayList<String> colors;
    
    /**
     * Agregamos metodo contructor para inicializar los atributos de esta clase al instanciar un objeto de la misma.
     * @param name sera el nombre de la fruta
     * @param averageWeight sera le peso promedio de la fruta
     * @param colors podemos almacenar varios colores en una estrutura de datos dinamica de tipo ArrayList de la fruta 
     * segun su estado, si esta verde o madura
     */
    public Fruta(String name, float averageWeight, ArrayList<String> colors) {
        this.name = name;
        this.averageWeight = averageWeight;
        this.colors = colors;
    }

    public float getAverageWeight() {
        return averageWeight;
    }

    public void setAverageWeight(float averageWeight) {
        this.averageWeight = averageWeight;
    }

    public ArrayList<String> getColors() {
        return colors;
    }

    /**
     * Aunque el atributo de tipo ArrayList este en modo de acceso publico es necesario crear un método set para poderle 
     * enviar valores y llenar el ArrayList
     * @param colors podemos inicializar nuestro atributo con otro ArrayList
     */
    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }
    /**
     * En este método podremos pasarle valores al ArrayList despues de haber instanciado un objeto de tipo Fruta
     * @param color1 podria ser cuando la fruta esta verde pasarle el nombre de algun color relacionado
     * @param color2 podria ser cuando la fruta esta madura pasarle el nombre de algun color relacionado
     * @return 
     */
    public ArrayList<String> crearColors(String color1, String color2){
       colors = new ArrayList<>();
       colors.add(color1);
       colors.add(color2);
       return colors;
    }

    @Override
    public String toString() {
        return "Fruta{" + "name = " + name + ", averageWeight = " + averageWeight + ", colors = " + colors + '}';
    }
    
}
