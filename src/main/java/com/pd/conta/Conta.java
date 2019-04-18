package com.pd.conta;

import com.pd.cliente.Cliente;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public abstract class Conta implements OperacoesBancarias {

    private String numero;
    private LocalDateTime dataAbertura;
    private LocalDateTime dataFDechamento;
    private Cliente cliente;
    private Double valorAtual;
    private Double taxaTransferencia;
}
