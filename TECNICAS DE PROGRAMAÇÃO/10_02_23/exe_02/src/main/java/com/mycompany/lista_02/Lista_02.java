/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lista_02;
import java.util.Scanner;

/**
 *
 * @author victorxavier
 * 2. Para vários tributos, a base de cálculo é o salário mínimo. Fazer um programa
 * que leia o valor do salário mínimo e o valor do salário de uma pessoa. Calcular
 * e mostrar quantos salários mínimos ela ganha.
 */
public class Lista_02 {

    public static void main(String[] args) {
        
        float salario_min, salario, qtde_salarios;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o seu salário: ");
        salario = input.nextInt();
        
        salario_min = 1302;
        
        qtde_salarios = salario / salario_min;
        
        System.out.printf("\nTotal de Salarios Minimos: %f", qtde_salarios);
        
    }
}
