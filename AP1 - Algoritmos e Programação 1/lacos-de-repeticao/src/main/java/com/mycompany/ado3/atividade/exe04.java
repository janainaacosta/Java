/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ado3.funcoes;

import static com.mycompany.ado3.funcoes.exe03.fatorial;
import java.util.Scanner;

/**
 *
 * @author jc374
 */
public class exe04 {
    
    static int somatoria = 0;
    static int fatorial = 1;


    static void calculo(int n){    
        
        for (int i = 1; i <= n; i++){
           somatoria += i;
        }
        
        for (int i = 1; i <= n; i++){
           fatorial *= i;
        }
        
        int divisao = fatorial / somatoria;
        System.out.println(fatorial + ":" + somatoria + " = " + divisao);
        
        
    }    
    
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       
        System.out.print("Informe um valor para N: ");
        int num = scan.nextInt();
        calculo(num);
    }
    
    
}
