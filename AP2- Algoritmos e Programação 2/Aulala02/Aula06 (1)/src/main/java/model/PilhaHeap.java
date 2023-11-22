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
    public void push (Object dado){
        NoPilha newPilha = new NoPilha();
        
        // preencher atributos internos dos dados 
        newPilha.valor = dado;
        
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
            saida += temp.valor + "\n";
            temp = temp.ant;
        }
        JOptionPane.showMessageDialog(null, saida);

    }
        
}
