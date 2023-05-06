/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.tp_08_ex_02;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author labs
 */
public class TP_08_EX_02 {

    private JFrame janela;
    private JPanel painelPrincipal, painelLimpar;
    private TextField visor;

    public static void main(String[] args) {
        new TP_08_EX_02().montaTela();
    }

    private void montaTela() {
        preparaJanela();
        mostraJanela();        
        //preparaPainelLimpar();
        //preparaVisor();
        //btn1();
        //btn2();
        //preparaLabel();
        //preparaBotoes();
    }

    private void preparaJanela() {
        janela = new JFrame("Teclado Celular");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //setLayout(new BorderLayout());
        
        JButton btn1 = new JButton("1");
        JButton btn2 = new JButton("1");
        JButton btn3 = new JButton("1");
        JButton btn4 = new JButton("1");
        JButton btn5 = new JButton("1");
        JButton btn6 = new JButton("1");
        JButton btn7 = new JButton("1");
        JButton btn8 = new JButton("1");
        JButton btn9 = new JButton("1");
        JButton btn10 = new JButton("1");
        JButton btn11 = new JButton("1");
        JButton btn12 = new JButton("1");
        
        
        
        painelPrincipal = new JPanel();
        painelPrincipal.setLayout(new GridLayout(4,3)); 
        janela.add(painelPrincipal, BorderLayout.CENTER);
        
        painelLimpar = new JPanel(new FlowLayout());        
        janela.add(painelLimpar, BorderLayout.SOUTH);
        
        painelPrincipal.add(btn1);
        painelPrincipal.add(btn2);
        painelPrincipal.add(btn3);
        painelPrincipal.add(btn4);
        painelPrincipal.add(btn5);
        painelPrincipal.add(btn6);
        painelPrincipal.add(btn7);
        painelPrincipal.add(btn8);
        painelPrincipal.add(btn9);
        painelPrincipal.add(btn10);
        painelPrincipal.add(btn11);
        painelPrincipal.add(btn12);
        
        
    }

    private void mostraJanela() {
        janela.pack();
        janela.setSize(600, 300);
        janela.setVisible(true);
    }

    private void preparaVisor() {
        visor = new TextField("");
        painelPrincipal.add(visor);
    }

    private void btn1() {
        JButton btn = new JButton("1");
        adicionar(btn);        
        painelPrincipal.add(btn);//adiciona botão ao painel
    }
    
    
    private void adicionar(JButton btn) {
        btn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                visor.setText(visor.getText() + btn.getText());
            }
        });

    }
}
