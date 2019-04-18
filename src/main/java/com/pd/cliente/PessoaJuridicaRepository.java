package com.pd.cliente;

import java.util.Optional;

public class PessoaJuridicaRepository {
    public PessoaJuridica save(PessoaJuridica entity) {
        return entity;
    }

    public Optional<PessoaJuridica> findById(Long id) {
        return Optional.empty();
    }
}
