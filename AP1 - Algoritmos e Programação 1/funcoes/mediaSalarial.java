/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ado_janaina;

import java.util.Scanner;

/**
 *
 * @author jc374
 */
public class mediaSalarial {

    static Scanner scan = new Scanner(System.in);

    static void qtd() {
        int qtd_f = 0;

        System.out.println("informe a quantidade de funcionarios: ");
        qtd_f = scan.nextInt();
        salarios(qtd_f);
    }

    static void salarios(int qtd_f) {
        double somaSalarios = 0;

        for (int i = 0; i < qtd_f; i++) {
            System.out.println("Informe o salario " + i + ":");
            double salario = scan.nextDouble();
            somaSalarios += salario;
        }
        media(qtd_f, somaSalarios);
    }

    static void media(double funcionarios, double salarios) {
        double media_Salarial = 0;
        media_Salarial = salarios / funcionarios;
        System.out.println("media salarial: " + media_Salarial);
    }

    public static void main(String[] args) {
        qtd();
    }
}
