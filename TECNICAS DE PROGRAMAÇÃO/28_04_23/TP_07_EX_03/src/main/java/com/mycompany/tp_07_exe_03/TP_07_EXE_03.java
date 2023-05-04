/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp_07_exe_03;

import javax.swing.JOptionPane;

/**
 *
 * @author labs
 */
public class TP_07_EXE_03 {

    public static void main(String[] args) {
        
        float num1, num2;
        String operador;
        
        String numero = JOptionPane.showInputDialog(null, "Informe o Primeiro número");
        num1 = Float.parseFloat(numero);
        
        operador = JOptionPane.showInputDialog(null, "Informe o Operador número");
        
        numero = JOptionPane.showInputDialog(null, "Informe o Segundo número");
        num2 = Float.parseFloat(numero);       
        
        
        Calculadora calculadora = new Calculadora(num1, num2, operador);
        
        calculadora.operacao();
        
        
        
    }
}
