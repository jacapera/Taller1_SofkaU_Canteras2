/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jcapera.taller1_sofkau;

/**
 *  Clase que hereda de la super clase Bank
 *  En esta clase se realizaran las operaciones para mi cuenta bancaria
 * @author caper
 */
public class CuentaBancaria extends Bank{

    private String costumer;
    private double balance;
    private String accountNumber;
    protected boolean activated;

    @Override
    public void consignacion() {
        System.out.println("Soy un metodo que ingresa dinero a mi cuenta bancaria por medio de una consignacion");
    }
    
    
    /**
     * Descripción: Implementando el patrón Builder para la instanciación de objetos de una clase
     * Se declara de forma estática por estar dentro de la clase CuentaBancaria
     * @author jesus capera
     */
    public static class Builder {

        private String costumer;
        private double balance;
        private final String accountNumber;
        protected boolean activated;
        
        /**
         *  Creamos el constructor para nuestra clase Builder unicamente le pasaremos el atributo accountNumber, analizando que
         *  este será el atributo que puede identificar explícitamente nuestro objeto a instanciar
         *  @param accountNumber identificador único que representa cada objeto de tipo CuentaBancaria
         */
        public Builder(String accountNumber){
            this.accountNumber = accountNumber;
        }
        
        
        
        /** 
         * Descripción: A partir de ahora implementaremos la clase Builder para darle valores a los demás atributos por medio de 
         * métodos implementados por esta misma clase
         * 
         * @param costumer será el nombre del cliente que se le asignara a nuestro objeto de tipo CuentaBancaria
         * @return this devuelve nuestro atributo referenciado de la clase Builder ya inicializado con el valor que le pasamos
         * como parámetro
         */
        public Builder withCostumer(String costumer){
            this.costumer = costumer;
            
            return this;
        }
        
        /** 
         * Descripción: método de la clase Builder para darle valor al atributo balance de la clase Builder
         * 
         * @param balance será el valor que tendra de saldo a nuestro objeto de tipo CuentaBancaria
         * @return this devuelve nuestro atributo referenciado de la clase Builder ya inicializado con el valor que le pasamos
         * como parámetro
         */
        public Builder withBalance(double balance){
            this.balance = balance;
            
            return this;
        }
       
        
        /** 
         * Descripción: método de la clase Builder para darle valor al atributo activated de la clase Builder
         * 
         * @param activated será el valor de estado aplicara a nuestro objeto de tipo CuentaBancaria
         * @return this devuelve nuestro atributo referenciado de la clase Builder ya inicializado con el valor que le pasamos
         * como parámetro
         */
        public Builder withActivated(boolean activated){
            this.activated = activated;
            
            return this;
        }
        
        /** 
         * Descripción: en este método crearemos un objeto de tipo CuentaBancaria o comúnmente dicho vamos a instanciar un objeto
         * @return cuenta devuelve el objeto instanciado, puede tener la opcion de escojer el atributo que requiera implementando
         * los metodos creados en la clase Builder
         */
        public CuentaBancaria build(){
            CuentaBancaria cuenta = new CuentaBancaria();
            cuenta.accountNumber = this.accountNumber;
            cuenta.costumer = this.costumer;
            cuenta.balance = this.balance;
            cuenta.activated = this.activated;
            
            return cuenta;
        }
    }
    
    
    public CuentaBancaria(){
        
    }
    protected Builder crearBuilder(String accountNumber){
            return new Builder( accountNumber);
        }

   /**
    * Creando constructor heredando atributos de la super clase bank
    */
    public CuentaBancaria(String nameBank, String city, String branch) {
        super(nameBank, city, branch);
    }
    
  /**
   * Creando método Get para optener el valor del atributo activated del objeto tipo clase CuentaBancaria (Encapsulamiento)
   * @return activated devuelve el valor de este atributo del objeto del tipo clase CuentaBancaria
   */
    public boolean getActivated() {
        return activated;
    }
    
    /**
     * Creando método Set para enviar un valor al atributo activated del objeto tipo clase CuentaBancaria (Encapsulamiento)
     * @param activated es el valor que se le enviara a este atributo al objeto de tipo clase CuentaBancaria
     */
    public void setActivated(boolean activated) {
        this.activated = activated;
    }
    
   /**
    * Creando método Get para optener el valor del atributo costumer del objeto tipo clase CuentaBancaria (Encapsulamiento)
    * @return costumer devuelve el valor de este atributo del objeto tipo clase CuentaBancaria
    */
    public String getCostumer() {
        return costumer;
    }
    
  /**
   * método Set para enviar un valor al atributo costumer del objeto tipo clase CuentaBancaria (Encapsulamiento)
   * @param costumer es el valor que se le enviara a este atributo al objeto de tipo clase CuentaBancaria
   */
    public void setCostumer(String costumer) {
        this.costumer = costumer;
    }
    
   /**
    * método Get para optener el valor del atributo balance del objeto clase CuentaBancaria (Encapsulamiento)
    * @return balance devuelve el valor de este atributo del objeto tipo clase CuentaBancaria
    */
    public double getBalance() {
        return balance;
    }
    
   /**
    * método Set para enviar un valor al atributo balance de la clase CuentaBancaria (Encapsulamiento)
    * @param balance es el valor que se le enviara a este atributo al objeto de tipo clase CuentaBancaria
    */
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    /**
     * método Get para optener el valor del atributo accountNumber del objeto de tipo clase CuentaBancaria (Encapsulamiento)
     * @return accountNumber devuelve el valor de este atributo del Objeto de tipo de la clase CuentaBancaria
     */
    public String getAccountNumber() {
        return accountNumber;
    }
    
    /**
     * método Set para enviar un valor al atributo accountNumber del objeto tipo clase CuentaBancaria (Encapsulamiento)
     * @param accountNumber es el valor que se le enviara a este atributo al objeto de tipo CuentaBancaria
     */
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    
    /**
     * Metodo para ingredar dinero a la cuenta bancaria
     * @param quantity cantidad de dinero a depoistar a la cuenta bancaria
     */
    public void depositMoney(double quantity ){
        balance += quantity;
    }
    
    /**
     * Metodo para retirar dinero de mi cuenta bancaria
     * @param quantity cantidad de dinero que voy a retirar de mi cuenta bancaria
     */
    public void withdrawMoney(double quantity ){
        balance -= quantity ;
    }
    
    /**
     * Metodo para guardar mi saldo de mi cuenta bancaria
     * @return devuelve el valor de la cantidad disponible en mi cuenta bancaria
     */
    public double balance(){
        return balance;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "costumer=" + costumer + ", balance=" + balance + ", accountNumber=" + accountNumber + ", activated=" + activated + '}';
    }
    
    
}
