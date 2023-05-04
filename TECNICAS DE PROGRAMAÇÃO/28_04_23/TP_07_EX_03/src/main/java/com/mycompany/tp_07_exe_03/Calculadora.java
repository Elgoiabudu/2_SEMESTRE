/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp_07_exe_03;

import javax.swing.JOptionPane;

/**
 *
 * @author labs
 */
public class Calculadora {
    private float num1;
    private float num2;
    private String operador;

    public Calculadora(float num1, float num2, String operador) {
        this.num1 = num1;
        this.num2 = num2;
        this.operador = operador;
    }

    public Calculadora() {
    }

    public float getNum1() {
        return num1;
    }

    public float getNum2() {
        return num2;
    }

    public String getOperador() {
        return operador;
    }

    public void setNum1(float num1) {
        this.num1 = num1;
    }

    public void setNum2(float num2) {
        this.num2 = num2;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }
    
    public void operacao(){                
        
            if(operador.equals("+")){
                JOptionPane.showMessageDialog(null, "Resultado da soma é igual a: "+(num1 + num2)); 
            }else if(operador.equals("-")){
                JOptionPane.showMessageDialog(null, "Resultado da subtração é igual a: "+(num1 - num2)); 
            }else if(operador.equals("/")){
                if(num2 == 0){
                    JOptionPane.showMessageDialog(null, "Não existe divisão por zero!"); 
                }else{
                    JOptionPane.showMessageDialog(null, "Resultado da divisão é igual a: "+(num1 / num2)); 
                }                
            }else{
            JOptionPane.showMessageDialog(null, "Resultado da multiplicação é igual a: "+(num1 * num2)); 
            }        
    } 
}
