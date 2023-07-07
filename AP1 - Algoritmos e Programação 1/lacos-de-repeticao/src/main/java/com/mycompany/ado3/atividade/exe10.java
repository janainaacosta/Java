/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ado3.funcoes;

import java.util.Scanner;

/**
 *
 * @author jc374
 */
public class exe10 {
    
    static String categoria = "";
    static int idade = 0;
    
    static void classificacao(int i){
        if(i >= 5 && i <= 7){
            categoria = "INFANTIL A";
        }else if(i >= 8 && i <= 10){
            categoria = "INFANTIL B";
        }else if(i >= 11 && i <= 13){
            categoria = "JUVENIL A";
        }else if(i >= 14 && i <= 17){
            categoria = "JUVENIL B";
        }else if(i >= 18){
            categoria = "ADULTO";
        }
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Informa a idade: ");
        idade = scan.nextInt();
        classificacao(idade);
        System.out.println("sua categoria e: " + categoria);;
    }
 
}
