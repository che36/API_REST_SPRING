package com.avanade.dio.api.controller;

import com.avanade.dio.api.models.Produto;
import com.avanade.dio.api.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/produtos")
public class ProdutoController {
    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    public List<Produto> listar() {
        return produtoService.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void inserir(@RequestBody Produto produto) {
        produtoService.inserir(produto);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void alterar(@RequestBody Produto produto) {
        produtoService.alterar(produto);
    }

    @DeleteMapping
    @RequestMapping("{id}")
    public void excluir(@PathVariable Long id) {
        produtoService.excluir(id);
    }

}
