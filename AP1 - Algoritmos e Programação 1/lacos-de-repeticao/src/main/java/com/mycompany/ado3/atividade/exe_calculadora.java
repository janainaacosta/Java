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

public class exe_calculadora {
        
    static int resultado = 0;
    static int opcao = 0;
    
    static void operacoes(int n1, int n2){
        if(opcao == 1){
            resultado = n1 + n2;
        }else if(opcao == 2){
            resultado = n1 - n2;
        }else if(opcao == 3){
            resultado = n1 * n2;
        }else if(opcao == 4){
            resultado = n1 / n2;
        }else if(opcao == 5){
            resultado = 1;
            for(int i = 1; i <= n2; i++){
            resultado *= n1;
            
            }
        }
        
        System.out.println("------------------\n= " + resultado);
    } 

    public static void main(String[] args){    
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("ESCOLHA UMA OPERACAO \n------------------\nADICAO       [1] \nSUBTRACAO    [2] \nMULTIPLICACAO[3] \nDIVISAO      [4] \nPOTENCIACAO  [5] ->");
        opcao = scan.nextInt();
        

        System.out.print("Primeito valor: ");
        int a = scan.nextInt();
        System.out.print("Segundo valor: ");
        int b = scan.nextInt();
        
        operacoes(a, b);
    }
    
}
