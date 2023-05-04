/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista04_exe06;

import javax.swing.JOptionPane;

/**
 *
 * Escreva um programa para ler um valor e escrever a soma da sua tabuada de 1
 * até 10 Ex: Digite Numero 5 Soma da Tabuada = 275
 * 
 * 
 * @author Fernando B. Leonelli
 */
public class Lista04_exe06 {
    
    public static int calcula(int num){
        
        int i, mult=0;
        for (i=1; i<=10; i++){
            mult = mult + num*i;
        }
        
        return mult;
    }

    public static void main(String[] args) {
        
        String numero=null;
        
        
        try {
            numero = JOptionPane.showInputDialog(null, "INFORME UM NUMERO", "TABOADA", 3);           
            while("".equals(numero)){                
                numero = null;
                numero = JOptionPane.showInputDialog(null, "INFORME UM NUMERO", "TABOADA", 3);                
            }
            if (numero == null){
                System.exit(0);
            }
            int num = Integer.parseInt(numero);
            
            int result = calcula(num);
            
            JOptionPane.showMessageDialog(null, "A SOMA DA TABUADA DO NÚMERO "+num+" É IGUAL A "+result+".", "RESULTADO", 1);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "INFORME APENAS NÚMEROS INTEIROS!", "ERRO", 0);
        }
        }
}
