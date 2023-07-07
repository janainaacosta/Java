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
public class exe12 {
    
    static int genero = 0;
    static double altura = 0;
    static double p = 0;
    
    static void ideal(double a, int g){
        if (g == 1){
            p = 72.7 * a - 58;
        }else if(g == 2){
            p = 62.1 * a - 44.7;            
        }
        System.out.println(p);
    }
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("informe o genero [1]-M, [2]-F: ");
        genero = scan.nextInt();
        System.out.print("informe a altura: ");
        altura = scan.nextDouble();
        ideal(altura, genero);       
    }
}
