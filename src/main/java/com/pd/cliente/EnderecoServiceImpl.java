package com.pd.cliente;

import com.pd.base.BaseServiceImpl;

public class EnderecoServiceImpl extends BaseServiceImpl<EnderecoRepository, Endereco> implements EnderecoService {

    @Override
    public Endereco buscarEnderecoPorPessoa(Long idPessoa) {
        return Endereco.builder()
                .id(1L)
                .build();
    }

    @Override
    public Endereco atualizarEndereco(Long idEndereco) {
        return null;
    }
}
