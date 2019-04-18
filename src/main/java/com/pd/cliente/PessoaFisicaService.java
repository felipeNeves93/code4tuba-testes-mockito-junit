package com.pd.cliente;

import java.util.Optional;

public interface PessoaFisicaService {

    PessoaFisica salvar(PessoaFisica entity);

    Optional<PessoaFisica> buscarPorId(Long id);
}
