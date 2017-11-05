
package br.com.model.dao;

import br.com.connection.ConexaoMySQL;
import br.com.model.bean.Comerciario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ComerciarioDAO {
    public void cadComerciario(Comerciario c) {

        Connection con = ConexaoMySQL.getConexaoMySQL();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("insert into cadSESC.TB_PESSOA ("
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
                    + ") values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
                    + "?, ?, ?, ?, ?, ?, ?, ? );");
            stmt.setInt(1, c.getCpf());
            stmt.setString(2, c.getNome());
            stmt.setString(3, c.getDtNascimento());
            stmt.setString(4, c.getSexo());
            stmt.setInt(5, c.getCEP());
            stmt.setString(6, c.getEndereco());
            stmt.setString(7, c.getComplemento());
            stmt.setString(8, c.getBairro());
            stmt.setString(9, c.getUF());
            stmt.setString(10, c.getCidade());
            stmt.setString(11, c.getNomePai());
            stmt.setString(12, c.getNomeMae());
            stmt.setInt(13, c.getRG());
            stmt.setString(14, c.getOrgEmissor());
            stmt.setString(15, c.getNaturalidade());
            stmt.setString(16, c.getNacionalidade());
            stmt.setString(17, c.getProfissao());
            stmt.setInt(18, c.getRenda());
            stmt.setString(19, c.getGrauInstru());
            stmt.setInt(20, c.getTelCelular());
            stmt.setInt(21, c.getTelResidencial());
            stmt.setInt(22, c.getTelComercial());
            stmt.setString(23, c.getStCivil());

            stmt.executeUpdate();

            stmt = con.prepareStatement("insert into cadSESC.TB_COMERCIARIO ("
                    + "EMAIL,"
                    + "N_CARTEIRA,"
                    + "DT_ADMISSAO"
                    + "CNPJ"
                    + "SENHA"
                    + "ID_PESSOA"
                    + " ) values (?, ?, ?, ?, ?, ?);");
            
            stmt.setString(1, c.getEmail());
            stmt.setLong(2, c.getnCarteira());
            stmt.setString(3, c.getDtNascimento());
            stmt.setLong(4, c.getCnpj());
            stmt.setString(5, c.getSenha());
            stmt.setInt(6, 4);
            
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
