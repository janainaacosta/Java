/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Pilha;
import javax.swing.JOptionPane;

public class MinhaPilha {

    public static void main(String[] args) {
        Pilha pilha = null;

        while (true) {
            String menu = "=-=-=-=-=-= Menu =-=-=-=-=-=\n";
            menu += "1 - Criar Pilha \n2 - Push \n3 - Pop \n4 - Plotar \n5 - Destruir \n6 - Sair";
            String item = JOptionPane.showInputDialog(null, menu);

            switch (item) {
                case "1":

                    String strn = JOptionPane.showInputDialog(null, "Quantos elementos você quer na pilha ?");

                    if (strn != null && !strn.equals("")) { 
                        int n = Integer.parseInt(strn);
                        pilha = new Pilha(n);

                        JOptionPane.showMessageDialog(null, "Lista criada com " + n + " casas.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Elemento inválido!");
                    } 
                    // sugestao

                    break;

                case "2":
                    String nome = "",
                     idade = "";

                    if (pilha == null) {
                        JOptionPane.showMessageDialog(null,
                                "Crie a pilha antes de inserir elementos.");
                    } else {
                        nome = JOptionPane.showInputDialog(null,
                                "Nome: ");

                        idade = JOptionPane.showInputDialog(null,
                                "Idade: ");

                        pilha.push(nome, idade);
                    }

                    break;

                case "3":
                    if (pilha == null) {
                        JOptionPane.showMessageDialog(null,
                                "Crie a pilha antes de desempilhar.");
                        break;
                    }

                    pilha.pop();
                    break;

                case "4":
                    if (pilha == null) {
                        JOptionPane.showMessageDialog(null,
                                "Crie a pilha antes de plotar a lista.");
                        break;
                    }

                    pilha.plotar();
                    break;

                case "5":
                    if (pilha == null) {
                        JOptionPane.showMessageDialog(null,
                                "Crie a pilha antes de destruir a lista.");
                        break;
                    }
                    pilha.destrutor();
                    pilha = null;
                    break;

                case "6":
                    JOptionPane.showMessageDialog(null,
                            "Encerrado");
                    return;

                default:
                    JOptionPane.showMessageDialog(null,
                            "Opção inválida.");
                    break;
            }
        }
    }
}
