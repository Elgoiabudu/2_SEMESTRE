/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp_07_exe_01;

/**
 *
 * @author labs
 */
public class itemFaturado {
    
    private int numItem;
    private int qtdeItem;
    private String descItem;
    private double precoItem;

    public itemFaturado(int numItem, int qtdeItem, String descItem, double precoItem) {
        this.numItem = numItem ;
        this.qtdeItem = qtdeItem > 0 ? qtdeItem : 0;
        this.descItem = descItem;
        this.precoItem = precoItem > 0 ? precoItem : 0;
    }

    public itemFaturado() {
    }    
    
    public int getNumItem() {
        return numItem;
    }

    public int getQtdeItem() {
        return qtdeItem;
    }

    public String getDescItem() {
        return descItem;
    }

    public double getPrecoItem() {
        return precoItem;
    }

    public void setNumItem(int numItem) {
        this.numItem = numItem;
    }

    public void setQtdeItem(int qtdeItem) {
        
        
        
        this.qtdeItem = qtdeItem;
    }

    public void setDescItem(String descItem) {
        this.descItem = descItem;
    }

    public void setPrecoItem(double precoItem) {
        this.precoItem = precoItem;
    }
    
    public double getFaturarTotal(){
        return precoItem * qtdeItem;
    }
    
        
}
