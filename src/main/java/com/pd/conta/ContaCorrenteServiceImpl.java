package com.pd.conta;

import java.util.Optional;

public class ContaCorrenteServiceImpl implements ContaCorrenteService {

    private ContaCorrenteRepository contaCorrenteRepository;

    public ContaCorrenteServiceImpl(ContaCorrenteRepository contaCorrenteRepository) {
        this.contaCorrenteRepository = contaCorrenteRepository;
    }

    @Override
    public ContaCorrente salvar(ContaCorrente contaCorrente) {
        return contaCorrenteRepository.save(contaCorrente);
    }

    @Override
    public Optional<ContaCorrente> buscarPorId(Long id) {
        return contaCorrenteRepository.findById(id);
    }
}
