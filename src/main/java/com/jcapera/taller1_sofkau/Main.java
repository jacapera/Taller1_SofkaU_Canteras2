/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jcapera.taller1_sofkau;

import java.util.ArrayList;
import java.util.List;

/**
 *  Esta será mi clase principal donde arrancará mi programa
 * @author caper
 */
public class Main  {
    
    public static void main(String[] args) {
        
        //Instanciando el objeto cuenta3 de tipo SavingAccount
        SavingAccount cuenta3 = new SavingAccount("Bancolombia", "Yopal",  "La Primavera", 0.9);
        //Creando coleccion de datos para guardar un objeto
        List<CuentaBancaria> lista = new ArrayList<>();
        lista.add( cuenta3.crearBuilder("577-811-634")
                .withCostumer("Andres Perez")
                .withBalance(5000000)
                .withActivated(true)
                .build());
        String accounNumber = "";
        String costumer = "";
        double balance = 0;
        boolean activated = false;
        for(CuentaBancaria i : lista){
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
        System.out.println("Nombre Banco: " + cuenta3.getNameBank());
        System.out.println("Ciudad: " + cuenta3.getCity());
        System.out.println("Sucursal Banco: " + cuenta3.branch);
        System.out.println("Número de cuenta: " + accounNumber);
        System.out.println("Nombre Cliente: " + costumer);
        System.out.println("Saldo disponible: $" + total_balance);
        System.out.println("Estado de cuenta: " + activated);
        System.out.println("Interes: " + cuenta3.getInterest() + "%");
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("Transaccion 1: DEPOSITO\n"); 
        System.out.println("Acaba de depositar a su cuenta: " + deposit);
        cuenta3.depositMoney(deposit);
        total_balance = cuenta3.balance();
        System.out.println("Su nuevo saldo es: $" + total_balance);
        System.out.println("\n");
        System.out.println("--------------------------------------------------------------------------------------");
        if(total_balance > withdraw){
            System.out.println("Transaccion 2: RETIRO \n");
            System.out.println("Acaba de solicitar un retiro de su cuenta por valor de: $" + withdraw);
            cuenta3.withdrawMoney(withdraw);
            total_balance = cuenta3.balance();
            System.out.println("Su nuevo saldo es: $" + total_balance);
        }else{
            System.out.println("Transaccion 2: \n");
            System.out.println("Acaba de solicitar un retiro de su cuenta por valor de: $" + withdraw);
            System.out.println("!Lo siento, saldo insuficiente" + "\n Su saldo es de: $" + total_balance);
        }
        System.out.println("\n--------------------------------------------------------------------------------------");
        System.out.println("Herencia de una Super Clase Bank" + "\nEstoy implementado un metodo de mi abuelo Bank");
        cuenta3.consignacion();
        System.out.println("--------------------------------------------------------------------------------------\n\n");
        
        
        
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
        System.out.println("--------------------------------------------------------------------------------------");
        
        
        
        //Instanciando el objeto cuenta2 del tipo Cuenta Bancario solo con los atributos que requiero
        CuentaBancaria cuenta2 = new CuentaBancaria.Builder("614-471-235")
            .withCostumer("Pepito Perez")
            .withActivated(false)
            .build();
        //Imprimiendo los elementos del objeto cuenta2 del tipo CuentaBancaria
        System.out.println("Account Number: " + cuenta2.getAccountNumber());
        System.out.println("Name: " + cuenta2.getCostumer());
        System.out.println("Status: " + cuenta2.getActivated());
    }
    
}
