package com.pd.conta;

public interface OperacoesBancarias {

    Double sacar(Double valor);

    Double transferir(Double valor, Conta conta);

    Double depositar(Double valor);
}
