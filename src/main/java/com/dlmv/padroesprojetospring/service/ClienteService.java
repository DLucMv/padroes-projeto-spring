package com.dlmv.padroesprojetospring.service;


import com.dlmv.padroesprojetospring.model.Cliente;

/**
 * Esta interface define o padrão Strategy no domínio de cliente.
 * Com o padrão Strategy podemos ter multiplas implementações de uma mesma
 * interface.
 */
public interface ClienteService {

    Iterable<Cliente> buscarTodos();

    Cliente buscarPorId(Long id);

    void inserir(Cliente cliente);

    void atualizar(Long id, Cliente cliente);

    void deletar(Long id);

}