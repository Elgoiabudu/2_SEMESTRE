/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exe_03;

import java.util.Scanner;

/**
 *
 * @author labs
 * 
 * Faça um programa que leia dois valores e informe a média entre eles. (use float como tipo de dado).
 * 
 */

public class Exe_03 {

    public static void main(String[] args) {
        float v1, v2, media;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite a primeira nota: "); // prinln Exibe o texto e pula uma linha.
        v1 = input.nextFloat();
        
        System.out.println("Digite a segunda nota: ");
        v2 = input.nextFloat();
        
        media = (v1+v2)/2;
        
        System.out.printf("A media e igual a: %f", media);
    }
}
