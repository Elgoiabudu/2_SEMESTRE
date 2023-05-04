/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.l5_exe02;

import javax.swing.JOptionPane;

/**
 *
 * @author labs
 */
public class L5_exe02 {

    public static void main(String[] args) {
        String A = JOptionPane.showInputDialog(null, "Informe o valor de A", "A", 1);
        String B = JOptionPane.showInputDialog(null, "Informe o valor de B", "B", 1);
        String C = JOptionPane.showInputDialog(null, "Informe o valor de C", "C", 1);
        
        double a = Double.parseDouble(A);
        double b = Double.parseDouble(B);
        double c = Double.parseDouble(C);
                
        
        Equacao equacao = new Equacao(a, b, c);     
        
        
        double delta = equacao.calcDelta();
        
        
        if(delta < 0){
            JOptionPane.showMessageDialog(null, "Não existem raizes reais!", "Raizes Não existem", 1);
        }else if(delta > 0){
            JOptionPane.showMessageDialog(null, "A raiz de R1 é igual a "+equacao.calcRaizes("R1"), "Raizes", 1);
            JOptionPane.showMessageDialog(null, "A raiz de R2 é igual a "+equacao.calcRaizes("R2"), "Raizes", 1);
        }
    }
}
