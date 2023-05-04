/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista04_exe05;

import javax.swing.JOptionPane;

/**
 * 
 * ) Num determinado Estado, para transferências de veículos, o DETRAN cobra uma
 * taxa de 1% para carros fabricados antes de 1990 e uma taxa de 1.5% para os
 * fabricados de 1990 em diante, taxa esta incidindo sobre o valor de tabela do
 * carro. O projeto deve ler o ano e o preço do carro e a seguir calcular e
 * exibir o imposto a ser pago, através de uma função que retorne valor.
 *
 * @author Fernando B. Leonelli
 */
public class Lista04_exe05 {
    
    public static float imposto(int ano, float valor){
        float imposto =0;
        
        if (ano < 1990){
            imposto = valor*(float)0.01;
        }else{
            imposto = valor*(float)0.015;
        }        
        
        return imposto;
    }

    public static void main(String[] args) {
        
        try {            
            String anoCarro = JOptionPane.showInputDialog(null, "INFORME O ANO DO CARRO", "ANO", 3);
            while("".equals(anoCarro)){                
                anoCarro = null;
                anoCarro = JOptionPane.showInputDialog(null, "INFORME O ANO DO CARRO", "ANO", 3);
            }
            if(anoCarro == null){
                System.exit(0);
            }
            int ano = Integer.parseInt(anoCarro);

            String valorCarro = JOptionPane.showInputDialog(null, "INFORME O VALOR DE TABELA DO CARRO", "VALOR", 3);
            while("".equals(valorCarro)){
                valorCarro = null;
                valorCarro = JOptionPane.showInputDialog(null, "INFORME O VALOR DE TABELA DO CARRO", "VALOR", 3);
            }
            if(valorCarro == null){
                System.exit(0);
            }
            float valor = Float.parseFloat(valorCarro);
            
            if (ano <= 1900 || valor <= 0){
                throw new Exception("ValorInvalido");
            }

            float valorVenda = imposto(ano, valor);
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "INFORME APENAS NÚMEROS!", "ERRO", 0);
        } catch (ArithmeticException e){
            JOptionPane.showMessageDialog(null, "INFORME APENAS NÚMEROS!", "ERRO", 0);
        } catch (Exception ValorInvalido) {
            JOptionPane.showMessageDialog(null, "INFORME APENAS VALORES VALIDOS", "ERRO", 0);
        }
        
        
        
        
    }
}
