/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programas;

import entidades.Aluno;
import javax.swing.JOptionPane;
/**
 *
 * @author janaina.csilva64
 */
public class Main {
    static Aluno [] tabAluno;
    static int n = 0;
    static int linha = -1;
    
     static void addNewReg(){
         linha ++; //linha = 0
         
         if(linha >= n ){
             JOptionPane.showMessageDialog(null, "Tabela cheia");
             return;
         }
         
         tabAluno [linha] = new Aluno();
         
         String nome = JOptionPane.showInputDialog(null, "Nome: ");
         tabAluno[linha].setNome(nome);
         
         double av1 = Double.parseDouble(            
            JOptionPane.showInputDialog(null, "Digite a av1: ")
        );
        tabAluno[linha].setAv1(av1);

         
        double ado = Double.parseDouble(            
            JOptionPane.showInputDialog(null, "Digite a ado: ")
        );
        tabAluno[linha].setAv1(ado);
            
        tabAluno[linha].setMedia();    
     }
     
     static void listar(){
            String saida = "";
            for (int i = 0; i <= linha; i++){
                saida += String.format("%s %.2f %.2f \n",
                tabAluno[i].getNome(),
                tabAluno[i].getAv1(),
                tabAluno[i].getAdo(),
                tabAluno[i].getMedia());
            }
            int i = 0;
            JOptionPane.showMessageDialog(null, saida);
            JOptionPane.showMessageDialog(null, "media" + tabAluno[i].getMedia());

     }
     
     
     
     public static void main(String[] args) {
                 
         n = Integer.parseInt(
         JOptionPane.showInputDialog(null, "Quantos alunos deseja cadastrar: ")
        );
         
         tabAluno = new Aluno [n];
         
         addNewReg();
         listar();
    }
}
