package modelo.dominio;

import java.time.LocalDateTime;

public class Produto {
    private Long id;
    private String descricao;
    private String name;
    private double preco;
    private int quantidade;
    private Categoria categoria;
    private usuario usuario;
    private LocalDateTime dataCadastro;

    public Produto() {
    }

    public Produto(Long id, String descricao, String name, double preco, int quantidade, Categoria categoria, usuario usuario, LocalDateTime dataCadastro) {
        this.id = id;
        this.descricao = descricao;
        this.name = name;
        this.preco = preco;
        this.quantidade = quantidade;
        this.categoria = categoria;
        this.usuario = usuario;
        this.dataCadastro = dataCadastro;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(usuario usuario) {
        this.usuario = usuario;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public LocalDateTime getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDateTime dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
}
