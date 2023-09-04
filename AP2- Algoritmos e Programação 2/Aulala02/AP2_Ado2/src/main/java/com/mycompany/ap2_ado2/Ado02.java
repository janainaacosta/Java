/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ap2_ado2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Janaina Costa
 */
public class Ado02 {

    public static void  geraVetor(){
    Random gerar = new Random();
    Scanner leitor = new Scanner(System.in);

    System.out.println ("Digite a qtde de números:");
    int n = leitor.nextInt();
    double nums[] = new double [ n ];
    
    for (int i=0; i<n; i++) {
        nums [i] = gerar.nextDouble() * 10;
        System.out.println(nums[i]);
    } 
    menu(nums);  
}

    
public static void menu (double [] nums) {
    Scanner leitor = new Scanner(System.in);
    
    int item; double media = 0; double elemento = 0; 

    while (true) {
        System.out.println ("1 Gerar média aritmética: ");
        System.out.println ("2 Exibir valor do elemento central do vetor: ");
        System.out.println ("0 Encerrar o programa: ");
        item = leitor.nextInt();

        switch ( item ){
            case 1 : 
              media = calculaMedia(nums);
              System.out.println( "Média = " + media );
            break;
            case 2:
               elemento = procuraElementoCentral(nums);
               System.out.println( "Elemento central = " + elemento );
            break;
            case 0:
                System.out.println("Encerrado.");
            return;
        }      
    }
}


public static double calculaMedia(double[] vetor) {
    double soma = 0;
    for (double x : vetor) {
        soma += x;
    }
    double media = soma / vetor.length;
    return media;
}


public static double procuraElementoCentral(double[] vetor){
    double tam_vetor = vetor.length;
    double elemento_central = 0;
    
    if(tam_vetor % 2 == 0){
        elemento_central = tam_vetor / 2;
    }
    else if(tam_vetor % 2 == 1){
        elemento_central = (tam_vetor/2) + 1;
    }
    
    return elemento_central;
} 


public static void listar (double [] vetor ) {
    // plotar o vetor
    for (double x: vetor ) {
        System.out.println ( x );
    }
}


public static void main(String[] args) { 
    geraVetor(); 
}
}
