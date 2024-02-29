package com.avanade.dio.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/produtos")
public class ProdutoController {
    @GetMapping
    public String listar() {
        return "Lista de Produtos";
    }
}
