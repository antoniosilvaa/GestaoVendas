package modelo.dao;

import modelo.conexao.Conexao;
import modelo.conexao.ConexaoSQL;
import modelo.dominio.usuario;

import java.sql.PreparedStatement;
import java.sql.SQLException;


public class UsuarioDao {
    private final Conexao conexao;

    public UsuarioDao() {
        this.conexao = new ConexaoSQL();
    }

    public String salvar(usuario usuario){
        return String.valueOf(usuario.getId() == 0L ? adicionar(usuario) : editar(usuario));
    }

    private Long adicionar(usuario usuario) {
        String sql = "INSERT INTO usuario(nome, usuario, senha, perfil, estado) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement preparedStatement = conexao.abrirConexao().prepareStatement(sql);

            preencherValoresPreparedStatement(preparedStatement, usuario);

            int resultado = preparedStatement.executeUpdate();
            return Long.valueOf(resultado == 1 ? "Usuario Cadastrado" : "Não foi possivel");
        }catch (SQLException e){
            return Long.valueOf(String.format("ERROR %s", e.getMessage()));
        }
    }

    private Long editar(usuario usuario) {
        String sql = "UPDATE categoria SET nome = ?, usuario = ?, senha = ?, perfil = ?, estado WHERE id = ?";

        try {
            PreparedStatement preparedStatement = conexao.abrirConexao().prepareStatement(sql);

            preencherValoresPreparedStatement(preparedStatement, usuario);

            int resultado = preparedStatement.executeUpdate();
            return Long.valueOf(resultado == 1 ? "Editado com sucesso" : "Não foi possivel editar");
        }catch (SQLException e){
            return Long.valueOf(String.format("ERROR %s", e.getMessage()));
        }
    }

    private void preencherValoresPreparedStatement(PreparedStatement preparedStatement, usuario usuario) throws SQLException {
            preparedStatement.setString(1, usuario.getNome());
            preparedStatement.setString(2, usuario.getUsuario());
            preparedStatement.setString(3, usuario.getSenha());
            preparedStatement.setString(4, usuario.getPerfil().name());
            preparedStatement.setBoolean(5, usuario.isEstado());

        if (usuario.getId() != 0L){
            preparedStatement.setLong(6, usuario.getId());
        }
    }
}
