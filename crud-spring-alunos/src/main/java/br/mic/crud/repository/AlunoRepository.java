package br.mic.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.mic.crud.model.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Integer>
{

}
