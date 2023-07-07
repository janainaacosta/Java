package calc_desconto;

import java.util.Scanner;

/**
 *
 * @author janaina.csilva
 */
public class calc_desconto {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double valor_prod, qtde_comprada, valor_total, desconto, novo_valor;

        System.out.println("Valor do produto: ");
        valor_prod = scan.nextDouble();
        System.out.println("quantidade de produto comprado: ");
        qtde_comprada = scan.nextDouble();

        valor_total = valor_prod * qtde_comprada;

        if (valor_total <= 100) {
            System.out.printf("o valor final é de " + valor_total);
            
            
        } else if (valor_total > 100 && valor_total < 200) {
            
            desconto = (valor_total * 10) / 100;
            novo_valor = valor_total - desconto;
            System.out.printf("o valor final é de " + novo_valor);
            
            
        } else if (valor_total >= 200 && valor_total < 300) {
            
            desconto = (valor_total * 20) / 100;
            novo_valor = valor_total - desconto;
            System.out.printf("o valor final é de " + novo_valor);
            
            
        } else {
            
            desconto = (valor_total * 30) / 100;
            novo_valor = valor_total - desconto;
            System.out.printf("o valor final é de " + novo_valor);
        }
    }

}
