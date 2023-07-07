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
public class exe08 {
    
    static int base = 0;
    static int expo = 0;
    static int potencia = 1;
    
    static void potenciacao(int a,int b){
        
        for(int i = 1; i <= expo; i++){
            potencia *= base;
            
        }
        System.out.println("= " + potencia);
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Informe a base: ");
        base = scan.nextInt();
        System.out.print("Informe o expoente: ");
        expo = scan.nextInt();
        
        potenciacao(base, expo);
    }
}
