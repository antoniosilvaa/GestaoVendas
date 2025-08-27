package modelo.dominio;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Vendas {
    private Long idVenda;
    private Cliente cliente;
    private usuario usuario;
    private BigDecimal valorTotal;
    private BigDecimal valorPago;
    private BigDecimal desconto;
    private BigDecimal troco;
    private LocalDateTime dataCadastro;
    private LocalDateTime dataAtualizacao;

    public Vendas() {
    }

    public Vendas(Long idVenda, Cliente cliente, usuario usuario, BigDecimal valorTotal, BigDecimal valorPago, BigDecimal desconto, BigDecimal troco, LocalDateTime dataCadastro, LocalDateTime dataAtualizacao) {
        this.idVenda = idVenda;
        this.cliente = cliente;
        this.usuario = usuario;
        this.valorTotal = valorTotal;
        this.valorPago = valorPago;
        this.desconto = desconto;
        this.troco = troco;
        this.dataCadastro = dataCadastro;
        this.dataAtualizacao = dataAtualizacao;
    }

    public Long getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(Long idVenda) {
        this.idVenda = idVenda;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public BigDecimal getValorPago() {
        return valorPago;
    }

    public void setValorPago(BigDecimal valorPago) {
        this.valorPago = valorPago;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(usuario usuario) {
        this.usuario = usuario;
    }

    public BigDecimal getDesconto() {
        return desconto;
    }

    public void setDesconto(BigDecimal desconto) {
        this.desconto = desconto;
    }

    public BigDecimal getTroco() {
        return troco;
    }

    public void setTroco(BigDecimal troco) {
        this.troco = troco;
    }

    public LocalDateTime getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDateTime dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public LocalDateTime getDataAtualizacao() {
        return dataAtualizacao;
    }

    public void setDataAtualizacao(LocalDateTime dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }
}
