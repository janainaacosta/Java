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
public class exe03 {
    
    static int somatoria = 1;

    static void fatorial(int n){    
        
        for (int i = 1; i <= n; i++){
           somatoria *= i;
            System.out.print("." + i);
        }
        System.out.println(" = " + somatoria);
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       
        System.out.print("Informe um valor para N: ");
        int num = scan.nextInt();
        fatorial(num);
    }
}
