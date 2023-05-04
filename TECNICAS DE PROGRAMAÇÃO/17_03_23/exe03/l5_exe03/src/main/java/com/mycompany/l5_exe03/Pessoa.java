/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.l5_exe03;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author labs
 */
public class Pessoa {
    private String nome;
    private int idade;
    private int dia;
    private int mes;
    private int ano;

    public Pessoa(String nome) {
        this.nome = nome;        
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public void calculaIdade(int dia, int mes, int ano){
        this.idade = Period.between(LocalDate.of(this.ano, this.mes, this.dia), LocalDate.of(ano, mes, dia)).getYears();
    }
    
    public void ajustaDataDeNascimento(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano =ano;
    }
    
    public int retornaIdade(){
        return idade;
    }
    
    public String informaNome(){
        return nome;
    }
}
