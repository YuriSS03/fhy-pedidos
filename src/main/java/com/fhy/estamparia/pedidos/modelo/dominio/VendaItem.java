/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fhy.estamparia.pedidos.modelo.dominio;

import java.math.BigDecimal;

/**
 *
 * @author ACTTECH - YURI
 */
public class VendaItem {
    private Venda venda;
    private Produto produto;
    private Integer quantidade;
    private BigDecimal total;
    private BigDecimal descontos;

    public VendaItem() {
    }

    public VendaItem(Venda venda, Produto produto, Integer quantidade, BigDecimal total, BigDecimal descontos) {
        this.venda = venda;
        this.produto = produto;
        this.quantidade = quantidade;
        this.total = total;
        this.descontos = descontos;
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public BigDecimal getDescontos() {
        return descontos;
    }

    public void setDescontos(BigDecimal descontos) {
        this.descontos = descontos;
    }
    
    
    
}
