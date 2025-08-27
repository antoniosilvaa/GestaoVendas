package modelo.dominio;

import java.math.BigDecimal;

public class VendaItem {
    private Vendas vendas;
    private Produto produto;
    private int quantidade;
    private BigDecimal Total;
    private BigDecimal desconto;

    public VendaItem() {
    }

    public VendaItem(Vendas vendas, Produto produto, int quantidade, BigDecimal total, BigDecimal desconto) {
        this.vendas = vendas;
        this.produto = produto;
        this.quantidade = quantidade;
        Total = total;
        this.desconto = desconto;
    }

    public Vendas getVendas() {
        return vendas;
    }

    public void setVendas(Vendas vendas) {
        this.vendas = vendas;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getTotal() {
        return Total;
    }

    public void setTotal(BigDecimal total) {
        Total = total;
    }

    public BigDecimal getDesconto() {
        return desconto;
    }

    public void setDesconto(BigDecimal desconto) {
        this.desconto = desconto;
    }
}
