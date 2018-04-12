package cad.util;

import java.sql.*;
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rodrigoapolinaro
 */
public class Conecta {
    
    String driver = "com.mysql.jdbc.Driver";
    String url = "jdbc:mysql://localhost/escola";
    String usuario = "root";
    String senha = "root";
    Connection conexao;
    public Statement statement;
    public ResultSet resultSet;
    
    
    public boolean conecta() {
        boolean result = true;
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, usuario, senha);
            
            JOptionPane.showMessageDialog(null, "Conectou com o Banco");
            
        } catch (ClassNotFoundException Driver) {
            JOptionPane.showMessageDialog(null, "Driver com problema" + Driver);
            result = false;
        } catch (SQLException Fonte) {
            JOptionPane.showMessageDialog(null, "Erro na conexão");
            result = false;
        }
        return result;
    }
    
    public void desconeta() {
        boolean result  = true;
        try {
            conexao.close();
            JOptionPane.showMessageDialog(null, "Banco desconectado");
        } catch (SQLException erroSQL) {
            JOptionPane.showMessageDialog(null, "Erro ao desconectar banco");
        }
    }
    public void executeSQL(String sql) {
        try {
            statement = conexao.createStatement(
                ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            resultSet = statement.executeQuery(sql);
        }
        catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        }
    }
    
}
