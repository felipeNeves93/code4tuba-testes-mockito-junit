package com.pd.cliente;

import com.pd.base.BaseServiceImpl;

public class PessoaFisicaServiceImpl extends BaseServiceImpl<PessoaFisicaRepository, PessoaFisica>
        implements PessoaFisicaService {


    @Override
    public PessoaFisica salvar(PessoaFisica entidade) {
        return entidade;
    }

    @Override
    public PessoaFisica buscarPorId(Long id) {
        return PessoaFisica.builder().build();
    }
}
