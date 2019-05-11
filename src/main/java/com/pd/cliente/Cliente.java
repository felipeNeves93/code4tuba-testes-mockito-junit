package com.pd.cliente;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public abstract class Cliente {

    private Long id;
    private LocalDateTime dataCriacaoCadastro;
    private boolean ativo;
    private LocalDateTime dataEncerramentoCadastro;
    private Endereco endereco;
}
