/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.kleyton.objeto;

/**
 *
 * @author kleyton.155017
 */
public class Disciplina {
    
    private String nome;
    private String departamento;
    private char status;

    @Override
    public String toString() {
        return "Disciplina{" + "\nnome=" + nome + ",\n departamento=" + departamento + ",\n status=" + status + '}';
    }
    
}
