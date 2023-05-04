/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista04_exe_02;

import java.text.Format;
import java.util.Collections;
import javax.swing.JOptionPane;

/**
 *Ler número  da  conta  do  cliente,  saldo,  débito e  crédito.  Após,  calcular  e  escrever  o saldo  atual  (saldo  atual  =  saldo -débito  +  crédito),  
 *através  de  uma  função  que  retorne valor, também testar se saldo atual for maior ou igual a zero escrever a mensagem 'Saldo Positivo', senão escrever a mensagem 'Saldo Negativo
 * @author labs
 */
public class Lista04_exe_02 {
    
    public static float calculo(float saldo, float debito, float credito){
        float saldoAtual = saldo-debito+credito;
        return saldoAtual;
    }

    public static void main(String[] args) {  
        
        try {
            
            String numConta = JOptionPane.showInputDialog(null, "Informe o numero da conta. ", "Num. Conta", 1);                                    
            while("".equals(numConta)){
                JOptionPane.showMessageDialog(null, "INFORME UM VALOR VALIDO!", "ERRO", 3);                
                numConta = JOptionPane.showInputDialog(null, "Informe o numero da conta", "nome", 1);
            }            
            if(numConta==null){
               System.exit(0);
            }
            
            
            String saldoConta = JOptionPane.showInputDialog(null, "Informe o saldo atual!", "Saldo", 1);            
            while("".equals(saldoConta)){
                JOptionPane.showMessageDialog(null, "INFORME UM VALOR VALIDO!", "ERRO", 3);
                saldoConta = JOptionPane.showInputDialog(null, "Informe o saldo atual!", "Saldo", 1);
            }            
            if(saldoConta == null){
               System.exit(0); 
            }
            saldoConta = saldoConta.replaceAll(",", ".");
            float saldo = Float.parseFloat(saldoConta);            
            
            
            String debConta = JOptionPane.showInputDialog(null, "Quanto deseja debitar?", "Débito", 1);            
            while("".equals(debConta)){
                JOptionPane.showMessageDialog(null, "INFORME UM VALOR VALIDO!", "ERRO", 3);
                debConta = JOptionPane.showInputDialog(null, "Quanto deseja debitar?", "Débito", 1);            
            }
            if(debConta == null){
                System.exit(0);
            }            
            debConta = debConta.replaceAll(",", ".");
            float debito = Float.parseFloat(debConta);
            
            
            String credConta = JOptionPane.showInputDialog(null, "Quanto deseja Creditar?", "Crédito", 1);
            while("".equals(credConta)){
                JOptionPane.showMessageDialog(null, "INFORME UM VALOR VALIDO!", "ERRO", 3);
                credConta = JOptionPane.showInputDialog(null, "Quanto deseja Creditar?", "Crédito", 1);
            }
            if(credConta == null){
                System.exit(0);
            }
            credConta = credConta.replaceAll(",", ".");
            float credito = Float.parseFloat(credConta);
            
            float novoSaldo = calculo(saldo, debito, credito);           
            
            
            if(novoSaldo == 0){
                JOptionPane.showMessageDialog(null, "Seu saldo é igual a R$ 0.00!", "Saldo ZERO!", 1);
            }else if(novoSaldo <0){
                JOptionPane.showMessageDialog(null, "Seu saldo é R$ "+String.format("%.2f", novoSaldo)+" NEGATIVO!", "Saldo NEGATIVO!", 1);
            }else{
                JOptionPane.showMessageDialog(null, "Seu saldo é de R$ "+String.format("%.2f", novoSaldo)+".", "Saldo POSITIVO!", 1);
            }
            
        } catch (NumberFormatException  e) {
            JOptionPane.showMessageDialog(null, "VALORES INCORRETOS", "ERRO", 3);
        }
        
    }
}
