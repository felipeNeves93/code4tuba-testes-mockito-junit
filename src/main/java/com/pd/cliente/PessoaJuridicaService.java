package com.pd.cliente;

import java.util.Optional;

public interface PessoaJuridicaService {

    PessoaJuridica salvar(PessoaJuridica entity);

    Optional<PessoaJuridica> buscarPorId(Long id);
}
