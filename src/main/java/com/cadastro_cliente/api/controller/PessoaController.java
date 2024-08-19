package com.cadastro_cliente.api.controller;

import com.cadastro_cliente.api.model.Pessoa;
import com.cadastro_cliente.api.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class PessoaController {

    @Autowired
    private PessoaRepository repository;

    @PostMapping("/cadastrar")
    public Pessoa criarCadastro(@RequestBody Pessoa pessoa) {
        return repository.save(pessoa);
    }

    @GetMapping("/lista")
    public List<Pessoa> listaCadastro() {
        return repository.findAll();
    }

}
