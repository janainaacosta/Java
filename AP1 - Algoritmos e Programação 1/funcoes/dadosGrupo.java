/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ado_janaina;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author jc374
 */
public class dadosGrupo {

    static Scanner scan = new Scanner(System.in);

    static void dados() {
        double maior_altura = 0;
        double menor_altura = 0;
        double cont_masculinos = 0;
        double cont_femininos = 0;
        double total_masculinos = 0;
        double total_femininos = 0;
        int sexo;
        boolean entrada = true;

        for (int i = 0; i <= 10; i++) {
            System.out.println("Informe o sexo \nFeminino [1]\nMasculino [2]: ");
            sexo = scan.nextInt();
            System.out.println("Informe a altura: ");
            double altura = scan.nextDouble();

            if (sexo == 2) {
                cont_masculinos++;
                total_masculinos += altura;
            } else if (sexo == 1) {
                cont_femininos++;
                total_femininos += altura;
            }

            if (entrada) {
                maior_altura = altura;
                menor_altura = altura;
                entrada = false;
            } else {
                maior_altura = calcular_maior(altura, maior_altura, i);
                menor_altura = calcular_menor(altura, menor_altura, i);
            }

            media_masculinos(total_masculinos, i, cont_masculinos);
            media_femininos(total_femininos, i, cont_femininos);
        }
    }

    public static double calcular_maior(double altura, double maior_altura_anterior, int i) {
        double maior_altura = maior_altura_anterior;

        if (altura > maior_altura) {
            maior_altura = altura;
        }

        if (i == 10) {
            System.out.println("Maior altura: " + maior_altura);
        }
        return maior_altura;
    }

    public static double calcular_menor(double altura, double menor_altura_anterior, int i) {
        double menor_altura = menor_altura_anterior;

        if (altura < menor_altura) {
            menor_altura = altura;
        }

        if (i == 10) {
            System.out.println("Menor altura: " + menor_altura);
        }
        return menor_altura;
    }

    public static void media_masculinos(double altura, int i, double contador) {
        double media = altura / contador;

        if (i == 10) {
            System.out.println("Média altura masculina: " + media);
        }
    }

    public static void media_femininos(double altura, int i, double contador) {
        double media = altura / contador;

        if (i == 10) {
            System.out.println("Média altura feminina: " + media);
        }
    }

    public static void main(String[] args) {
        dados();
    }
}
