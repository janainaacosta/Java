/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.projetoaviao;

/**
 *
 * @author janaina.csilva64
 */
public class Fabrica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //construindo os aviões 
        AviaoSenac meuAviaoUm = new AviaoSenac();
        System.out.println("Cor " + meuAviaoUm.getCor());
        
        AviaoSenac outroAviao = new AviaoSenac();
        
        outroAviao .setCor("vermelho");
        
        System.out.println(outroAviao.getCor());
        
        outroAviao.acelerar();
        System.out.println("Velocidade outro aviao " + outroAviao.getVelocidade());
    }
}




