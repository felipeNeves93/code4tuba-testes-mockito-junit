package com.pd.conta;

import com.pd.base.exception.OperacaoNaoPermitidaException;
import com.pd.base.exception.SaldoInsuficienteException;
import com.pd.cliente.Cliente;
import lombok.*;

import java.time.LocalDateTime;
import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ContaSalario extends Conta {

    private Cliente empregador;

    @Builder
    public ContaSalario(String numero, LocalDateTime dataAbertura, LocalDateTime dataFDechamento,
                        Cliente cliente, Double valorAtual, Double taxaTransferencia, Cliente empregador) {
        super(numero, dataAbertura, dataFDechamento, cliente, valorAtual, taxaTransferencia);
        this.empregador = empregador;
    }

    @Override
    public void depositar(Double valor) {
        if (Objects.nonNull(this.getEmpregador())) {
            super.depositar(valor);
        }
    }
}
