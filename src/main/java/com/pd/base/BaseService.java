package com.pd.base;

import java.util.List;

public interface BaseService<E> {
    E buscarPorId(Long id);

    E salvar(E entidade);

    List<E> listarTodos();
}
