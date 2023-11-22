/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

/**
 *
 * @author Janaina Costa
 */
import Model.Fifo_1;
import java.util.Random;
import javax.swing.JOptionPane;

public class UsaFifo_1 {
    
    public static void main(String[] args) {
        Fifo_1 fila = new Fifo_1();

        while (true) {
            String menu = "=-=-=-=-=-= Menu =-=-=-=-=-=\n";
            menu += "1 - Enfileirar número aleatório\n2 - Desenfileirar\n3 - Imprimir\n4 - Destruir\n5 - Sair";
            String item = JOptionPane.showInputDialog(null, menu);

            switch (item) {
                case "1":
                    Random gerar = new Random();
                    int x = gerar.nextInt(100) + 1;
                    fila.enfileirar(Integer.toString(x)); // Enqueue the random number as a string
                    JOptionPane.showMessageDialog(null, "Número aleatório enfileirado: " + x);
                break;

                case "2":
                    if (fila == null) {
                        JOptionPane.showMessageDialog(null, "A fila está vazia.");
                    } else {
                        fila.desenfileirar();
                        JOptionPane.showMessageDialog(null, "Desenfileirado!");
                    }
                break;

                case "3":
                    fila.imprimir();
                break;
                    
                case "4":
                    fila.destruir();
                    JOptionPane.showMessageDialog(null, "Destruido!");

                break;

                case "5":
                    JOptionPane.showMessageDialog(null, "Encerrado");
                    System.exit(0);

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
                break;
            }
        }
    }
}