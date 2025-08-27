package org.example;

import modelo.conexao.Conexao;
import modelo.conexao.ConexaoSQL;

import java.sql.ResultSet;
import java.sql.SQLException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws SQLException {
        String sql = "SELECT * FROM categoria";

        Conexao conexao = new ConexaoSQL();
        System.out.println(conexao.abrirConexao());
        System.out.println("Hello world");

        ResultSet resultSet = conexao.abrirConexao().prepareStatement(sql).executeQuery();

        while (resultSet.next()) {
            System.out.println(resultSet.getString("nome"));
        }
    }
}