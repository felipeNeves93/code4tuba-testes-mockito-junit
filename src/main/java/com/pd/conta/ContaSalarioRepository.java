package com.pd.conta;

import java.util.Optional;

public interface ContaSalarioRepository {

    ContaSalario save(ContaSalario entity);

    Optional<ContaSalario> findById(Long id);
}
