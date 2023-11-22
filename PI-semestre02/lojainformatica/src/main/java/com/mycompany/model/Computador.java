package com.mycompany.model;

public class Computador {
    
    private int idComputador;
    private int hd;
    private String processador;

   
    public Computador(){
       
    }
    public Computador( int hd, String processador) {
        this.hd = hd;
        this.processador = processador;
    }
   
    public Computador(int idComputador, int hd, String processador) {
        this.idComputador = idComputador;
        this.hd = hd;
        this.processador = processador;
    }

    public int getIdComputador() {
        return idComputador;
    }

    public void setIdComputador(int idComputador) {
        this.idComputador = idComputador;
    }

    public int getHd() {
        return hd;
    }

    public void setHd(int hd) {
        this.hd = hd;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }
    
  
}
