/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import javax.swing.JOptionPane;
import model.Pilha;

/**
 *
 * @author janaina.csilva64
 */
public class MinhaPilha {
    public static void main(String[] args) {
        Pilha p = null;
        
        while (true){
            String menu = "=-=-=-=- Menu Pilha Estática =-=-=-=-=-";
            menu += "\n 0 - inseri\n 1- push\n 2 - plotar\n 3 - pop\n 4 - destruir\n 5 - sair";
            String item = JOptionPane.showInputDialog(null, menu );
            
            switch (item){
            
                case "0":
                    String strn = JOptionPane.showInputDialog(null,
                            "Quantos elementos vc quer na pilha ?");
                    int n = Integer.parseInt(strn);
                    p = new Pilha(n);
                    break;
                    
                case "1": String num = JOptionPane.showInputDialog(null,
                        "Digite um valor: ");
                p.push(num);
                break;
                
                case "2":
                    p.plotar();
                break;
                
                case "3":
                    p.pop();
                break;
                
                case "4":
                    p.destrutor();
                break;
                
                case "5":
                    JOptionPane.showInputDialog(null,
                        "Encerrado.");
                break;
            
            }
        }     
    }
}
