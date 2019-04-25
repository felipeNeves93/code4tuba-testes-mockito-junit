package com.pd.cliente;

import com.pd.conta.Conta;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

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
    public PessoaJuridica(Long id, List<Conta> contas, LocalDateTime dataCriacaoCadastro,
                          boolean ativo, LocalDateTime dataEncerramentoCadastro,
                          Endereco endereco, String razaoSocial, String cnpj,
                          Double capital, boolean situacaoFinanceiraOkEmpresa) {
        super(id, contas, dataCriacaoCadastro, ativo, dataEncerramentoCadastro, endereco);
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.capital = capital;
        this.situacaoFinanceiraOkEmpresa = situacaoFinanceiraOkEmpresa;
    }

    private boolean isCapitalPositivo() {
        return capital > 0;
    }

    @Builder
    public void setSituacaoFinanceiraEmpresa() {
        if (isCapitalPositivo()) {
            this.situacaoFinanceiraOkEmpresa = Boolean.TRUE;
        } else {
            this.situacaoFinanceiraOkEmpresa = Boolean.FALSE;
        }
    }
}
