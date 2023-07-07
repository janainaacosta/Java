package menor_maior;

import java.util.Scanner;

/**
 *
 * @author janaina.csilva
 */
public class menor_maior {

    public static void main(String[] args) {

        int num_maior = 0;
        int num_meio = 0;
        int num_menor = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("informe um numero");
        int n1 = input.nextInt();

        System.out.println("informe um numero");
        int n2 = input.nextInt();

        System.out.println("informe um numero");
        int n3 = input.nextInt();

        if (n1 > n2 && n1 > n3) {
            num_maior = n1;
        } else if (n2 > n1 && n2 > n3) {
            num_maior = n2;
        } else if (n3 > n1 && n3 > n2) {
            num_maior = n3;
        }

        if (n1 < num_maior && n1 > n2 || n1 > n3) {
            num_meio = n1;
        }
        else if (n2 < num_maior && n2 > n1 || n2 > n3) {
            num_meio = n2;
        }

        else if (n3 < num_maior && n3 > n1 || n3 > n2) {
            num_meio = n3;
        }
        
        if(n1 < num_maior && n1 < num_meio){
            num_menor = n1;
        }
        
        else if(n2 < num_maior && n2 < num_meio){
            num_menor = n2;
        }
        
        if(n3 < num_maior && n3 < num_meio){
            num_menor = n3;
        }

        System.out.printf("numeros em ordem crescente " + num_menor + " " + num_meio + " " + num_maior);
    }
}
