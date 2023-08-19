package com.minhaprimeiraapicomjava.ajs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.minhaprimeiraapicomjava.ajs.model.Produto;
import com.minhaprimeiraapicomjava.ajs.service.ProdutoService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/produtos")
public class ProdutoController {

	@Autowired
	ProdutoService produtoService;
	// outra maneira
	// private final ProdutoService produtoService;
	
	@GetMapping
	public String hello() {
		produtoService.obter();
		return "hello";
	}
	
	@PostMapping()
	public ResponseEntity<Produto> criar(@RequestBody Produto produto){
		log.info("Descricao do produto: {}", produto.getDescricao());
		return ResponseEntity.ok(produto);
	}
}
