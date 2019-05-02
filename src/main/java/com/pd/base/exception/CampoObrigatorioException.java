package com.pd.base.exception;

public class CampoObrigatorioException extends IllegalArgumentException {

    private static final String CAMPO = "Campo Obrigatório: ";

    public CampoObrigatorioException(String s) {
        super(CAMPO.concat(s));
    }

    public CampoObrigatorioException(String s, String s1) {
        super(CAMPO.concat(s).concat(" e ").concat(s1));
    }
}
