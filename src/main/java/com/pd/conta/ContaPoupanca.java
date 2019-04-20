package com.pd.conta;

import com.pd.base.exception.OperacaoNaoPermitidaException;
import lombok.Builder;

@Builder
public class ContaPoupanca extends Conta {

    private Double taxaRendimentoAoMes;

    public Double calcularRendimentos() {
        return null;
    }

    @Override
    public Double transferir(Double valor, Conta conta) throws Exception {
        throw new OperacaoNaoPermitidaException();
    }
}
