package com.emanuelcmesquita.dev.web.rest;

import com.emanuelcmesquita.dev.domain.Produto;
import com.emanuelcmesquita.dev.service.ProdutoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//FIXME corrija e implemente os métodos para realizar CRUD em base de dados.
@RestController
@RequestMapping("/api")
public class ProdutoRest {
 
	
	@Autowired
	private ProdutoService produtoService;

    @GetMapping("/produto/{id}")
    public Produto getProdutoById(@PathVariable Long id){
		/*
		 * Produto p = new Produto(); //Produto p = produtoService.findById(id);
		 * p.setId(id);
		 */
    	
        return produtoService.findById(id);
    }
}
