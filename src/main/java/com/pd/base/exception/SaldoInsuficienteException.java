package com.pd.base.exception;

public class SaldoInsuficienteException extends Exception {

    public SaldoInsuficienteException(Double valorRetirar, Double valorConta) {
        super(new StringBuilder().append("O valor que deseja sacar: ")
                .append(valorRetirar)
                .append(" É superior ao saldo da conta: ")
                .append(valorConta).toString());
    }
}
