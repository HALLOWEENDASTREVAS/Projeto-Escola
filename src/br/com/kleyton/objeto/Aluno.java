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
public class Aluno extends Pessoa{
   
    private int matricula;
    private Date dataMatri;
    private ArrayList<Disciplina>disciplina;

    @Override
    public String toString() {
        return super.toString()+"Aluno{" + "\nmatricula=" + matricula + ",\n dataMatri=" + dataMatri + ",\n disciplina=" + disciplina + '}';
    }

    
 
    
    public Aluno(int matricula, Date dataMatri, String nome, String rg, String cpf, Date dataNasci) {
        super(nome, rg, cpf, dataNasci);
        this.matricula = matricula;
        this.dataMatri = dataMatri;
    }
    
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Date getDataMatri() {
        return dataMatri;
    }

    public void setDataMatri(Date dataMatri) {
        this.dataMatri = dataMatri;
    }

    public ArrayList<Disciplina> getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(ArrayList<Disciplina> disciplina) {
        this.disciplina = disciplina;
    }
    
}
