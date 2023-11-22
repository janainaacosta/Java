/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Model;

/**
 *
 * @author janaina.csilva64
 */
public class Recursao {
    
    public static int somaLista(int x, int y){

        if ( x > y){
        
            return 0;
        }else{
            System.out.println(x);
                    
            return x + somaLista (x + 1, y);
        }
   }

    public static int gerarFibo(int p, int u, int n){
       
        int fibo;
       
        if(n == 0){
            return 0;
        }
       
        if( p == 0 && u == 0){
            fibo = 0;
            p = 0;
            u = 1;
            System.out.println(fibo);

        }
        else if ( p == 0 && u == 1){
            fibo = 1;
            p = 1;
            u = 0;
            System.out.println(fibo);
                      
        }
        else if ( p == 1 && u == 0){
            fibo = 1;
            p = 1;
            u = 1;
            System.out.println(fibo);

        }
        else {
            fibo = p + u;
            p = u; 
            u = fibo;
            System.out.println(fibo);
        }
       
       return (gerarFibo(p, u, n-1));
    }
    
    public static int fatorialDuplo (int n){
        if(n == 2){
            return 1;
        }
        else{
            return n * fatorialDuplo(n - 2);
        }
    }
    
    
    public static void imprimeFatorial(int a){
        int fatorial = fatorialDuplo(a);
        System.out.println(fatorial);
    }
   
    public static void imprimirSoma (int a, int b){
        int soma = somaLista(a, b);
        System.out.println(soma);
    }
   
    
}