package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.EnderecoEntity;
import com.example.demo.repository.EnderecoRepository;


@Service
public class EnderecoService {

	@Autowired
	private EnderecoRepository enderecoRepository;
	
	//pega a lista de endereços
	public List<EnderecoEntity> getEndereco(){
		List<EnderecoEntity> list = enderecoRepository.findAll();
		return list;
	}
	
	//salva endereços
	public EnderecoEntity salvarEndereco(EnderecoEntity endereco) {
		EnderecoEntity enderecoEntity = enderecoRepository.save(endereco);
		return enderecoEntity;
	}
	
	//atualiza endereços
	public EnderecoEntity atualizarEndereco(EnderecoEntity endereco) {
		EnderecoEntity enderecoEntity = enderecoRepository.save(endereco);
		return enderecoEntity;
	}
	
	//deleta endereços
	public void deletarEndereco(Integer id) {
		enderecoRepository.deleteById(id);
	}
}
