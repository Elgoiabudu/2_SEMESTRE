/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exe_01;

import java.util.Scanner;

/**
 *
 * @author labs
 * 
 * Em época de pouco dinheiro, os comerciantes estão procurando aumentar suas vendas oferecendo desconto.  
 * Faça um programa que possa entrar com o nome de um produto e seu  valor unitário e calcular e exibir  
 * um novo valor com um desconto de 9%.
 * 
 */
public class Exe_01 {

    public static void main(String[] args) {
        
        double valor, desconto=0.91;
        String nomeProduto;
        
        Scanner input = new Scanner(System.in);
        
         System.out.println("Informe a descricao do produto: ");
         nomeProduto = input.next();
         
         System.out.println("Informe o vlaor do produto: ");
         valor = input.nextDouble();
         
         System.out.printf("\nO novo valor do produto e igual a %2f: ", valor*desconto);
    }
}
