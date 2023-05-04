/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista03_ex03;

import javax.swing.JOptionPane;

/**
 *
 * @author labs
 */
public class Lista03_ex03 {

    public static void main(String[] args) {
        
        double a, b, trab;
        double nota, peso1=0.35, peso2=0.35, trabalho=0.3;
        
        try {
            String nota1 = JOptionPane.showInputDialog(null, "Informe a nota da P1", "P1", 3);
            nota1 = nota1.replace(",", ".");
            a = Double.parseDouble(nota1);
            
            String nota2 = JOptionPane.showInputDialog(null, "Informe a nota da P2", "P2", 3);            
            nota2 = nota2.replace(",", ".");            
            b = Double.parseDouble(nota2);
            
            String traba = JOptionPane.showInputDialog(null, "Informe a nota do Trabalho", "Trabalho", 3);
            traba = traba.replace(",", ".");
            trab = Double.parseDouble(traba);            
            
            nota = a*peso1 + b*peso2 + trab*trabalho;        
            JOptionPane.showMessageDialog(null, "Sua média é igual a "+ String.format("%.2f", nota)+".", "Media", 1);            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Informe apenas números!", "ERRO", 3);
        }
        
        
    }
}
