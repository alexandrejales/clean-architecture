/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curso.escola.dominio.aluno;

/**
 *
 * @author Alexandre Jales
 */
public interface CifradorDeSenha {
    String cifrarSenha(String senha);
    boolean validarSenhaCifrada(String senhaCifrada, String senha);
}
