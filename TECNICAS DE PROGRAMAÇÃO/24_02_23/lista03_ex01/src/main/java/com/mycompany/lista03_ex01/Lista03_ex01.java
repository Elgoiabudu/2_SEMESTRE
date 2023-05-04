/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista03_ex01;

import javax.swing.JOptionPane;

/**
 *
 * @author labs
 */
public class Lista03_ex01 {
    
    public static void pares(){
        double a, b, i, f;
        
        try{
            
        String ini = JOptionPane.showInputDialog(null, "Escolha o inicio do intervalo:", "Numeros Pares!", 3);
        a = Double.parseDouble(ini);
        String fim = JOptionPane.showInputDialog(null, "Escolha o final do intervalo:", "Numeros Pares!", 3);
        b = Double.parseDouble(fim);        
        
            if (a>b){
                JOptionPane.showMessageDialog(null, "Inicio maior que o fim! Comece denovo!", "ERRO!", 3);
                pares();
            }else if(a<0 || b<0){
                JOptionPane.showMessageDialog(null, "Escolha valores maior que zero!", "ERRO!", 3);
                pares();
            }else if(a==0 && b==0){
                JOptionPane.showMessageDialog(null, "Intervalo Inválido!", "ERRO!", 3);
                pares();
            }
            
            while(a<b){
                
                if(a%2==0){                
                System.out.println(a);                
                }
                a+=1;
            }
            
        }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "TESTE", "TESTE", 3);
        }
        
    }

    public static void main(String[] args) {        
        pares();
    }
}
