/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curso.escola.exception;

import com.curso.escola.dominio.aluno.CPF;

/**
 *
 * @author Alexandre Jales
 */
public class AlunoNaoEncontrado extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public AlunoNaoEncontrado(CPF cpf) {
        super("Aluno não encontrado, cpf: " + cpf.getCPF());
    }
}
