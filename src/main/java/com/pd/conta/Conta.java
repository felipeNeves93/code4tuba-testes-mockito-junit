package com.pd.conta;

import com.pd.base.exception.SaldoInsuficienteException;
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

    @Override
    public Double sacar(Double valor) throws Exception {
        if (valor > valorAtual) {
            throw new SaldoInsuficienteException(valor, valorAtual);
        }

        valorAtual -= valor;
        return valorAtual;
    }

    @Override
    public Double transferir(Double valor, Conta conta) throws Exception {

        conta.setValorAtual(conta.getValorAtual() + valor);

        return valor;
    }

    @Override
    public Double depositar(Double valor) {
        this.valorAtual += valor;
        return valorAtual;
    }
}
