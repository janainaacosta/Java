/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ado3.funcoes;

/**
 *
 * @author jc374
 */
public class exemplo02 {
    
    static int maior = 0;
    static void comparaNumero(int n1,int n2){
        if(n1 > n2){
               maior = n1;
        }else{
               maior = n1;
        }
    }
    
    public static void main(String[] args) {
        comparaNumero(6, 5);
        System.out.println("maior valor: "  + maior);
    }   
}
