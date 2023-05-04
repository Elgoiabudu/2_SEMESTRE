/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.to07_exe_02;

import javax.swing.JOptionPane;
/**
 *
 * @author labs
 */
public class TO07_EXE_02 {

    public static void main(String[] args) {
        String nome, sobrenome;
        double salarioMensal;    
        
        try {
            nome = JOptionPane.showInputDialog(null, "Informe o nome do primeiro funcionario:");
            sobrenome = JOptionPane.showInputDialog(null, "Informe o sobrenome do segundo funcionario:");

            String salario = JOptionPane.showInputDialog(null, "Informe o Slario mensal do primeiro funcionario");
            salarioMensal = Double.parseDouble(salario);

            Empregado func1 = new Empregado(nome, sobrenome, salarioMensal);

            nome = JOptionPane.showInputDialog(null, "Informe o nome do segundo funcionario:");
            sobrenome = JOptionPane.showInputDialog(null, "Informe o sobrenome do segundo funcionario:");

            salario = JOptionPane.showInputDialog(null, "Informe o Slario mensal do segundo funcionario");
            salarioMensal = Double.parseDouble(salario);

            Empregado func2 = new Empregado(nome, sobrenome, salarioMensal);
            
            JOptionPane.showMessageDialog(null, "Salario anual de "+func1.getNome()+": R$ "+String.format("%.2f", func1.getSalarioAnual())+" mais 10% de almento fica: "+String.format("%.2f", func1.almento())+"."+"\n"+
            "Salario anual de "+func2.getNome()+": R$ "+String.format("%.2f", func2.getSalarioAnual())+" mais 10% de almento fica: "+String.format("%.2f", func2.almento())+".");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "VALOR INVALIDO");
        }
        
        
        
        
        
        
    }
}
