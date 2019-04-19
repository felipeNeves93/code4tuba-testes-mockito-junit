package com.pd.conta;

import java.util.Optional;

public interface ContaPoupancaRepository {

    ContaPoupanca save(ContaPoupanca entity);

    Optional<ContaPoupanca> findById(Long id);
}
