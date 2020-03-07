package com.emanuelcmesquita.dev.web.rest;

import com.emanuelcmesquita.dev.domain.Produto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ProdutoRest {

    @GetMapping("/produto/{id}")
    public Produto getProdutoById(@PathVariable int id){
        Produto p = new Produto();
        //Produto p = produtoService.findById(id);
        p.setId(id);
        return p;
    }
}
