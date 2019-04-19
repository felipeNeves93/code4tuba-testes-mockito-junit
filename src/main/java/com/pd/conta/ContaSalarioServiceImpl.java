package com.pd.conta;

import java.util.Optional;

public class ContaSalarioServiceImpl implements ContaSalarioService {

    private final ContaSalarioRepository contaSalarioRepository;

    public ContaSalarioServiceImpl(ContaSalarioRepository contaSalarioRepository) {
        this.contaSalarioRepository = contaSalarioRepository;
    }

    @Override
    public ContaSalario salvar(ContaSalario contaSalario) {
        return contaSalarioRepository.save(contaSalario);
    }

    @Override
    public Optional<ContaSalario> buscarPorId(Long id) {
        return contaSalarioRepository.findById(id);
    }
}
