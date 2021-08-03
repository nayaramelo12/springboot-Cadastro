package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.PessoaEntity;
import com.example.demo.service.PessoaService;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {
	
	@Autowired
	private PessoaService pessoaService;
	
	@GetMapping
	public ResponseEntity<List<PessoaEntity>> getPessoas(){
		List<PessoaEntity> list = pessoaService.getPessoas();
		return ResponseEntity.ok(list);
	}
	
	@PostMapping
	public ResponseEntity<PessoaEntity> salvarPessoa(@RequestBody PessoaEntity entitidade){
		PessoaEntity pessoa = pessoaService.salvarPessoa(entitidade);
		return ResponseEntity.ok(pessoa);
	}
	
	@PutMapping
	public ResponseEntity<PessoaEntity> atualizarPessoa(@RequestBody PessoaEntity entitidade){
		PessoaEntity pessoa = pessoaService.atualizarPessoa(entitidade);
		return ResponseEntity.ok(pessoa);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Object> deletarPessoa(@PathVariable Integer id){
		pessoaService.deletarPessoa(id);
		return ResponseEntity.noContent().build();
	}

}
