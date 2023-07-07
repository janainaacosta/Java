/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ado3.funcoes;

/**
 *
 * @author jc374
 */
public class exemplo01 {

    static void imprimirnota(double nota){
        if(nota >= 6){
            System.out.print("Aprovado");
        }else{
            System.out.print("Reprovado");
        }
    }
    public static void main(String[] args) {
        imprimirnota(6.7);
    }
}
