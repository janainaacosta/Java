/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Janaina Costa
 */
import javax.swing.JOptionPane;
public class Fifo_1 {
// Criando o sentinetas

    NoFifo_1 Primeiro = null;
    NoFifo_1 Ultimo = null;

    public void enfileirar(String dado) {
        NoFifo_1 newFila = new NoFifo_1();
        // atributos de dados
        newFila.dado = dado;
        newFila.prox = null;

        if (Primeiro == null) {
            Primeiro = newFila;
        } else {
            Ultimo.prox = newFila;
        }

        Ultimo = newFila;
    }

    public void desenfileirar() {
        if ( Primeiro == null ) {
            JOptionPane.showMessageDialog(null, "Fila Vazia!");
            return;
        }

        NoFifo_1 temp = Primeiro;
        Primeiro = temp.prox; // O segundo é o primeiro
        temp = null;
    }

    public void imprimir() {
        
        if ( Primeiro == null ) {
            JOptionPane.showMessageDialog(null, "Não há elementos para imprimir!");
            return;
        }
         
        NoFifo_1 aux = Primeiro;
        String saida = "";
        int contador = 1;
        while ( aux != null) {
            saida += contador + "°: " + aux.dado + "\n";
            aux = aux.prox; // percorrer a estrutura
            contador ++;
        }
       
        JOptionPane.showMessageDialog(null, saida);
    }
    
    public void destruir() {
        Primeiro = null;
        Ultimo = null;
    }
}