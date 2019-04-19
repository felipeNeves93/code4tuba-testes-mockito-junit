package com.pd.conta;

import java.util.Optional;

public class ContaPoupancaServiceImpl implements ContaPoupancaService {

    private final ContaPoupancaRepository contaPoupancaRepository;

    public ContaPoupancaServiceImpl(ContaPoupancaRepository contaPoupancaRepository) {
        this.contaPoupancaRepository = contaPoupancaRepository;
    }


    @Override
    public ContaPoupanca salvar(ContaPoupanca contaPoupanca) {
        return contaPoupancaRepository.save(contaPoupanca);
    }

    @Override
    public Optional<ContaPoupanca> buscarPorId(Long id) {
        return contaPoupancaRepository.findById(id);
    }
}
