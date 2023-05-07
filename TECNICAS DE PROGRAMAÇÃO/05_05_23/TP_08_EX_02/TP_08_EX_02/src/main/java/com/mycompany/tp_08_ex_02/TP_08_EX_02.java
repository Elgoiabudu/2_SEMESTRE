/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp_08_ex_02;

import javax.swing.JFrame;
/**
 *
 * @author Fernando B. Leonelli
 * 
 * Elabore  um  frame  que  simule  o teclado  de um  telefone  digital,  de acordo com  a Figura.A cada tecla pressionada o númeroé acumulado  
 * na caixa de texto. O botão Limpar  apaga todos os números  digitados.
 * 
 */
public class TP_08_EX_02 {

    public static void main(String[] args) {
        Telefone telefone = new Telefone();
        telefone.setSize(170, 225);        
        telefone.setResizable(false);
        telefone.setLocationRelativeTo(null);
        telefone.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        telefone.setVisible(true);
    }
}
