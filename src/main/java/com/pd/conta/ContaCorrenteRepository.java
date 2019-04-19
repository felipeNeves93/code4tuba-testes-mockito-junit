package com.pd.conta;

import java.util.Optional;

public interface ContaCorrenteRepository {

    ContaCorrente save(ContaCorrente entity);

    Optional<ContaCorrente> findById(Long id);
}
