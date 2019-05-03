package com.pd.cliente;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PessoaJuridica extends Cliente {

    private String razaoSocial;
    private String cnpj;
    private Double capital;
    private boolean situacaoFinanceiraOkEmpresa;

    @Builder
    public PessoaJuridica(Long id, LocalDateTime dataCriacaoCadastro,
                          boolean ativo, LocalDateTime dataEncerramentoCadastro,
                          Endereco endereco, String razaoSocial, String cnpj,
                          Double capital, boolean situacaoFinanceiraOkEmpresa) {
        super(id, dataCriacaoCadastro, ativo, dataEncerramentoCadastro, endereco);
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.capital = capital;
        this.situacaoFinanceiraOkEmpresa = situacaoFinanceiraOkEmpresa;
    }

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
