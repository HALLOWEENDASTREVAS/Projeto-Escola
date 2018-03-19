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
import java.util.ArrayList;
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

        int escMenu;
        ArrayList<Disciplina> materias = new ArrayList<>();
        ArrayList<Aluno> alunos = new ArrayList<>();
        ArrayList<Professor> professores = new ArrayList<>();
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        do {
            escMenu = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma das opções: \n"
                    + "1: Cadatro Aluno. \n"
                    + "2: Cadatro Professor. \n"
                    + "3: Cadatro Disciplina. \n"
                    + "4: Sair."));
            switch (escMenu) {
                case 1: {

                    String nome = JOptionPane.showInputDialog("Informe o seu nome: ");
                    String rg = JOptionPane.showInputDialog("Informe o seu RG: ");
                    String cpf = JOptionPane.showInputDialog("Informe o seu CPF: ");
                    int matricula = Integer.parseInt(JOptionPane.showInputDialog("Informe o número da matricula: "));
                    Date dataMatri = sdf.parse(JOptionPane.showInputDialog("Informe a data de matricula: "));
                    Date dataNasci = sdf.parse(JOptionPane.showInputDialog("Informe a sua data ne nascimento: "));
                    
                    alunos.add(new Aluno(matricula, dataMatri, nome, rg, cpf, dataNasci));
                    
                    if (JOptionPane.showConfirmDialog(null, "O aluno ja se matriculou em alguma disciplina: ") == 0 ) {
                       String materiasExist = "";
                        for (Disciplina materia : materias) {
                            materiasExist += materias.indexOf(materia) + "" + materia.getNome() + "\n";
                        }
                        do {                            
                            int esc = Integer.parseInt(JOptionPane.showInputDialog("-- Informe a máteria -- \n" + materiasExist));
                            alunos.get(alunos.size() - 1).getDisciplina().add(materias.get(esc));
                        } while (JOptionPane.showConfirmDialog(null, "A outra matéria para cadastrar ?") == 0);
                    }
                    
                    break;
                }
                case 2: {

                    String nome = JOptionPane.showInputDialog("Informe o seu nome: ");
                    String rg = JOptionPane.showInputDialog("Informe o seu RG: ");
                    String cpf = JOptionPane.showInputDialog("Informe o seu CPF: ");
                    Float valorHr = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor pago por hora: "));
                    int cargaHr = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de horas trabalhadas: "));
                    Date dataNasci = sdf.parse(JOptionPane.showInputDialog("Informe a sua data ne nascimento: "));

                    professores.add(new Professor(cargaHr, 0, nome, rg, cpf, dataNasci));
                    
                    if (JOptionPane.showConfirmDialog(null, "O professor lessiona alguma disciplina: ") == 0 ) {
                        String materiasExist = "";
                        for (Disciplina materia : materias) {
                            materiasExist += materias.indexOf(materia) + "" + materia.getNome() + "\n";
                        }
                        do {                            
                            int esc = Integer.parseInt(JOptionPane.showInputDialog("-- Informe a máteria -- \n" + materiasExist));
                            professores.get(professores.size() - 1).getDisciplina().add(materias.get(esc));
                        } while (JOptionPane.showConfirmDialog(null, "O professor lessiona mais alguma disciplina ?") == 0);
                    }
                    break;
                }
                case 3: {

                    do {
                    
                        String nome = JOptionPane.showInputDialog("Informe o nome da disciplina: ");
                        String departamento = JOptionPane.showInputDialog("Informe o departamento da disciplina: ");
                        char status = JOptionPane.showInputDialog("Informe o Status da disciplina A(ativo) ou I(inativo): ").charAt(0);
                        materias.add(new Disciplina(nome, departamento, status));
                        
                    } while ((JOptionPane.showConfirmDialog(null, "Deseja continuar?"))==0);
                    break;
                }
                case 4: {
                    break;
                }
                default: {

                    JOptionPane.showMessageDialog(null, "!!!Número de opção inválido!!!");

                    break;
                }
            }

        } while (escMenu != 4);

    }

}
