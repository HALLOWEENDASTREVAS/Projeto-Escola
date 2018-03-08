/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.kleyton.objeto;

import java.util.Calendar;
import java.util.Date;
import javafx.scene.chart.PieChart;

/**
 *
 * @author kleyton.155017
 */
public abstract class Pessoa {
   private String nome;
   private String rg;
   private String cpf;
   private Date dataNasci;
   private int idade;

    public Pessoa(String nome, String rg, String cpf, Date dataNasci, int idade) {
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.dataNasci = dataNasci;
        this.idade = this.calculaIdade(dataNasci);
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", rg=" + rg + ", cpf=" + cpf + ", dataNasci=" + dataNasci + ", idade=" + idade + '}';
    }
    
    
    public static int calculaIdade(java.util.Date dataNasc) {

    Calendar dataNasci = Calendar.getInstance();  
    dataNasci.setTime(dataNasc); 
    Calendar hoje = Calendar.getInstance();  

    int idade = hoje.get(Calendar.YEAR) - dataNasci.get(Calendar.YEAR); 

    if (hoje.get(Calendar.MONTH) < dataNasci.get(Calendar.MONTH)) {
      idade--;  
    } 
    else 
    { 
        if (hoje.get(Calendar.MONTH) == dataNasci.get(Calendar.MONTH) && hoje.get(Calendar.DAY_OF_MONTH) < dataNasci.get(Calendar.DAY_OF_MONTH)) {
            idade--; 
        }
    }

    return idade;
}
   
   
   

   
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNasci() {
        return dataNasci;
    }

    public void setDataNasci(Date dataNasci) {
        this.dataNasci = dataNasci;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
   
   
}
