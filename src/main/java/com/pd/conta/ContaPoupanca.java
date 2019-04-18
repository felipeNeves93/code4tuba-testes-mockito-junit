package com.pd.conta;

import lombok.Builder;

@Builder
public class ContaPoupanca extends Conta {

    private Double taxaRendimento;

    public Double calcularRendimentos(){
        // Método para calcular os rendimentos da conta baseados no tempo atual - tempo abertura.
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
