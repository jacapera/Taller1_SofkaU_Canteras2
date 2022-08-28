/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jcapera.taller1_sofkau;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * Esta será mi clase principal donde arrancará mi programa
 *
 * @author caper
 */
public class Main {

    public static void main(String[] args) {

        //Instanciando el objeto cuenta3 de tipo SavingAccount
        SavingAccount cuenta3 = new SavingAccount("Bancolombia", "Yopal", "La Primavera", 0.9);
        //Creando coleccion de datos para guardar un objeto
        List<CuentaBancaria> lista = new ArrayList<>();
        lista.add(cuenta3.crearBuilder("577-811-634")
                .withCostumer("Andres Perez")
                .withBalance(5000000)
                .withActivated(true)
                .build());
        String accounNumber = "";
        String costumer = "";
        double balance = 0;
        boolean activated = false;
        for (CuentaBancaria i : lista) {
            accounNumber = i.getAccountNumber();
            costumer = i.getCostumer();
            balance = i.getBalance();
            activated = i.getActivated();
        }

        //Enviando valor del saldo actual al atributo balance que heredo de la clase CuentaBancaria 
        cuenta3.setBalance(balance);

        //Obteniendo el valor actual del atributo balance y guardandolo en la variable total_balance
        double total_balance = cuenta3.balance();

        // Cantidad a depositar de mi cuenta bancaria
        double deposit = 800000;

        // Cantidad a retirar de mi cuenta bancaria
        double withdraw = 5000000;

        //Imprimiendo los elementos del objeto cuenta3 del tipo SavingAccount
        System.out.println("IMPRIMIENTO TODOS LOS DATOS DE MI CUENTA BANCARAIA \n");
        System.out.println("Nombre Banco: " + cuenta3.getNameBank());
        System.out.println("Ciudad: " + cuenta3.getCity());
        System.out.println("Sucursal Banco: " + cuenta3.branch);
        System.out.println("Número de cuenta: " + accounNumber);
        System.out.println("Nombre Cliente: " + costumer);
        System.out.println("Saldo disponible: $" + total_balance);
        System.out.println("Estado de cuenta: " + activated);
        System.out.println("Interes: " + cuenta3.getInterest() + "%");
        System.out.println("\n--------------------------------------------------------------------------------------");
        System.out.println("Transaccion 1: DEPOSITO\n");
        System.out.println("Acaba de depositar a su cuenta: " + deposit);
        cuenta3.depositMoney(deposit);
        total_balance = cuenta3.balance();
        System.out.println("Su nuevo saldo es: $" + total_balance);
        System.out.println("--------------------------------------------------------------------------------------");
        if (total_balance > withdraw) {
            System.out.println("Transaccion 2: RETIRO \n");
            System.out.println("Acaba de solicitar un retiro de su cuenta por valor de: $" + withdraw);
            cuenta3.withdrawMoney(withdraw);
            total_balance = cuenta3.balance();
            System.out.println("Su nuevo saldo es: $" + total_balance);
        } else {
            System.out.println("Transaccion 2: \n");
            System.out.println("Acaba de solicitar un retiro de su cuenta por valor de: $" + withdraw);
            System.out.println("!Lo siento, saldo insuficiente" + "\n Su saldo es de: $" + total_balance);
        }
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("Herencia de una Super Clase Bank" + "\nEstoy implementado un metodo de mi abuelo Bank");
        cuenta3.consignacion();
        System.out.println("--------------------------------------------------------------------------------------\n");

        
        
        
        //Instanciando el objeto cuenta de tipo CuentaBancaria
        CuentaBancaria cuenta = new CuentaBancaria.Builder("789-471-235")
                .withCostumer("Jesus Capera")
                .withBalance(2000000)
                .withActivated(true)
                .build();
        //Imprimiendo los elementos del objeto cuenta del tipo CuentaBancaria
        System.out.println("Account Number: " + cuenta.getAccountNumber());
        System.out.println("Name: " + cuenta.getCostumer());
        System.out.println("Balance: " + cuenta.getBalance());
        System.out.println("Status: " + cuenta.getActivated());
        System.out.println("--------------------------------------------------------------------------------------\n");

        //Instanciando el objeto cuenta2 del tipo Cuenta Bancario solo con los atributos que requiero
        CuentaBancaria cuenta2 = new CuentaBancaria.Builder("614-471-235")
                .withCostumer("Pepito Perez")
                .withActivated(false)
                .build();
        //Imprimiendo los elementos del objeto cuenta2 del tipo CuentaBancaria
        System.out.println("Account Number: " + cuenta2.getAccountNumber());
        System.out.println("Name: " + cuenta2.getCostumer());
        System.out.println("Status: " + cuenta2.getActivated());
        
        
        
        
        // Trabajando con la clase Fruta        
        System.out.println("--------------------------------------------------------------------------------------");
        Fruta fruta1 = new Fruta("Manzana", 0.4F, new ArrayList<>());
        fruta1.crearColors("rojo","verde");
        fruta1.colors.add("azul");
        System.out.println("Imprimiendo todo los atributos de fruta1: " + fruta1);
        System.out.println("Imprimiendo un elemento del atributo colors: " + fruta1.colors.get(0));
        System.out.println("Imprimiendo todos los elementos del atributo colors: " + fruta1.getColors());
        
        System.out.println("\n--------------------------------------------------------------------------------------");
        ArrayList<String>colors2 = new ArrayList();
        colors2.add("marron");
        colors2.add("amarillo");
        colors2.add("gris");
        //Enviando valores al ArrayList colors con otro ArrayLista
        fruta1.setColors(colors2);
        System.out.println("Imprimiendo los nuevos valores de los elementos del atributo colors: " + fruta1);
        
        
        
        // Trabajando con la clase Persona, cliente, programador
        Programador jesus = new Programador("Jesús Antonio", 
                                        "Capera", 
                                        "Acuña", 
                                            new Date(81, 7, 12, 18, 05, 05), 
                                            1.66F, 
                                           "3204959397",
                                          "Calle 19 # 25 - 31", 
                                       "Java, HTML, CSS, JavaScript, SQL, Python", 
                                        "SpringBoot",
                                       "6 meses"); 
        
        JOptionPane.showMessageDialog(null, "Name: " + jesus.name + "\nLastName1: " + jesus.lastName1 + 
                                                         "\nLastName2: " + jesus.lastName2 + "\nDateBirth: " + jesus.dateBirth +
                                                         "\nHeight: " + jesus.height + "\nPhone: " + jesus.getPhone() + 
                                                         "\nTechnologies: " + jesus.getTechnologies() + "\nFramework: " + jesus.getFramework() +
                                                         "\nExperience: " + jesus.getExperience() + "\nWorks: " + jesus.work() + 
                                                         "\nProgramming: " + jesus.programarJava()); 
        
    }
    
}

   
