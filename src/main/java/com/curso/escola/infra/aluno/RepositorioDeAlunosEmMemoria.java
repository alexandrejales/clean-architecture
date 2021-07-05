/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curso.escola.infra.aluno;

import com.curso.escola.dominio.aluno.Aluno;
import com.curso.escola.dominio.aluno.CPF;
import com.curso.escola.exception.AlunoNaoEncontrado;
import java.util.ArrayList;
import java.util.List;
import com.curso.escola.dominio.aluno.RepositorioDeAlunos;

/**
 *
 * @author Alexandre Jales
 */
public class RepositorioDeAlunosEmMemoria implements RepositorioDeAlunos{

    private List<Aluno> matriculados = new ArrayList<>();
    
    @Override
    public Aluno matricular(Aluno aluno) {
        this.matriculados.add(aluno);
        return aluno;
    }

    /**
     *
     * @param cpf
     * @return
     */
    @Override
    public Aluno buscarPorCPF(CPF cpf) {
        return this.matriculados.stream()
                .filter(a -> a.getCpf().equals(cpf.getCPF()))
                .findFirst()
                .orElseThrow(() -> new AlunoNaoEncontrado(cpf));
    }

    @Override
    public List<Aluno> listarTodosAlunosMatriculados() {
        return this.matriculados;
    }
    
}
