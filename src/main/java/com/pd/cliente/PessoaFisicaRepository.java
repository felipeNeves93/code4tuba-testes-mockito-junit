package com.pd.cliente;

import java.util.Optional;

public class PessoaFisicaRepository {

    public PessoaFisica save(PessoaFisica entity) {
        return entity;
    }

    public Optional<PessoaFisica> findById(Long id) {
        return Optional.empty();
    }
}
