package modelo.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoSQL implements Conexao {
    private final String USUARIO = "root";
    private final String SENHA = "@Antonio0109";
    private final String URL = "jdbc:mysql://localhost:3306/gestao_venda";
    private Connection conectar;

    @Override
    public Connection abrirConexao() throws SQLException {
        if (conectar == null) {
            conectar = DriverManager.getConnection(URL, USUARIO, SENHA);
        }
        return conectar;
    }
}