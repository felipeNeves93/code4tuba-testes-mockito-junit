package com.pd.conta;

public interface OperacoesBancarias {

    Double sacar(Double valor) throws Exception;

    Double transferir(Double valor, Conta conta) throws Exception;

    void depositar(Double valor) throws Exception;
}
