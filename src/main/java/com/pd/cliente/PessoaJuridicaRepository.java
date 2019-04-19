package com.pd.cliente;

import java.util.Optional;

public interface PessoaJuridicaRepository {

    PessoaJuridica save(PessoaJuridica entity);

    Optional<PessoaJuridica> findById(Long id);
}
