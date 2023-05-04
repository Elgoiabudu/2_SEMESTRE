/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.l5_exe03;

import javax.swing.JOptionPane;

/**
 *
 * @author labs
 */
public class L5_exe03 {

    public static void main(String[] args) {
        int dia = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o dia de hoje:", "Dia", 1));
        int mes = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o mes atual:", "Dia", 1));
        int ano = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o ano atual:", "Dia", 1));

        Pessoa isaacNewton = new Pessoa("Issac Newton");
        Pessoa alberEinstein = new Pessoa("ALbert Einstein");
        
        isaacNewton.ajustaDataDeNascimento(4, 1, 1643);
        isaacNewton.calculaIdade(dia, mes, ano);
        
        alberEinstein.ajustaDataDeNascimento(14, 3, 1879);
        alberEinstein.calculaIdade(dia, mes, ano);      

        JOptionPane.showMessageDialog(null, isaacNewton.informaNome()+" teria, hoje, "+isaacNewton.retornaIdade()+" anos.", isaacNewton.informaNome(), 2);
        JOptionPane.showMessageDialog(null, alberEinstein.informaNome()+" teria, hoje, "+alberEinstein.retornaIdade()+" anos.", alberEinstein.informaNome(), 2);
    }
}
