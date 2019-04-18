package com.pd.cliente;

import lombok.*;

import java.util.Objects;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Endereco {

    private Long id;
    private String cidade;
    private String estado;
    private String bairro;
    private String rua;
    private String cep;

    private boolean isCampoPreenchido(String campo) {
        return Objects.nonNull(campo) ? !campo.isBlank() : Boolean.FALSE;
    }

    public boolean isEnderecoCompleto() {
        if (isCampoPreenchido(cidade) &&
                isCampoPreenchido(estado) &&
                isCampoPreenchido(bairro) &&
                isCampoPreenchido(rua) &&
                isCampoPreenchido(cep)) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}

