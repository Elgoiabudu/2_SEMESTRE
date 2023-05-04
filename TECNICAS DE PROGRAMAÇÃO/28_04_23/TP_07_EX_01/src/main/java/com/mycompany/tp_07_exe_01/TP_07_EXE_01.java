/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp_07_exe_01;

import javax.swing.JOptionPane;

/**
 *
 * @author labs
 */
public class TP_07_EXE_01 {

    public static void main(String[] args) {
       
        int codigo=0;
        int quantidade=0;
        double preco=0;        
        String descItem;        
        
        try {
            String codItem = JOptionPane.showInputDialog(null, "Informe o código do produto:", "COD PROD", 3);
            codigo = Integer.parseInt(codItem);            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Valor Invalido", "ERRO", 0);
            System.exit(0);
        }
 
        do {            
            descItem = JOptionPane.showInputDialog(null, "Informe a descrição do produto:", "DESC PROD", 3);
            
        } while (descItem =="");
        
        try {
            String qtdeItem = JOptionPane.showInputDialog(null, "Informe a quantidade do produto:", "QTDE PROD", 3);
            quantidade = Integer.parseInt(qtdeItem);            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Valor Invalido", "ERRO", 0);
            System.exit(0);
        }
        
        try {
            String precoItem = JOptionPane.showInputDialog(null, "Informe o preço do produto:", "PRECO PROD", 3);
            preco = Double.parseDouble(precoItem);            
        } catch (NumberFormatException e) {
        }
        
        itemFaturado produto = new itemFaturado(codigo, quantidade, descItem, preco);
        
        
        JOptionPane.showMessageDialog(null, produto.getDescItem()+"\n"+produto.getQtdeItem()+" unidades."+"\n"+"Valor todal de R$ "+produto.getFaturarTotal()+".", "FATURA", 1);        
        
    }
}
