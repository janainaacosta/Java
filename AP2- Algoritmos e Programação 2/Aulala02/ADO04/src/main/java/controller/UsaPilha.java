/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import javax.swing.JOptionPane;
import model.PilhaHeap;

/**
 *
 * @author janaina.csilva64
 */
public class UsaPilha {
    public static void main(String[] args) {
        PilhaHeap pil = new PilhaHeap();
        
        while(true){
            String menu = "=-=-=-=-=-= Menu =-=-=-=-=-=\n";
            menu += "1 - Push  \n2 - Pop  \n3 - Plotar  \n4 - Sair";
            String item = JOptionPane.showInputDialog(null, menu);
                        
            switch (item){
                case "1": 
                    
                    String nome = "",
                    nota1 = "",
                    nota2 = "";
                    
                    nome = JOptionPane.showInputDialog(null, "nome: ");
                    nota1 = JOptionPane.showInputDialog(null, "nota 1: ");
                    nota2 = JOptionPane.showInputDialog(null, "nota 2: ");
                    
                    int n1 = Integer.parseInt(nota1);
                    int n2 = Integer.parseInt(nota2);
                    
                    pil.push(nome, n1, n2);
                    
                    JOptionPane.showMessageDialog(null,  "Notas de " + nome + " adicionados.");
                break;  
                
                case "2":
                     if(pil == null){
                        JOptionPane.showMessageDialog(null,  "não há elementos para remover");
                    }
                    pil.pop();
                    JOptionPane.showMessageDialog(null,  "Elemento removido.");
                break;
                
                case "3":
                    pil.plotar();
                break;
                
                case "4":
                
                    JOptionPane.showMessageDialog(null,"Encerrado");
                return;

                default:
                JOptionPane.showMessageDialog(null,"Opção inválida.");
                break;                    
            }
        }
    }
}
