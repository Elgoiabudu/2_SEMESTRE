/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista04_exe04;

import java.lang.invoke.MethodHandles;
import javax.swing.JOptionPane;

/**
 *
 * Calcule o peso ideal de uma pessoa através de uma função que não retorne
 * valor. Dados de entrada: altura e sexo. Fórmulas para cálculo do peso: peso
 * ideal de homem = (72,7 x altura) - 58 peso ideal da mulher = (62,1 x altura)
 * - 44,7
 * 
 * 
 * @author Fernando B. Leonelli
 */
public class Lista04_exe04 {
    
    public static float pesoIdeal(float sexo, float altura){        
        
        
        float peso=0;
        
        if(sexo == 2){
            peso = ((float)72.7*altura)-(float)58;
        }else{
            peso = ((float)62.1*altura)-(float)44.7;
        }
        
        
        
        return peso;
    }

    public static void main(String[] args) {
        int escolha=0;        
        float altura=0;
        
        try {
            
            String sexo = JOptionPane.showInputDialog(null, "INFORME O SEXO:(1)FEMINIMO (2)MASCULINO", "SEXO", 3);
            while("".equals(sexo)){
                sexo = null;
                sexo = JOptionPane.showInputDialog(null, "INFORME O SEXO:(1)FEMINIMO (2)MASCULINO", "SEXO", 3);
            }
            if (sexo == null){
                System.exit(0);
            }
            escolha = Integer.parseInt(sexo);
            while(escolha <1 || escolha >2){                
                sexo = JOptionPane.showInputDialog(null, "INFORME O SEXO:(1)FEMINIMO (2)MASCULINO", "SEXO", 3);
                escolha = Integer.parseInt(sexo);
            }
            
            
            do {                
                String alturaIndividuo = JOptionPane.showInputDialog(null, "INFORME SUA ALTURA (EM METROS)", "ALTURA", 3);
                if(alturaIndividuo == null){
                    System.exit(0);
                }
                alturaIndividuo = alturaIndividuo.replaceAll(",", ".");
                altura = Float.parseFloat(alturaIndividuo);                
            } while (altura < 1);
            
            float peso = pesoIdeal(escolha, altura);
            
            JOptionPane.showMessageDialog(null, "O SEU PESO IDEAL É "+String.format("%.1f", peso)+"kg.", "PESO IDEAL", 1);
            
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "INFORME APENAS VALORES VALIDOS", "ERRO DE VALOR", 0);
        }
    }
}
