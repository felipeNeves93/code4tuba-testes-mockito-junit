package com.pd.conta;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class ContaCorrente extends Conta {

    private Double limite;
    private Double taxasAdm;
    private Integer numeroCartoes;
    private Integer numeroCheques;

    private static final Double VALOR_UNITARIO_CARTAO = 3.0;
    private static final Double VALOR_UNITARIO_CHEQUE = 1.50;

    public Double getTaxasAdm() {
        return VALOR_UNITARIO_CARTAO + VALOR_UNITARIO_CHEQUE;
    }

    @Override
    public Double getValorAtual() {
        return super.getValorAtual() - this.getTaxasAdm();
    }
}
