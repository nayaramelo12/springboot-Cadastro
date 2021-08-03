package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.EnderecoEntity;
import com.example.demo.service.EnderecoService;

@RestController
@RequestMapping("/endereco")
public class EnderecoController {

	@Autowired
	private EnderecoService enderecoService;
	
	@GetMapping
	public ResponseEntity<List<EnderecoEntity>> getEndereco(){
		List<EnderecoEntity> list = enderecoService.getEndereco();
		return ResponseEntity.ok(list);
	}
	
	@PostMapping
	public ResponseEntity<EnderecoEntity> salvarEndereco(@RequestBody EnderecoEntity entitidade){
		EnderecoEntity endereco = enderecoService.salvarEndereco(entitidade);
		return ResponseEntity.ok(endereco);
	}
	
	@PutMapping
	public ResponseEntity<EnderecoEntity> atualizarEndereco(@RequestBody EnderecoEntity entitidade){
		EnderecoEntity endereco = enderecoService.atualizarEndereco(entitidade);
		return ResponseEntity.ok(endereco);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Object> deletarEndereco(@PathVariable Integer id){
		enderecoService.deletarEndereco(id);
		return ResponseEntity.noContent().build();
	}
}
