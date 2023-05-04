/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista03_exe02;

import javax.swing.JOptionPane;

/**
 *
 * @author labs
 */
public class Lista03_exe02 {
    
    public static void fibonacci(int n){
        
        int i=3, fib1 = 0, fib2 = 1, soma;
        
        
        try {
            
            if(n==0){
            JOptionPane.showMessageDialog(null, "Informe um valor maior que zero!", "erro", 3);            
            }        
            else if(n==1){
                System.out.println("0");
            }else if(n==2){
                System.out.println("0");
                System.out.println("1");
            }else if(n>2){
            
                System.out.println(fib1);
                System.out.println(fib2);            

                for(i = 3; i <= n; i++){
                    soma = fib1 + fib2;
                    fib1=fib2;
                    fib2=soma;
                    System.out.println(fib2);
                }
        }
            
        } catch (NumberFormatException e) {
            System.out.println("TESTE");
        }
            
            
        
        
        
        
    }

    public static void main(String[] args) {
        
        int valor;
        
        String a = JOptionPane.showInputDialog(null, "Informe até que termo fibonacci vc deseja ver?", "Fibonacci", 3);
        
        valor = Integer.parseInt(a);
        
        try {
            valor/=2;
            fibonacci(valor);
        } catch (NumberFormatException e) {
            System.out.println("TESTE");
        }
        
        
        
    }
}
