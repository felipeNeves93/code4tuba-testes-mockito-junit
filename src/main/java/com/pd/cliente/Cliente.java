package com.pd.cliente;

import com.pd.conta.Conta;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public abstract class Cliente {

    private List<Conta> contas = new ArrayList<>();
    private LocalDateTime dataCriacaoCadastro;
    private boolean ativo;
    private LocalDateTime dataEncerramentoCadastro;
    private Endereco endereco;
}
