/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ado3.funcoes;

/**
 *
 * @author jc374
 */

import java.util.Scanner;
public class exe01 {

    static int menor = 0;

    static void comparador(int a, int b, int c){
        
        if(a < b && a < c){
            menor = a;
        }else if (b < a && b < c){
            menor = b;
        }else if(c < a && c < b){
           menor = c;
        }
        System.out.println(menor + " foi o menor valor informado");
    }
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("informe um valor: ");
        int n1 = scan.nextInt();
        System.out.print("informe um valor: ");
        int n2 = scan.nextInt();
        System.out.print("informe um valor: ");
        int n3 = scan.nextInt();
        comparador(n1,n2,n3);
    }
}
