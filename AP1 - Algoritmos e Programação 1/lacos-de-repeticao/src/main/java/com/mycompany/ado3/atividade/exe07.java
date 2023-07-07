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
public class exe07 {
    
    static void volume(double n){
        double v = (3.0/4.0) * 3.14 * (n*n*n) ;
        
        System.out.println(v);
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("informe o valor do raio: ");
        double raio = scan.nextDouble();
        volume(raio);
    }
}
