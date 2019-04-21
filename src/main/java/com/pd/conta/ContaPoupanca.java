package com.pd.conta;

import com.pd.base.exception.OperacaoNaoPermitidaException;
import lombok.Builder;

@Builder
public class ContaPoupanca extends Conta {

    private static final Double TAXA_RENDIMENTO_MES = 0.3715;

    public Double calcularRendimentos(Long quantidadeMeses) {

        return (this.getValorAtual() * TAXA_RENDIMENTO_MES) * quantidadeMeses;
    }

    @Override
    public Double transferir(Double valor, Conta conta) throws Exception {
        throw new OperacaoNaoPermitidaException();
    }
}
