/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.to07_exe_02;

/**
 *
 * @author labs
 */
public class Empregado {    
    
    private String nome;
    private String sobreNome;
    private double salario;

    public Empregado(String nome, String sobreNome, double salario) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.salario = salario > 0 ? salario : 0;
    }

    public Empregado() {
    }

    public String getNome() {
        return nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public double getSalario() {
        return salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }  
    
    public double getSalarioAnual(){
        return salario * 12;
    }
    
    public double almento(){
        return salario * 12 * 1.1;
    }
    
}
