/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curso.escola;

/**
 *
 * @author Alexandre Jales
 */
public class FabricaDeAluno {
    private Aluno aluno;
    
    public FabricaDeAluno comNomeCpfEmail(String nome, String cpf, String email) {
        this.aluno = new Aluno(new CPF(cpf), nome, new Email(email));
        return this;
    }
    
    public FabricaDeAluno comTelefone(String ddd, String telefone) {
        this.aluno.adicionarTelefone(ddd, telefone);
        return this;
    }

    public Aluno criar() {
        return aluno;
    }
    
    
    
    public static void main(String[] args) {
        System.out.println("Main");
        FabricaDeAluno fabrica = new FabricaDeAluno();
        fabrica.comNomeCpfEmail("", "", "")
                .comTelefone("", "")
                .comTelefone("", "")
                .criar();
    }
}
