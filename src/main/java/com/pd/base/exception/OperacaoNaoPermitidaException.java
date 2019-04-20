package com.pd.base.exception;

public class OperacaoNaoPermitidaException extends Exception {

    public OperacaoNaoPermitidaException() {
        super("Operação não permitida para esse tipo de conta");
    }
}
