/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lojacarros;

/**
 *
 * @author janaina.csilva64
 */
public class Carro {
    
    private int Velocidade;
    private String modelo;
    private String Marca;

    public Carro() {
    }

    public Carro(String modelo, String Marca) {
        this.modelo = modelo;
        this.Marca = Marca;
    }

    public int getVelocidade() {
        return Velocidade;
    }

    public void setVelocidade(int Velocidade) {
        this.Velocidade = Velocidade;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    
    public int acelerar() {
        this.Velocidade += 10;
        return Velocidade;
    }
    
    public int frear() {
        this.Velocidade  -= 10;
        return Velocidade;
    }
    
}
