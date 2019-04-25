package com.pd.conta;

import com.pd.base.exception.OperacaoNaoPermitidaException;
import com.pd.cliente.Cliente;
import lombok.Builder;

import java.time.LocalDateTime;

public class ContaPoupanca extends Conta {

    private static final Double TAXA_RENDIMENTO_MES = 0.3715;

    @Builder
    public ContaPoupanca(String numero, LocalDateTime dataAbertura, LocalDateTime dataFDechamento,
                         Cliente cliente, Double valorAtual, Double taxaTransferencia) {
        super(numero, dataAbertura, dataFDechamento, cliente, valorAtual, taxaTransferencia);
    }

    public Double calcularRendimentos(Long quantidadeMeses) {

        return (this.getValorAtual() * TAXA_RENDIMENTO_MES) * quantidadeMeses;
    }

    @Override
    public Double transferir(Double valor, Conta conta) throws Exception {
        throw new OperacaoNaoPermitidaException();
    }
}
