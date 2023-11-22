package controller;

import javax.swing.JOptionPane;
import model.Recursao;

/**
 *
 * @author janaina.csilva64
 */
public class Menu {
    public static void main(String[] args) {
        String menu = "=-=-=-=-=-= Menu =-=-=-=-=-=\n";
            menu += "1 - soma lista  \n2 - gera Fibonacci  \n3 - fatorial duplo  \n4 - Sair";
            String item = JOptionPane.showInputDialog(null, menu);    
            
    switch (item){
                case "1": 
                    String inicio = "";
                    String fim = "";
                  
                    inicio = JOptionPane.showInputDialog(null, "inicio: ");
                    fim = JOptionPane.showInputDialog(null, "fim: ");
                    
                     int i = Integer.parseInt(inicio);
                    int f = Integer.parseInt(fim);

                    imprimirSoma(i, f);
                    
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