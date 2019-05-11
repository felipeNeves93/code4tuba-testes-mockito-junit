package com.pd.cliente;

import com.pd.base.BaseService;

public interface EnderecoService extends BaseService<Endereco> {

    Endereco buscarEnderecoPorPessoa(Long idPessoa);

    Endereco atualizarEndereco(Long idEndereco);
}
