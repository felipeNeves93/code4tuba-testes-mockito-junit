package com.pd.conta;

import java.util.Optional;

public interface ContaSalarioService {

    ContaSalario salvar(ContaSalario contaSalario);

    Optional<ContaSalario> buscarPorId(Long id);
}
