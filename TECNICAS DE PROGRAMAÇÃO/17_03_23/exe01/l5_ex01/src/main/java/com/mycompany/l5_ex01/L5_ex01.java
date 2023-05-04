/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.l5_ex01;

import javax.swing.JOptionPane;

/**
 *
 * @author labs
 */
public class L5_ex01 {

    public static void main(String[] args) {     
                        
        double v1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a base do triangulo:", "BASE", 3));
        double v2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a altura do triangulo:", "ALTURA", 3));
        
        Triangulo triangulo = new Triangulo(v1, v2);
        
        JOptionPane.showMessageDialog(null, "Area igual a "+String.format("%.2f", triangulo.calcArea()), "Area", 1);        
        
    }
}
