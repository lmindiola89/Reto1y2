/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class ClsCalcula {
    
    // Atributos
    
    private double operando1;
    private double operando2;
    
    // Constructores
    
    public ClsCalcula() {
    }

    public ClsCalcula(double operando1, double operando2) {
        this.operando1 = operando1;
        this.operando2 = operando2;
    }
 
    // Metodos  
    
    public double sumar(){
        double suma = this.getOperando1() + this.getOperando2();
        return suma;
    }
    
    public double restar(){
        double restar = this.getOperando1() - this.getOperando2();
        return restar;
    }
    
    public double multiplicar(){
        double multiplicacion = this.getOperando1() * this.getOperando2();
        return multiplicacion;
    }
    
    public double dividir(){
        double division = this.getOperando1() / this.getOperando2();
        return division;
    }
    
    public double potencia(){
        double potencia = Math.pow(this.getOperando1(),this.getOperando2());
        return potencia;
    }
    
    public double raiz(){
        double raiz = Math.sqrt(getOperando1());
        return raiz;
    }
    
    public void Valores(){
        try {
            this.setOperando1(Double.parseDouble(JOptionPane.showInputDialog("Ingrese número 1")));
            this.setOperando2(Double.parseDouble(JOptionPane.showInputDialog("Ingrese número 2")));            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"Solo números");
            Valores(); 
        }
    } 
    
    public void Valor(){
        try {
            this.setOperando1(Double.parseDouble(JOptionPane.showInputDialog("Ingrese un número")));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"Solo números");
            Valor();
        }        
    }
    
    public void IniciaPrograma(){
        String opcion;
         do{
             String menu = JOptionPane.showInputDialog("""
                Seleccione una opción:
                                                       
                1. Operaciones
                2. Salir
                """);
             opcion = menu;
            switch (opcion){
                case "1":
                    IniciaMenu();
                case "2":
                    JOptionPane.showMessageDialog(null,"Gracias");
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opción incorrecta");
            }
        }while (!opcion.equals("2"));     
    }
    
    
    public void IniciaMenu(){
        String opcionOp;
         do{
            String menuOp = JOptionPane.showInputDialog("""
                Seleccione una Operación:
                                                       
                1. Sumar
                2. Restar
                3. Multiplicación
                4. División
                5. Potencia
                6. Raíz cuadrada de un número
                7. Salir                                                           
                """);
            opcionOp = menuOp;
            switch (opcionOp){
                case "1":
                    Valores();
                    JOptionPane.showMessageDialog(null,"La suma es :" + String.format("%.2f",sumar()));
                    IniciaMenu();
                case "2":
                    Valores();
                    JOptionPane.showMessageDialog(null,"La resta es: " + String.format("%.2f",restar()));
                    IniciaMenu();
                case "3":
                    Valores();
                    JOptionPane.showMessageDialog(null,"La multiplicación es: " + String.format("%.2f",multiplicar()));
                    IniciaMenu();
                case "4":
                    Valores();
                    JOptionPane.showMessageDialog(null,"La divisón es: " + String.format("%.2f",dividir()));
                    IniciaMenu();
                case "5":
                    Valores();
                    JOptionPane.showMessageDialog(null,"La potencia es: " + String.format("%.2f",potencia()));
                    IniciaMenu();
                case "6":
                    Valor();
                    JOptionPane.showMessageDialog(null,"La raíz es: " + String.format("%.2f",raiz()));
                    IniciaMenu();
                case "7":
                    JOptionPane.showMessageDialog(null,"Gracias");
                    System.exit(0);
                default:
                    JOptionPane.showMessageDialog(null,"Opción incorrecta");
                            }
        }while (!opcionOp.equals("7"));        
    } 

    /**
     * @return the operando1
     */
    public double getOperando1() {
        return operando1;
    }

    /**
     * @param operando1 the operando1 to set
     */
    public void setOperando1(double operando1) {
        this.operando1 = operando1;
    }

    /**
     * @return the operando2
     */
    public double getOperando2() {
        return operando2;
    }

    /**
     * @param operando2 the operando2 to set
     */
    public void setOperando2(double operando2) {
        this.operando2 = operando2;
    }
}
