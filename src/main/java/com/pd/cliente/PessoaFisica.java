package com.pd.cliente;

import com.pd.base.exception.CampoObrigatorioException;
import lombok.*;

import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PessoaFisica extends Cliente {

    private String nome;
    private String sobrenome;
    private String cpf;
    private Double renda;

    @Builder
    public PessoaFisica(Long id, Endereco endereco, String nome, String sobrenome, String cpf, Double renda) {
        super.setId(id);
        super.setEndereco(endereco);
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.renda = renda;
    }

    public String getNomeCompleto() {
        if (!isNomeCompleto()) {
            throw new CampoObrigatorioException("Nome", "Sobrenome");
        }
        var nomeCompleto = new StringBuilder();
        nomeCompleto.append(nome)
                .append(" ")
                .append(sobrenome);

        return nomeCompleto.toString();
    }

    private Boolean isNomeCompleto() {
        return Objects.nonNull(this.nome) && Objects.nonNull(this.sobrenome);
    }
}
