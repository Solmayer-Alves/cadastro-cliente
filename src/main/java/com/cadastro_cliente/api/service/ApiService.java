package com.cadastro_cliente.api.service;

import com.cadastro_cliente.api.model.Pessoa;
import com.cadastro_cliente.api.repository.ApiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ApiService {

    @Autowired
    private ApiRepository repository;

    public Pessoa salvaCadastro(Pessoa pessoa) {
        return repository.save(pessoa);
    }

    public List<Pessoa> listaCadastro() {
        return repository.findAll();
    }

    public Optional<Pessoa> listaPorId(Integer id) {
        return repository.findById(id);
    }

    public Pessoa atualizaCadastro(Pessoa pessoa) {
        return repository.save(pessoa);
    }

    public void deletaCadastro(Integer id) {
        repository.deleteById(id);
    }
}
