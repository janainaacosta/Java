/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import javax.swing.JOptionPane;
import Model.Recursao;

/**
 *
 * @author janaina.csilva64
 */
public class Menu {
    public static void main(String[] args) {
        String menu = "=-=-=-=-=-= Menu =-=-=-=-=-=\n";
            menu += "1 - soma lista  \n2 - gera Fibonacci  \n3 - fatorial duplo  \n4 - Sair";
            String item = JOptionPane.showInputDialog(null, menu);    }
            
    switch (item){
                case "1": 
                    String inicio = "";
                    String fim = "";
                  
                    inicio = JOptionPane.showInputDialog(null, "inicio: ");
                    fim = JOptionPane.showInputDialog(null, "fim: ");

                    imprimirSoma(inicio, fim);
                    
                break;  
                
         
                case "4":
                
                    JOptionPane.showMessageDialog(null,"Encerrado");
                return;

                default:
                JOptionPane.showMessageDialog(null,"Opção inválida.");
                break;                    
            }
}
