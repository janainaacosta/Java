/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.swing.JOptionPane;

public class Pilha {

    private String[] nomes;
    private String[] idades;
    private int tamanho;
    private int topo;

    public Pilha(int capacidade) {
        nomes = new String[capacidade];
        idades = new String[capacidade];
        tamanho = 0;
        topo = -1;
    }

    public boolean cheia() {
        return topo == nomes.length - 1;
    }

    public boolean vazia() {
        return topo == -1;
    }

    public void push(String nome, String idade) {
        if (cheia()) {
            JOptionPane.showMessageDialog(null,
                    "A pilha está cheia.");
            return;
        } else {
            topo++;
            nomes[topo] = nome;
            idades[topo] = idade;
            tamanho++;
        }

    }

    public void pop() {
        if (vazia()) {
            JOptionPane.showMessageDialog(null,
                    "A pilha está vazia.");
            return;
        }
        topo--;
        tamanho--;
    }

    public void plotar() {
        if (vazia()) {
            JOptionPane.showMessageDialog(null,
                    "A pilha está vazia.");
            return;
        } else {
            String saida = "";
            String menu = "=-=-=-=-=-= Menu =-=-=-=-=-=\n";

            for (int i = topo; i >= 0; i--) {
                menu += "Nome: " + nomes[i] + ", Idade: " + idades[i] + "\n";
            }

            JOptionPane.showMessageDialog(null, menu);
        }

    }

    public void destrutor() {
        while (!vazia()) {
            pop();
        }
        JOptionPane.showMessageDialog(null,
                "A pilha foi destruída.");
    }
}
