package com.pd.cliente;

import lombok.*;

@Builder
public class PessoaJuridica extends Cliente {

    private String razaoSocial;
    private String cnpj;
    private Double capital;

    public boolean isCapitalPositivo() {
        return capital > 0;
    }
}
