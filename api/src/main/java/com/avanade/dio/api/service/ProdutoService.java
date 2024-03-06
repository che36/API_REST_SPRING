package com.avanade.dio.api.service;

import com.avanade.dio.api.models.Produto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class ProdutoService {
    public List<Produto> findAll() {
        List<Produto> listaProduto = new ArrayList<Produto>();
        Produto p1 = new Produto(1, "descricao 1", new Date(), "123456", true);
        Produto p2 = new Produto(2, "descricao 2", new Date(), "12345678", true);
        listaProduto.add(p1);
        listaProduto.add(p2);
        return listaProduto;
    }

    public void inserir(Produto produto) {
        System.out.println("Inserido: " + produto);
    }
}
