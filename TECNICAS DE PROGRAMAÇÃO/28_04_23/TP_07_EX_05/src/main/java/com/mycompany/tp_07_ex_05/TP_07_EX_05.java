/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp_07_ex_05;

import javax.swing.JOptionPane;

/**
 *
 * @author Fernando B. Leonelli
 */
public class TP_07_EX_05 {

    public static void main(String[] args) {
        
        String dados = JOptionPane.showInputDialog(null, "Informe o nome:");
        String nome = dados;
        dados = JOptionPane.showInputDialog(null, "Informe a idade:");
        int idade = Integer.parseInt(dados);
        dados = JOptionPane.showInputDialog(null, "Informe a altura:");
        dados = dados.replaceAll(",", ".");
        double altura  = Double.parseDouble(dados);
        dados = JOptionPane.showInputDialog(null, "Informe o sexo:");
        String sexo = dados;
        dados = JOptionPane.showInputDialog(null, "Informe o salário:");
        dados = dados.replaceAll(",", ".");
        double salario  = Double.parseDouble(dados);
        
        Empregado empregado = new Empregado(nome, idade, altura, sexo, salario );
        
        JOptionPane.showMessageDialog(null, "Salario de "+empregado.getNome()+", é igual a R$ "+String.format("%.2f", empregado.obterLucros())+".");
        
    }
}
