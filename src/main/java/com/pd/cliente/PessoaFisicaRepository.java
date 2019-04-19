package com.pd.cliente;

import java.util.Optional;

public interface PessoaFisicaRepository {

    PessoaFisica save(PessoaFisica entity);

    Optional<PessoaFisica> findById(Long id);
}
