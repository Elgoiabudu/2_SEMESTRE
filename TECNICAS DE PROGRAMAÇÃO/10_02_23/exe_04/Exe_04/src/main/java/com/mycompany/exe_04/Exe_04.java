/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exe_04;

import java.util.Scanner;

/**
 *
 * @author labs
 * 
 * Faça  um  programa  que  leia    uma  temperatura  em  graus  Centígrados  e apresente-a convertida em graus Fahrenheit.  
 * A fórmula de conversão é: 
 * F = (9 * C + 160) / 5, onde F é a temperatura em Fahrenheit e C em graus Centígrados.
 * 
 * 
 */
public class Exe_04 {

     public static void main(String[] args) {
        double c, f;        
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o valor da temperatura em graus Celcius: "); // prinln Exibe o texto e pula uma linha.
        c = input.nextDouble();      
        
        f=(9 * c + 160) / 5;
        
        System.out.printf("\nO valor em Fahrenheit e igual a: %2f", f);
        
    }
}
