/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ado3.funcoes;

/**
 *
 * @author jc374
 */
public class exemplo03 {
    
    static String tipo = "";
    static void tipoNumero(int num){
        if(num % 2 == 0){
               tipo = "par";
        }else{
               tipo = "ímpar";
        }
    }
    
    public static void main(String[] args) {
        tipoNumero(7);
        System.out.println("o numero e "  +  tipo);
    }   
    
}
