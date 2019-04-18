package com.pd.cliente;

import java.util.Optional;

public class PessoaJuridicaServiceImpl implements PessoaJuridicaService {

    private final PessoaJuridicaRepository pessoaJuridicaRepository;

    public PessoaJuridicaServiceImpl() {
        this.pessoaJuridicaRepository = new PessoaJuridicaRepository();
    }

    @Override
    public PessoaJuridica salvar(PessoaJuridica entity) {
        return pessoaJuridicaRepository.save(entity);
    }

    @Override
    public Optional<PessoaJuridica> buscarPorId(Long id) {
        return pessoaJuridicaRepository.findById(id);
    }
}
