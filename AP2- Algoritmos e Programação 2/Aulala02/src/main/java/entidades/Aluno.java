/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author janaina.csilva64
 */
public class Aluno {
    private String nome;
    private double av1;
    private double ado;
    private double media;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAv1() {
        return av1;
    }

    public void setAv1(double av1) {
        this.av1 = av1;
    }

    public double getAdo() {
        return ado;
    }

    public void setAdo(double ado) {
        this.ado = ado;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia() {
        this.media = (av1 + ado)/2;
    }

}
