package com.pd.cliente;

import java.util.Optional;

public class EnderecoServiceImpl implements EnderecoService {

    private final EnderecoRepository enderecoRepository;

    public EnderecoServiceImpl() {
        this.enderecoRepository = new EnderecoRepository();
    }

    @Override
    public Endereco salvar(Endereco entity) {
        return enderecoRepository.save(entity);
    }

    @Override
    public Optional<Endereco> buscarPorId(Long id) {
        return enderecoRepository.findById(id);
    }
}
