package com.pd.cliente;

import java.util.Optional;

public interface EnderecoRepository {

    Endereco save(Endereco entity);

    Optional<Endereco> findById(Long id);
}
