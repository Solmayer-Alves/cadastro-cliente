package com.cadastro_cliente.api.controller;

import com.cadastro_cliente.api.model.Pessoa;
import com.cadastro_cliente.api.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cliente")
public class ApiController {

    @Autowired
    private ApiService service;

    @PostMapping("/cadastrar")
    public Pessoa cadastrar(@RequestBody Pessoa pessoa) {
        return service.salvaCadastro(pessoa);
    }

    @GetMapping("/lista")
    public List<Pessoa> listar() {
        return service.listaCadastro();
    }

    @GetMapping("/{id}")
    public Optional <Pessoa> listarPorId(@PathVariable ("id") Integer id) {
        return service.listaPorId(id);
    }

    @PutMapping("/atualizar")
    public Pessoa atualizar(@RequestBody Pessoa pessoa) {
        return service.atualizaCadastro(pessoa);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable ("id") Integer id) {
        service.deletaCadastro(id);
    }
}
