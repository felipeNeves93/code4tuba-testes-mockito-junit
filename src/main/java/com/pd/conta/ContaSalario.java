package com.pd.conta;

import com.pd.cliente.Cliente;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Builder
@Getter
@Setter
public class ContaSalario extends Conta {

    private Cliente empregador;

    @Override
    public Double depositar(Double valor) {
        if (Objects.nonNull(this.getEmpregador())) {
            return super.depositar(valor);
        }

        return null;
    }
}
