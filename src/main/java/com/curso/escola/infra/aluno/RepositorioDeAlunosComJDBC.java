/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curso.escola.infra.aluno;

import com.curso.escola.dominio.aluno.Aluno;
import com.curso.escola.dominio.aluno.CPF;
import com.curso.escola.dominio.aluno.Telefone;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import com.curso.escola.dominio.aluno.RepositorioDeAlunos;

/**
 *
 * @author Alexandre Jales
 */
public class RepositorioDeAlunosComJDBC implements RepositorioDeAlunos {

    private final Connection connection;

    public RepositorioDeAlunosComJDBC(Connection connection) {
        this.connection = connection;
    }

    @Override
    public Aluno matricular(Aluno aluno) {
        try {
            String sql = "INSERT INTO ALUNO VALUES(?,?,?)";
            PreparedStatement ps = this.connection.prepareStatement(sql);
            ps.setString(1, aluno.getCpf());
            ps.setString(2, aluno.getNome());
            ps.setString(3, aluno.getEmail());
            ps.execute();
            
            sql = "INSERT INTO TELEFONE VALUES(?,?)";
            ps = connection.prepareStatement(sql);
            
            for (Telefone telefone : aluno.getTelefones()) {
                ps.setString(1, telefone.getDdd());
                ps.setString(2, telefone.getNumero());
            }
            
            return aluno;
        } catch (SQLException e) {
            
        }
        return null;
    }

    @Override
    public Aluno buscarPorCPF(CPF cpf) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Aluno> listarTodosAlunosMatriculados() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
