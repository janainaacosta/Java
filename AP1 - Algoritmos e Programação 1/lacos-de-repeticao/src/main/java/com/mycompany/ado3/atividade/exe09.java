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
public class exe09 {
    
    static int dia = 0;
    static int mes = 0;
    static int ano = 0;
    static int soma_dias = 0;
    
    static void dias_vividos(int d,int m, int a){
        soma_dias += (a * 365) + (m * 30) + d;
        System.out.println(soma_dias + " e o total de dias vividos");
    }
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("anos -> ");
        ano = scan.nextInt();
        System.out.println("meses -> ");
        mes = scan.nextInt();
        System.out.println("dias -> ");
        dia = scan.nextInt();
        
        dias_vividos(dia, mes, ano);
    }
    
}
