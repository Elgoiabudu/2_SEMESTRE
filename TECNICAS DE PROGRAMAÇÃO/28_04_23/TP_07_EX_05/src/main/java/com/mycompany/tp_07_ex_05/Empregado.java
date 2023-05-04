/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp_07_ex_05;

/**
 *
 * @author Fernando B. Leonelli
 */
public class Empregado extends Pessoa {
    private double salario;

    public Empregado(String nome, int idade, double altura, String sexo, double salario) {
        super(nome, idade, altura, sexo);
        this.salario = salario;
    }

    public double obterLucros(){
        return this.salario;
    }
    
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
}
