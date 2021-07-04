/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curso.escola.dominio.indicacao;

import com.curso.escola.dominio.aluno.Aluno;
import java.time.LocalDateTime;

/**
 *
 * @author Alexandre Jales
 */
public class Indicacao {
    private final Aluno indicado;
    private final Aluno indicante;
    private final LocalDateTime data;

    public Indicacao(Aluno indicado, Aluno indicante) {
        this.indicado = indicado;
        this.indicante = indicante;
        this.data = LocalDateTime.now();
    }

    public Aluno getIndicado() {
        return indicado;
    }

    public Aluno getIndicante() {
        return indicante;
    }

    public LocalDateTime getData() {
        return data;
    }
}
