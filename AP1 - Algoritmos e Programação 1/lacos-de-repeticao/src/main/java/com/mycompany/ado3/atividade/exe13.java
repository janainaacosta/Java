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
public class exe13 {

    static int num = 0;
    static int divisor = 0;
    
    static void divisores(int a){
        for(int i = 1; i <= a; i++){
            if(a % i == 0){
                divisor += i;
                System.out.print(i + ", ");
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Informe um valor inteiro positivo: ");
        num = scan.nextInt();
        if (num < 0){
            System.out.println("Informe um valor inteiro positivo: ");
            num = scan.nextInt();
        }
        divisores(num);
    }
}
