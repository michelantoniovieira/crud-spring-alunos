package br.mic.crud.service;

import java.util.List;

import br.mic.crud.model.Aluno;

import java.util.List;

import br.mic.crud.model.Aluno;

import java.util.List;

import br.mic.crud.model.Aluno;

public interface AlunoService
{
	List<Aluno> getAllAlunos();
	
	Aluno salvarAluno(Aluno aluno);
	
	Aluno getAlunoById(Integer id);
	
	Aluno atualizarAluno(Aluno aluno);
	
	void excluirAlunoById(Integer id);
}
