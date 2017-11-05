package br.com.model.dao;

import br.com.connection.ConexaoMySQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import br.com.model.bean.Usuario;

public class UsuarioDAO {

    public void cadUsuario(Usuario u) {

        Connection con = ConexaoMySQL.getConexaoMySQL();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("insert into SESCcad.TB_PESSOA ("
                    + "CPF,"
                    + "NOME,"
                    + "DT_NASCIMENTO,"
                    + "SEXO,"
                    + "CEP,"
                    + "ENDERECO,"
                    + "BAIRRO,"
                    + "UF,"
                    + "CIDADE,"
                    + "NOME_PAI,"
                    + "NOME_MAE,"
                    + "RG,"
                    + "ORG_EMISSOR,"
                    + "NATURALIDADE,"
                    + "NACIONALIDADE,"
                    + "PROFISSAO,"
                    + "RENDA_MENSAL,"
                    + "GRAU_INTRUCAO,"
                    + "CELULAR,"
                    + "RESIDENCIAL,"
                    + "COMERCIAL,"
                    + "ST_CIVIL,"
                    + "EMAIL"
                    + "HABITACAO"
                    + ") values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
                    + "?, ?, ?, ?, ?, ?, ?, ?, ?);");
            stmt.setLong(1, u.getCpf());
            stmt.setString(2, u.getNome());
            stmt.setString(3, u.getDtNascimento());
            stmt.setString(4, u.getSexo());
            stmt.setInt(5, u.getCEP());
            stmt.setString(6, u.getEndereco());
            stmt.setString(7, u.getBairro());
            stmt.setString(8, u.getUF());
            stmt.setString(9, u.getCidade());
            stmt.setString(10, u.getNomePai());
            stmt.setString(11, u.getNomeMae());
            stmt.setInt(12, u.getRG());
            stmt.setString(13, u.getOrgEmissor());
            stmt.setString(14, u.getNaturalidade());
            stmt.setString(15, u.getNacionalidade());
            stmt.setString(16, u.getProfissao());
            stmt.setInt(17, u.getRenda());
            stmt.setString(18, u.getGrauInstru());
            stmt.setInt(19, u.getTelCelular());
            stmt.setInt(20, u.getTelResidencial());
            stmt.setInt(21, u.getTelComercial());
            stmt.setString(22, u.getStCivil());
            stmt.setString(23, u.getEmail());
            stmt.setString(24, u.getHabitacao());

            stmt.executeUpdate();

            stmt = con.prepareStatement("insert into SESCcad.TB_USUARIO ("
                    + "CPF,"
                    + "SENHA,"
                    + "ID_PESSOA"
                    + " ) values (?, ?, ?);");
            
            stmt.setLong(1, u.getCpf());
            stmt.setString(2, "12345");
            stmt.setInt(3, 1);
            
            stmt.executeUpdate();
//
//            JOptionPane.showMessageDialog(null, "Cadastro Realizado Com Sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Dados Inconsistentes!");
        } finally {
            ConexaoMySQL.FecharConexao(con, stmt);
        }
    }
}
