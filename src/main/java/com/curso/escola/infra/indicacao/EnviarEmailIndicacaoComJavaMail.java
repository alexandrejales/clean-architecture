/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curso.escola.infra.indicacao;

import com.curso.escola.aplicacao.indicacao.EnviarEmailIndicacao;
import com.curso.escola.dominio.aluno.Aluno;

public class EnviarEmailIndicacaoComJavaMail implements EnviarEmailIndicacao {

    @Override
    public void enviarPara(Aluno indicado) {
        // logica de envio de email com a lib Java Mail
    }
}
