/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp_08_ex_02;

import javax.swing.JFrame;
/**
 *
 * @author Fernando B. Leonelli
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
