/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.kleyton.objeto;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author kleyton.155017
 */
public class Professor extends Pessoa{
  
   private ArrayList <Disciplina> disciplina;
   private int cargaHr;
   private float valorHr;
   private float salario;

    public Professor(ArrayList<Disciplina> disciplina, int cargaHr, float valorHr, float salario, String nome, String rg, String cpf, Date dataNasci, int idade) {
        super(nome, rg, cpf, dataNasci, idade);
        this.disciplina = disciplina;
        this.cargaHr = cargaHr;
        this.valorHr = valorHr;
        this.salario = this.calculaSalario(cargaHr, valorHr);
    }

    @Override
    public String toString() {
        return "Professor{" + "disciplina=" + disciplina + ", cargaHr=" + cargaHr + ", valorHr=" + valorHr + ", salario=" + salario + '}';
    }
    
    public float calculaSalario(int cargaHr, float valorHr){
        return cargaHr * valorHr;
    }
   
    public ArrayList<Disciplina> getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(ArrayList<Disciplina> disciplina) {
        this.disciplina = disciplina;
    }

    public int getCargaHr() {
        return cargaHr;
    }

    public void setCargaHr(int cargaHr) {
        this.cargaHr = cargaHr;
    }

    public float getValorHr() {
        return valorHr;
    }

    public void setValorHr(float valorHr) {
        this.valorHr = valorHr;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    
   
   
   
}
