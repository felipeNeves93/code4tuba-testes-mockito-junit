package com.pd.conta;

import com.pd.cliente.Cliente;
import lombok.Builder;

@Builder
public class ContaSalario extends Conta {

    private Cliente empregador;

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
