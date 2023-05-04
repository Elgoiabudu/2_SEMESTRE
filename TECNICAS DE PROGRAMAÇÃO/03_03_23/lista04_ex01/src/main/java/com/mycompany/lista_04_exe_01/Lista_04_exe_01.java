/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_04_exe_01;

import java.text.Format;
import java.util.Collections;
import javax.swing.JOptionPane;

/**
 *
 *1)  Lero  nome  de  um  produto,  o  preço  e  a  quantidade  comprada.  Escreva  o  nome  do produto comprado e o valor total a ser pago, 
 * considerando que são oferecidos descontos pelo número de unidades compradas, segundo a tabela abaixo:
 * a) Até 10 unidades: valor total
 * b) De 11 a 20 unidades: 10% de desconto
 * c) De 21 a 50 unidades: 20% de desconto
 * d) Acima de 50 unidades: 25% de desconto
 * Calcular o valor total a ser pago através de uma função que retorna valor
 */
public class Lista_04_exe_01 {

    public static float produto(float qtde, float preco){
        
        float valorTotal = 0;       
        
        if(qtde > 0 && qtde <=10){
            valorTotal = qtde*preco;
        }else if(qtde > 10 && qtde <=20){
            valorTotal = qtde*preco*(float)0.9;
        }else if(qtde > 20 && qtde <= 50){
            valorTotal = qtde*preco*(float)0.8;
        }else if(qtde > 50){
            valorTotal = qtde*preco*(float)0.75;
        }
        
        return valorTotal;
    }
    
    
    public static void main(String[] args) {
        
        float preco, qtde;
        
        String nomeProduto, precoProduto, qtdeProduto;
        
        try {
            
            nomeProduto = JOptionPane.showInputDialog(null, "Informe o nome do produto!", "Nome.", 1);                        
            nomeProduto = nomeProduto.toUpperCase();
            if("".equals(nomeProduto)){
            throw new Exception("TextoVazio");
            }
            
            precoProduto = JOptionPane.showInputDialog(null, "Qual o valor do produto?", "Valor", 1);            
            precoProduto = precoProduto.replaceAll(",", ".");
            preco = Float.parseFloat(precoProduto);            
            qtdeProduto = JOptionPane.showInputDialog(null, "Informe a quantidade a ser comprada.", "Quantidade", 1);
            qtde = Integer.parseInt(qtdeProduto);
            
            float teste = produto(preco, qtde);

            JOptionPane.showMessageDialog(null, "A sua compra de "+qtde+" "+nomeProduto+" teve um valor igual a R$ "+String.format("%.2f", teste)+".", "Resultado", 2);
        }catch (NumberFormatException e ) {
            JOptionPane.showMessageDialog(null, "Valores Incorretos!", "ERRO!", 3);            
        }catch(Exception TextoVazio){
            JOptionPane.showMessageDialog(null, "Valores Incorretos!", "ERRO!", 3);            
        }
    }   
}
