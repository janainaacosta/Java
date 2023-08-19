/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.janaina_ado01;

import com.mycompany.janainacostaado1.Animal;

/**
 *
 * @author Zile
 */
public class Ado01 {
    public static void main(String[] args) {
        
    Animal a1 = new Animal();
    a1.setNome("joaninha ninha");
    a1.setPintas(true);
    
    Animal a2 = new Animal();
    a2.setNome("joana ninha ");
    a2.setPintas(false);
    a2.comer_pulgao();
    a2.setCor("amarela");
    
    System.out.println("Nome: " + a1.getNome());
    System.out.println("Cor: " + a1.getCor());
    System.out.println("Quantidade de pintas: " + a1.getQtde_pintas());
    
    System.out.println("-------------------------------");
    
    System.out.println("Nome: " + a2.getNome());
    System.out.println("Cor: " + a2.getCor());
    System.out.println("Tem pintas: " + a2.getPintas());
    System.out.println("Quantos pulgões ela come: " + a2.getPulgao_por_dia());
    }
}
