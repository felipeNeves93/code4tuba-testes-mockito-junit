package com.pd.cliente;

import java.util.Optional;

public class EnderecoRepository {

    public Endereco save(Endereco entity) {
        return entity;
    }

    public Optional<Endereco> findById(Long id) {
        return Optional.empty();
    }
}
