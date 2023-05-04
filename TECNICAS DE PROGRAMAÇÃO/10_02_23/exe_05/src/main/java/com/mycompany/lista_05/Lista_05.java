/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lista_05;
import java.util.Scanner;
import java.lang.Math;


/**
 *
 * @author victorxavier
 * 5. Calcular e apresentar o valor do volume de uma lata de óleo, utilizando a
 * fórmula:
 * VOLUME = 3.14159 * R2 * ALTURA
 */
public class Lista_05 {

    public static void main(String[] args) {
        
        double raio, altura, pi=3.14159;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe o raio: ");
        raio = input.nextDouble();
        
        System.out.println("Informe a altura: ");
        altura = input.nextDouble();
        
        System.out.printf("O volume é: %2f", pi * Math.pow(raio, 2) * altura);
    }
}
