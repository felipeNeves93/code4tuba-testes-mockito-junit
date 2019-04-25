package com.pd.conta;

import com.pd.cliente.Cliente;
import lombok.*;

import java.time.LocalDateTime;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ContaCorrente extends Conta {

    private static final Double VALOR_UNITARIO_CARTAO = 3.0;
    private static final Double VALOR_UNITARIO_CHEQUE = 1.50;
    private Double limite;
    private Double taxasAdm;
    private Integer numeroCartoes;
    private Integer numeroCheques;

    @Builder
    public ContaCorrente(String numero, LocalDateTime dataAbertura, LocalDateTime dataFDechamento,
                         Cliente cliente, Double valorAtual, Double taxaTransferencia, Double limite,
                         Double taxasAdm, Integer numeroCartoes, Integer numeroCheques) {
        super(numero, dataAbertura, dataFDechamento, cliente, valorAtual, taxaTransferencia);
        this.limite = limite;
        this.taxasAdm = taxasAdm;
        this.numeroCartoes = numeroCartoes;
        this.numeroCheques = numeroCheques;
    }

    public Double getTaxasAdm() {
        return VALOR_UNITARIO_CARTAO + VALOR_UNITARIO_CHEQUE;
    }

    @Override
    public Double getValorAtual() {
        return super.getValorAtual() - this.getTaxasAdm();
    }
}
