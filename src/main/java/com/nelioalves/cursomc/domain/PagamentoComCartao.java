package com.nelioalves.cursomc.domain;

import javax.persistence.Entity;

import com.nelioalves.cursomc.domain.enums.EstadoPagamento;

/**
 * PagamentoComCartao
 */
@Entity
public class PagamentoComCartao extends Pagamento {
    private static final long serialVersionUID = 1L;

    private Integer numeroDeParcelas;

    public PagamentoComCartao() {

    }

    public PagamentoComCartao(Integer id, EstadoPagamento estado, Pedido pedido, Integer numeroDeParcelas) {
        super(id, estado, pedido);
        this.numeroDeParcelas = numeroDeParcelas;
    }

    /**
     * @return the numeroDeParcelas
     */
    public Integer getNumeroDeParcelas() {
        return numeroDeParcelas;
    }

    /**
     * @param numeroDeParcelas the numeroDeParcelas to set
     */
    public void setNumeroDeParcelas(Integer numeroDeParcelas) {
        this.numeroDeParcelas = numeroDeParcelas;
    }

    
}