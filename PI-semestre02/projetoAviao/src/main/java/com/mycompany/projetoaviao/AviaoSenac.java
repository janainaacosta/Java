/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetoaviao;

/**
 *
 * @author janaina.csilva64
 */
public class AviaoSenac {
    
    //atributos
    static String marca = "A101";
    private String cor;
    int velocidade; 
    double altitude;
    boolean ligado = false;
    
    //construtores
    public AviaoSenac(){
        this.cor = "Branca";
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public double getAltitude() {
        return altitude;
    }

    public void setAltitude(double altitude) {
        this.altitude = altitude;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    
    
    //ações = métodos     
    public boolean ligar(){
        ligado = true;
        return ligado;
    }
    
    public int acelerar(){
        this.velocidade += 50;
        return velocidade;
    }
    
    public int acelerar(int novaVelocidade){
        this.velocidade += novaVelocidade;
        return velocidade;
    }

    //métodos acessores e modificadores 
    public void setCor(String novaCor){
        this.cor = novaCor.toUpperCase();  
    }
    
    public String getCor(){
    return this.cor.toUpperCase();
    }
}



