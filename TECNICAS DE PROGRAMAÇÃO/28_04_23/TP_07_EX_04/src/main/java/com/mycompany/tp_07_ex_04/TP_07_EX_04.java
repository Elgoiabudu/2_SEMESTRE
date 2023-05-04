


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp_07_ex_04;

import java.util.Scanner;
/**
 *
 * @author Fernando B. Leonelli
 */
public class TP_07_EX_04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o dia:");
        int dia  = Integer.parseInt(sc.nextLine());
        
        System.out.println("Digite o mês");
        int mes  = Integer.parseInt(sc.nextLine());
        
        System.out.println("Digite o ano:");
        int ano  = Integer.parseInt(sc.nextLine());
        
        System.out.println("");
        
        Data date = new Data(dia, mes, ano);
        
        date.MostrarData();
        
        sc.close();
    }
}
