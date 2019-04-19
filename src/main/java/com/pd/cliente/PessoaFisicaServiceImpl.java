package com.pd.cliente;

import java.util.Optional;

public class PessoaFisicaServiceImpl implements PessoaFisicaService {

    private final PessoaFisicaRepository pessoaFisicaRepository;

    public PessoaFisicaServiceImpl(PessoaFisicaRepository pessoaFisicaRepository) {
        this.pessoaFisicaRepository = pessoaFisicaRepository;
    }

    @Override
    public PessoaFisica salvar(PessoaFisica entity) {
        return pessoaFisicaRepository.save(entity);
    }

    @Override
    public Optional<PessoaFisica> buscarPorId(Long id) {
        return pessoaFisicaRepository.findById(id);
    }
}
