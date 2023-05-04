/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.l5_exe02;

/**
 *
 * @author labs
 */
public class Equacao {
    private double A;
    private double B;
    private double C;   

    public Equacao(double A, double B, double C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }

    public double getA() {
        return A;
    }

    public double getB() {
        return B;
    }

    public double getC() {
        return C;
    }

    public void setA(int A) {
        this.A = A;
    }

    public void setB(int B) {
        this.B = B;
    }

    public void setC(int C) {
        this.C = C;
    }
    
    public double calcDelta(){        
        return  this.B*this.B-4*this.A*this.C;
    }
    
    public double calcRaizes(String tipo){
        
        if(tipo.equals("R1")){
            return ((this.B*-1)+(Math.sqrt(calcDelta())))/(2*this.A);
        }else if(tipo.equals("R2")){
            return ((this.B*-1)-(Math.sqrt(calcDelta())))/(2*this.A);
        }else{
            return 0;
        }
    }
}
