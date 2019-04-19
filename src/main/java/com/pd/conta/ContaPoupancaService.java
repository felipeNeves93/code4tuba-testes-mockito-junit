package com.pd.conta;

import java.util.Optional;

public interface ContaPoupancaService {

    ContaPoupanca salvar(ContaPoupanca contaPoupanca);

    Optional<ContaPoupanca> buscarPorId(Long id);
}
