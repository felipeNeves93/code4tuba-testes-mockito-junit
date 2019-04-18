package com.pd.cliente;

import java.util.Optional;

public interface EnderecoService {

    Endereco salvar(Endereco entity);

    Optional<Endereco> buscarPorId(Long id);
}
