
package ado1;

import java.util.Scanner;


public class ado01 {

    public static void main(String[] args) {

        String string = "=-"; //string que formara a linha =-=-=-=- para melhor experiencia do usuario
        int count = 40; // numero de vezes que a o caractere -= sera reptido

        int numero1;
        int numero2;
        int numero3;
        int numero4;

        int peso1 = 4;
        int peso2 = 5;
        int peso3 = 1;
        
        Scanner input_1 = new Scanner(System.in);
        System.out.print("Insira um numero: ");
        numero1 = input_1.nextInt();

        Scanner input_2 = new Scanner(System.in);
        System.out.print("Insira um numero: ");
        numero2 = input_2.nextInt();

        Scanner input_3 = new Scanner(System.in);
        System.out.print("Insira um numero: ");
        numero3 = input_3.nextInt();

        int media_pond = (numero1 * peso1 + (numero2 * peso2 + (numero3 * peso3) )) / (peso1 + peso2 + peso3);

     
        System.out.println("\n" + string.repeat(count));
    }
}
