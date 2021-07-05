/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curso.escola.aplicacao.aluno.matricula;

import com.curso.escola.dominio.aluno.Aluno;
import com.curso.escola.dominio.aluno.CPF;
import com.curso.escola.dominio.aluno.Email;

public class MatricularAlunoDto {

    private String nomeAluno;
    private String cpfAluno;
    private String emailAluno;

    public MatricularAlunoDto(String nomeAluno, String cpfAluno, String emailAluno) {
        this.nomeAluno = nomeAluno;
        this.cpfAluno = cpfAluno;
        this.emailAluno = emailAluno;
    }

    public Aluno criarAluno() {
        return new Aluno(
                new CPF(cpfAluno),
                nomeAluno,
                new Email(emailAluno));
    }
}
