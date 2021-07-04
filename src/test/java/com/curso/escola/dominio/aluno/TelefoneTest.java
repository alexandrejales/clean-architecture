/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curso.escola.dominio.aluno;

import com.curso.escola.dominio.aluno.Telefone;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Alexandre Jales
 */
public class TelefoneTest {

    @Test
    public void validacaoTelefone() {
        assertThrows(IllegalArgumentException.class,
                () -> new Telefone(null, null));

        assertThrows(IllegalArgumentException.class,
                () -> new Telefone("", "99999999"));

        assertThrows(IllegalArgumentException.class,
                () -> new Telefone("99", ""));

        assertThrows(IllegalArgumentException.class,
                () -> new Telefone("5b", "99999999"));

        assertThrows(IllegalArgumentException.class,
                () -> new Telefone("99", "99999999g"));

        assertThrows(IllegalArgumentException.class,
                () -> new Telefone("999", "99999999"));

        assertThrows(IllegalArgumentException.class,
                () -> new Telefone("99", "9999999999"));
    }

    @Test
    void devePermitirCriarTelefoneValido() {
        String ddd = "99";
        String numero = "99999999";
        Telefone telefone = new Telefone (ddd, numero);
        assertEquals(ddd, telefone.getDdd());
        assertEquals(numero, telefone.getNumero());
    }
}
