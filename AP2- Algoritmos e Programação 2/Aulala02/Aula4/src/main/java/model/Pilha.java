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
public class Pilha {

    public Pilha(int n) {
    }
    public Object []pil;
    public int max;
    public int tamanho;
    public int topo;

    public void Pilha(int max){
        this.max = max;
        this.tamanho = 0;
        this.topo = -1;
        pil = new Object [this.max];
    }
    
    public boolean cheia(){
        if(tamanho == max){
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean vazia(){
        if (topo == -1){
            return true;
        }
        else{
            return false;
        }
    }
    public void push(Object obj){
        
        if(cheia() == true){
            
            JOptionPane.showConfirmDialog(null, 
                    "Pilha cheia");
            return;
        }
        
        this.topo ++;
        this.pil[this.topo] = obj;
        this.tamanho ++;
    }
    
    
    public void pop(){
        
         if(vazia() == true){
            
            JOptionPane.showConfirmDialog(null, 
                    "Pilha está vazia");
            return;
        }
        this.pil[this.topo] = null; // destroi o topo
        this.topo --;
        this.tamanho --;
    }
    
    public void plotar(){
        
        if(vazia()) return;
        
        String saida = "";
        for(int i = topo; i >= 0; i --){
            saida += "\n " + this.pil[i];
        }
        
        JOptionPane.showConfirmDialog(null, 
                    saida);
    }
    
    /*
    
    EXEMPLO COM FUNÇÃO RECURSIVA
    
    public void destrutor (){
       if (vazia() == true){
           return;
       } 
       pop();
       destrutor();
    }

*/
    
    public void destrutor(){
        for(int i = topo; i >= 0; i --){
            this.pil [i] = null;
            this.topo --;
            this.tamanho --;
        }
         
        JOptionPane.showConfirmDialog(null, 
                    "Pilha destruída!!");
    }
}
