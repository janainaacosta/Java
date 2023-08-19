/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.janainacostaado1;

/**
 *
 * @author Janaina Costa
 */
public class Animal {

    private String nome = "joaninha";
    private boolean pintas = true;
    private String cor;
    private int qtde_pintas = 8;
    int pulgao_por_dia = 0;
    //---------------------------------------------------
    
    public Animal(){
        this.cor = "vermelha";
    }
    //---------------------------------------------------
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean getPintas() {
        return pintas;
    }

    public void setPintas(boolean pintas) {
        this.pintas = pintas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
     
    public int getQtde_pintas() {
        return qtde_pintas;
    }

    public void setQtde_pintas(int qtde_pintas) {
        this.qtde_pintas = qtde_pintas;
    }
    
        public int getPulgao_por_dia() {
        return pulgao_por_dia;
    }

    public void setPulgao_por_dia(int pulgao_por_dia) {
        this.pulgao_por_dia = pulgao_por_dia;
    }

    //---------------------------------------------------
    
    public boolean tem_ou_nao(){
        pintas = true;
        return pintas;
    }
    
    public int comer_pulgao(){
        this.pulgao_por_dia += 70;
        return pulgao_por_dia;
    }
    
    public int comer_pulgao(int qtde_pulgao){
        this.pulgao_por_dia += qtde_pulgao;
        return this.pulgao_por_dia;
    }
    
    //---------------------------------------------------
    
    public Animal(boolean pintas, String cor, String asas) {
        this.pintas = pintas;
        this.cor = cor;
//        this.qtde_pintas = qtde_pintas;
    }
}

