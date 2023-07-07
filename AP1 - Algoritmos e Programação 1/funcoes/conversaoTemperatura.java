package ado_janaina;

import java.util.Scanner;

/**
 *
 * @author jc374
 */

public class conversaoTemperatura {
    static Scanner scan = new Scanner(System.in);

    public static double lerTemperatura(Scanner scanner) {
        System.out.print("Digite a temperatura em graus Celsius: ");
        return scanner.nextDouble();
    }

    public static int menu(Scanner scanner) {
        System.out.println("Selecione a opção de conversão:");
        System.out.println("1.°C para °K");
        System.out.println("2.°C para °Re");
        System.out.println("3.°C para °R");
        System.out.println("4.°C para °F");
        System.out.print("Opção: ");
        return scanner.nextInt();
    }

    public static void conversao(int opcao, double temperaturaCelsius) {
        double temperaturaConvertida = 0;
        switch (opcao) {
            case 1:
                temperaturaConvertida = temperaturaCelsius + 273.15;
                System.out.println("em °K: " + temperaturaConvertida + " K");
                break;
            case 2:
                temperaturaConvertida = temperaturaCelsius * 0.8;
                System.out.println("em °Re: " + temperaturaConvertida + " Re");
                break;
            case 3:
                temperaturaConvertida = temperaturaCelsius * 1.8 + 32 + 459.67;
                System.out.println("em °R: " + temperaturaConvertida + " Ra");
                break;
            case 4:
                temperaturaConvertida = temperaturaCelsius * 1.8 + 32;
                System.out.println("em  °F: " + temperaturaConvertida + " F");
                break;
            default:
                System.out.println("Tente novamente.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double temperaturaCelsius = lerTemperatura(scanner);
        int opcao = menu(scanner);
        conversao(opcao, temperaturaCelsius);
        scanner.close();
    }
}
