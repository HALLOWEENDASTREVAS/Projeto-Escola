/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.kleyton;

import br.com.kleyton.objeto.Aluno;
import br.com.kleyton.objeto.Disciplina;
import br.com.kleyton.objeto.Professor;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author kleyton.155017
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        
        String nome,rg,cpf,departamento;
        char status;
        Date dataMatri,dataNasci;
        float valorHr;
        int cod,matricula,cargaHr;
        Disciplina disci;
        
        nome=JOptionPane.showInputDialog("Informe o seu nome: ");
        rg=JOptionPane.showInputDialog("Informe o seu RG: ");
        cpf=JOptionPane.showInputDialog("Informe o seu CPF: ");
        
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        dataNasci = sdf.parse(JOptionPane.showInputDialog("Informe a sua data ne nascimento: "));
        
        cod=Integer.parseInt(JOptionPane.showInputDialog("Você é:"
                                                     + "\n1: Aluno"
                                                     + "\n2: Professor"));
        
        if (cod==1) {
            
            matricula =Integer.parseInt(JOptionPane.showInputDialog("Informe o número da matricula: "));
            dataMatri=sdf.parse(JOptionPane.showInputDialog("Informe a data de matricula: "));
            
            
            status=JOptionPane.showInputDialog("Informe o Status da disciplina A(ativo) ou I(inativo): ").charAt(0);
            departamento=JOptionPane.showInputDialog("Informe o departamento da disciplina: ");
            
            Aluno alu = new Aluno(matricula, dataMatri, nome, rg, cpf, dataNasci);
            JOptionPane.showMessageDialog(null,alu.toString());
            
        } else {
            if (cod==2) {
                 
                valorHr=Float.parseFloat(JOptionPane.showInputDialog("Informe o valor pago por hora: "));
                cargaHr=Integer.parseInt(JOptionPane.showInputDialog("Informe o número de horas trabalhadas: "));
                
                status=JOptionPane.showInputDialog("Informe o Status da disciplina: ").charAt(0);
                departamento=JOptionPane.showInputDialog("Informe o departamento da disciplina: ");
                
                Professor prof = new Professor(cargaHr, valorHr, nome, rg, cpf, dataNasci);
                JOptionPane.showMessageDialog(null,prof.toString());
            } else {
                if (true) {
                    JOptionPane.showMessageDialog(null, "!!!Codigo de pessoa inválido!!!");
                }
            }   
        }
        
        }
    
}
