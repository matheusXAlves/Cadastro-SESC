
package br.com.model.dao;

import br.com.connection.ConexaoMySQL;
import br.com.model.bean.Dependente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class DependenteDAO {
    public void cadDependente(Dependente u) {

        Connection con = ConexaoMySQL.getConexaoMySQL();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("insert into cadSESC.TB_DEPENDENTE ("
                    + "CPF,"
                    + "NOME,"
                    + "DT_NASCIMENTO,"
                    + "SEXO,"
                    + "CEP,"
                    + "ENDERECO,"
                    + "COMPLEMENTO,"
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
                    + "TEL_CELULAR,"
                    + "TEL_RESIDENCIAL,"
                    + "TEL_COMERCIAL,"
                    + "ST_CIVIL"
                    + ", EMAIL"
                    + ") values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
                    + "?, ?, ?, ?, ?, ?, ?, ?, ? );");
            stmt.setLong(1, u.getCpf());
            stmt.setString(2, u.getNome());
            stmt.setString(3, u.getDtNascimento());
            stmt.setString(4, u.getSexo());
            stmt.setInt(5, u.getCEP());
            stmt.setString(6, u.getEndereco());
            stmt.setString(7, u.getComplemento());
            stmt.setString(8, u.getBairro());
            stmt.setString(9, u.getUF());
            stmt.setString(10, u.getCidade());
            stmt.setString(11, u.getNomePai());
            stmt.setString(12, u.getNomeMae());
            stmt.setInt(13, u.getRG());
            stmt.setString(14, u.getOrgEmissor());
            stmt.setString(15, u.getNaturalidade());
            stmt.setString(16, u.getNacionalidade());
            stmt.setString(17, u.getProfissao());
            stmt.setInt(18, u.getRenda());
            stmt.setString(19, u.getGrauInstru());
            stmt.setInt(20, u.getTelCelular());
            stmt.setInt(21, u.getTelResidencial());
            stmt.setInt(22, u.getTelComercial());
            stmt.setString(23, u.getStCivil());
            stmt.setString(24, u.getEmail());

            stmt.executeUpdate();

            stmt = con.prepareStatement("insert into cadSESC.TB_USUARIO ("
                    + "PARENTESCO,"
                    + "ID_USUARIO,"
                    + "ID_PESSOA"
                    + " ) values (?, ?, ?);");
            
            stmt.setString(1, u.getParentesco());
            stmt.setInt(2, 1);
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


