package com.pd.conta;

import lombok.Builder;

@Builder
public class ContaCorrente extends Conta {

    private Double limite;
    private Double taxasAdm;
    private Integer numeroCartoes;
    private Integer numeroCheques;

    public Double getTaxasAdm() {
        // Aqui vai ser feito o calculo dos cartoes, numeroCheques para chegarmos nas taxas adm
        return null;
    }

    @Override
    public Double sacar(Double valor) {
        return null;
    }

    @Override
    public Double transferir(Double valor, Conta conta) {
        return null;
    }

    @Override
    public Double depositar(Double valor) {
        return null;
    }
}
