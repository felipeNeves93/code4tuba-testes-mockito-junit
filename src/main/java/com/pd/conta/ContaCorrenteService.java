package com.pd.conta;

import java.util.Optional;

public interface ContaCorrenteService {

    ContaCorrente salvar(ContaCorrente contaCorrente);

    Optional<ContaCorrente> buscarPorId(Long id);
}
