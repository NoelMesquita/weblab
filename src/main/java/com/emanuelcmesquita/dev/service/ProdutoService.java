package com.emanuelcmesquita.dev.service;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emanuelcmesquita.dev.domain.Produto;
import com.emanuelcmesquita.dev.repository.ProdutoRepository;

@Service
public class ProdutoService {
	
	private ProdutoRepository produtoRepository;
	
	@Autowired
	public ProdutoService(ProdutoRepository produtoRepository) {
		this.produtoRepository = produtoRepository;
	}
	
	//FIXME Implemente as operações aqui.

	public Produto findById(Long id) {
		return produtoRepository
				.findById(id)
				.orElseThrow(NoSuchElementException::new);
	}
	
}
