/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curso.escola;

import com.curso.escola.aplicacao.aluno.matricula.MatricularAluno;
import com.curso.escola.aplicacao.aluno.matricula.MatricularAlunoDto;
import com.curso.escola.infra.aluno.RepositorioDeAlunosEmMemoria;

/**
 *
 * @author Alexandre Jales
 */
public class MatriculaAlunoPorLinhaDeComando {

    public static void main(String[] args) {
        String nome = "Alexandre Jales Dantas";
        String cpf = "999.999.999-99";
        String email = "alexandre@gmail.com";

        MatricularAluno matricular = new MatricularAluno(new RepositorioDeAlunosEmMemoria());
        matricular.executa(
                new MatricularAlunoDto(nome,
                        cpf,
                        email));
    }
}
