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
            menu += "1 - Push  \n2 - POP  \n3 - Plotar  \n4 - Sair";
            String item = JOptionPane.showInputDialog(null, menu);
                        
            switch (item){
                case "1": 
                    String nome = JOptionPane.showInputDialog(null, "nome: ");
                    pil.push(nome);
                    
                    JOptionPane.showMessageDialog(null,  "Elemento " + nome + " adicionado");
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
        
        /*
        pil.push("a");
        pil.plotar();
        pil.push("b");
        pil.plotar();
        pil.push("c");
        pil.plotar();
        
        pil.pop(); pil.plotar();
        pil.pop(); pil.plotar();
        pil.pop(); pil.plotar();
        pil.pop(); pil.plotar();
        */
    }
}
