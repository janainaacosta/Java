/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.swing.JOptionPane;

/**
 *
 * @author janaina.csilva64
 */
public class PilhaHeap {
    public NoPilha topo;
    public int cont;

    public PilhaHeap() {
        this.topo = null;
        this.cont = 0;
    }
    
    //método que empilha dados da pilha Heap
    public void push (Object nome, int n1, int n2){
        NoPilha newPilha = new NoPilha();
        
        double media = 0;
        
        // preencher atributos internos dos dados 
        newPilha.valor1 = nome;
        newPilha.valor2 = n1;
        newPilha.valor3 = n2;
        
        media = (n1 + n2)/ 2;
        newPilha.valor4 = media;
        
        // configurar as variáveis de instância da ligação 
        if(topo == null)
        {
            newPilha.ant = null;
        }
        else
        {
            newPilha.ant = topo;
        }
        
        topo = newPilha;
        cont ++;
    }
    
    public void pop(){
        if(topo == null)
        {
            JOptionPane.showMessageDialog(null, "A pilha já está vazia.");
            return;
        }
        
        NoPilha temp = topo; 
        
        topo = temp.ant; // o novo topo será o anterior
        temp = null;
        cont --; // diminui os elementos empilhados 
    }
    
    public void plotar(){
        if(topo == null) return;
        NoPilha temp = topo;
        String saida = "";
        
        while(temp != null){
            saida += temp.valor1 + "\nnota 1 -> ";
            saida += temp.valor2 + "\nnota 2 -> ";
            saida += temp.valor3 + "\nmédia ";
            saida += temp.valor4 + "\n -------------------------------- \n";
            temp = temp.ant;
        }
        JOptionPane.showMessageDialog(null, saida);

    }
        
}
