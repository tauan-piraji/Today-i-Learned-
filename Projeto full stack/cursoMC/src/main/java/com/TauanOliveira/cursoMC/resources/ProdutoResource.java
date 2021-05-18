package com.TauanOliveira.cursoMC.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.TauanOliveira.cursoMC.domain.Produto;
import com.TauanOliveira.cursoMC.dto.ProdutoDTO;
import com.TauanOliveira.cursoMC.services.ProdutoService;

@RestController
@RequestMapping(value="/produtos")
public class ProdutoResource {
	
	@Autowired
	public ProdutoService service;
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public ResponseEntity<Produto> find(@PathVariable Integer id) {
		Produto obj = service.find(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<ProdutoDTO>> findAll() {
		List<Produto> list = service.findAll();
		List<ProdutoDTO> listDTO = list.stream().map( obj -> new ProdutoDTO(obj)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDTO);
	}
}