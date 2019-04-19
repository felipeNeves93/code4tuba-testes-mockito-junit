package com.pd.base;

import java.util.List;

public class BaseServiceImpl<R extends BaseRepository<E>, E> implements BaseService<E> {

    protected R repository;

    @Override
    public E buscarPorId(Long id) {
        return repository.findById(id);
    }

    @Override
    public E salvar(E entidade) {
        return repository.save(entidade);
    }

    @Override
    public List<E> listarTodos() {
        return repository.findAll();
    }
}
