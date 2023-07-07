/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ado3.funcoes;

/**
 *
 * @author jc374
 */

import java.util.Scanner;
public class exe11 {
    
    static double media = 0;
    static String conceito = "";
   static void classificacao(double a){
       if(a >= 0 && a <= 4.9){
          conceito = "D"; 
       }else if(a >= 5 && a <= 6.9){
          conceito = "C"; 
       }else if(a >= 7 && a <= 8.9){
          conceito = "B"; 
       }else if(a >= 9 && a <= 10){
          conceito = "A"; 
       }
       System.out.println(conceito);
   }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        
        System.out.print("Informe a media do aluno: ");
        media = scan.nextDouble();
        classificacao(media);
    }
}
