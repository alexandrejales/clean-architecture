/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curso.escola;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;



/**
 *
 * @author Alexandre Jales
 */
public class EmailTest {
    
    public EmailTest() {
    }

    @Test
    void naoDeveriaCriarEmailsComEnderecosInvalidos() {
        assertThrows(IllegalArgumentException.class,
            () -> new Email(null));

        assertThrows(IllegalArgumentException.class,
            () -> new Email(""));

        assertThrows(IllegalArgumentException.class,
            () -> new Email("emailinvalido"));
    }
}
