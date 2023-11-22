/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Janaina Costa
 */
public class Recursao {
    
    //-----------------1) recursão ---------------------
    
    public static int recursao(int[] vetor, int index) {
        if (index < 0) {
            return 0; 
        } else {
            return vetor[index] + recursao(vetor, index - 1);
        }
    }

    //-----------------2) fatorial duplo---------------

    public static int fatorial(int num) {
        if (num == 1) {
            return 1;
        }
        return num * fatorial(num - 2);
    }
    
    //---------------3) fibonacci ----------------------
    
    public static int fibonacci(int num){
        if(num < 2){
            return 1;
        }       
        return fibonacci(num -1) + fibonacci(num -2);
    }
    
    
    
    public static void main(String[] args) {
        int resultado = fatorial(7);
        System.out.println(resultado);
        
        for (int i = 1; i < 10; i ++ ){
            System.out.print(fibonacci(i) + " ");
        }
    }
}


/*
int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int resultado = recursao(vetor, vetor.length - 1);
        System.out.println("Somatório: " + resultado);
*/