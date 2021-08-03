package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.PessoaEntity;
import com.example.demo.repository.PessoalRepository;

@Service
public class PessoaService {
	
	@Autowired
	private PessoalRepository pessoalRepository;
	
	public List<PessoaEntity> getPessoas(){
		List<PessoaEntity> list = pessoalRepository.findAll();
		return list;
	}
	
	public PessoaEntity salvarPessoa(PessoaEntity pessoa) {
		PessoaEntity pessoaEntity = pessoalRepository.save(pessoa);
		return pessoaEntity;
	}
	
	public PessoaEntity atualizarPessoa(PessoaEntity pessoa) {
		PessoaEntity pessoaEntity = pessoalRepository.save(pessoa);
		return pessoaEntity;
	}
	
	public void deletarPessoa(Integer id) {
		pessoalRepository.deleteById(id);
	}
}
