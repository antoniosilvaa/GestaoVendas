package modelo.dominio;

public class Categoria {
    private Long id;
    private String descricao;
    private String name;

    public Categoria() {
    }

    public Categoria(Long id, String descricao, String name) {
        this.id = id;
        this.descricao = descricao;
        this.name = name;
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
}
