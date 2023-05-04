/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista04_exe03;

import javax.swing.JOptionPane;

/*
 *Dados três valores X, Y e Z, verificar se eles podem ser os comprimentos dos
 * lados de um triângulo , através de uma função que retorne valor, e, se forem
 * verificar se é um triângulo equilátero, isósceles ou escalenos. Se eles não
 * formarem um triângulo, escrever a mensagem. Considere as seguintes
 * propriedades: • O comprimento de cada lado em um triângulo é menor que a soma
 * dos outros dois lados; • Equiláteros: tem os comprimentos dos três lados
 * iguais; • Isósceles: tem os comprimentos de dois lados iguais; • escaleno:
 * tem os comprimentos dos três lados diferentes.
 * 
 * 
 * @author Fernando B. Leonelli
 */
public class Lista04_exe03 {
    
    
    
    public static int triangulo(float a, float b, float c){
    int retorno = 0;     
    
    
    // VERIFICANDO SE É UM TRIANGULO    
    if(a < b+c || b < a+c || c < a+b){
        retorno = 0;
    }
    
    // VERIFICANDO SE É EQUILÁTERO
    if (a == b && b==c){
        retorno = 1;
    }else{
        //VERIFICANDO SE É ISÓSCELES
        if((a == b || a == c || b == c)){
        retorno = 2;
        }
    }

    //VERIFICANDO SE É ESCALENO
    if(a != b && b != c && c != a){
        retorno = 3;
    }
    
    if (a<1 || b<1|| c<1){
        retorno = 0;
    }
    
    //RETORNANDO O RESULTADO
    return retorno;
    }

    public static void main(String[] args) {
        
        int verifica;
        
        try {
            //SOLICITANDO OS QUE O USUARIO INFORME OS TRES LADOS PARA A VERIFICACAO (WHILE'S E IF'S ESTÃO TRATANDO ENTRADAS VAZIAS
            String ladoA = JOptionPane.showInputDialog(null, "INFORME O VALOR DO PRIMEIRO LADO", "LADO A", 3);
            
            while("".equals(ladoA)){
                ladoA = JOptionPane.showInputDialog(null, "INFORME O VALOR DO PRIMEIRO LADO", "LADO A", 3);
            }
            if(ladoA == null){
                System.exit(0);
            }        
            ladoA = ladoA.replaceAll(",", ".");
            float a = Float.parseFloat(ladoA);

            String ladoB = JOptionPane.showInputDialog(null, "INFORME O VALOR DO SEGUNDO LADO", "LADO B", 3);
            while("".equals(ladoB)){
                ladoB = JOptionPane.showInputDialog(null, "INFORME O VALOR DO SEGUNDO LADO", "LADO B", 3);
            }
            if(ladoB == null){
                System.exit(0);
            }
            ladoB = ladoB.replaceAll(",", ".");
            float b = Float.parseFloat(ladoB);

            String ladoC = JOptionPane.showInputDialog(null, "INFORME O VALOR DO TERCEIRO LADO", "LADO C", 3);
            while("".equals(ladoC)){
                ladoC = JOptionPane.showInputDialog(null, "INFORME O VALOR DO TERCEIRO LADO", "LADO C", 3);
            }
            if(ladoC == null){
                System.exit(0);
            }
            ladoC = ladoC.replaceAll(",", ".");
            float c = Float.parseFloat(ladoC);

            //VARIAVEL UTILIZANDO O MÉTODO DE VERIFICAÇÃO
            verifica = triangulo(a, b, c);

            //SWITCH DE RESPOSTAS
            switch (verifica) {
                case 0:
                    JOptionPane.showMessageDialog(null, "MEDIDAS INCOMPATIVEIS COM UM TRIANGULO!", "TRIANGULO INEXISTENTE", 2);
                    break;

                case 1:
                    JOptionPane.showMessageDialog(null, "TRATA-SE DE UM TRIANGULO EQUILATERO!", "TRIANGULO EQUILATERO", 2);
                    break;                
                case 2:
                    JOptionPane.showMessageDialog(null, "TRATA-SE DE UM TRIANGULO ISOSCELES!", "TRIANGULO ISOSCELES", 2);
                    break;

                case 3:
                    JOptionPane.showMessageDialog(null, "TRATA-SE DE UM TRIANGULO ESCALENO!", "TRIANGULO ESCALENO", 2);
                    break;                

                default:
                    throw new AssertionError();
            }
        
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "INFORME APENAS NÚMEROS", "ERRO DE VALOR", 2);            
        }
    }
        
        
        
        
    }

