package modelo.conexao;

import java.sql.Connection;
import java.sql.SQLException;

public interface Conexao {
    public Connection abrirConexao() throws SQLException;
}
