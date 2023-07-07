/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ado1;

/**
 *
 * @author janaina costa
 */

import java.util.Scanner;
public class ado02 {

    public static void main(String[] args) {
        double cotacao = 5.19;
        double dolar;
        double reais;
        
        Scanner scan = new Scanner (System.in);
        System.out.println("Informe quantos dólares você deseja comprar: ");
        dolar = scan.nextDouble();
        
        reais = dolar * cotacao;
        
        System.out.println("o total da sua compra foi de R$" + reais + 
                "\n o total de dolares comprados " + dolar );
        
                
    }
}
