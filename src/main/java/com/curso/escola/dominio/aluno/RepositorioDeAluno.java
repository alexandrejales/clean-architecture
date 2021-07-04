/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curso.escola.dominio.aluno;

import java.util.List;

/**
 *
 * @author Alexandre Jales
 */
public interface RepositorioDeAluno {
    void matricular(Aluno aluno);
    void buscarPorCPF(CPF cpf);
    List<Aluno> listarTodosAlunosMatriculados();
}
