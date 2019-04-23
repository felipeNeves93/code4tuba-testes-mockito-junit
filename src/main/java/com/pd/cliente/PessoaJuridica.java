package com.pd.cliente;

import lombok.Builder;

@Builder
public class PessoaJuridica extends Cliente {

    private String razaoSocial;
    private String cnpj;
    private Double capital;
    private boolean situacaoFinanceiraOkEmpresa;

    private boolean isCapitalPositivo() {
        return capital > 0;
    }

    public void setSituacaoFinanceiraEmpresa() {
        if (isCapitalPositivo()) {
            this.situacaoFinanceiraOkEmpresa = Boolean.TRUE;
        } else {
            this.situacaoFinanceiraOkEmpresa = Boolean.FALSE;
        }
    }
}
