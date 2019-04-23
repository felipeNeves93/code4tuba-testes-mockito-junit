package com.pd.cliente;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
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

    @Builder
    public PessoaFisica(Long id, Endereco endereco, String nome, String sobrenome, String cpf, Double renda) {
        super.setId(id);
        super.setEndereco(endereco);
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.renda = renda;
    }
}
