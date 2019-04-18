package com.pd.cliente;

import lombok.Builder;

@Builder
public class PessoaFisica extends Cliente {

    private String nome;
    private String sobrenome;
    private String cpf;
    private Double renda;

    public String getNomeCompleto() {
        var nomeCompleto = new StringBuilder();

        nomeCompleto.append(nome)
                .append(" ")
                .append(sobrenome);

        return nomeCompleto.toString();
    }
}
