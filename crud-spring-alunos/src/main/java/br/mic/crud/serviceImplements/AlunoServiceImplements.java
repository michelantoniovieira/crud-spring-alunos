package br.mic.crud.serviceImplements;

import java.util.List;
import org.springframework.stereotype.Service;
import br.mic.crud.model.Aluno;
import br.mic.crud.repository.AlunoRepository;
import br.mic.crud.service.AlunoService;

@Service
public class AlunoServiceImplements implements AlunoService
{

	private AlunoRepository alunoRepository;

	public AlunoServiceImplements(AlunoRepository alunoRepository)
	{
		super();
		this.alunoRepository = alunoRepository;
	}

	@Override
	public List<Aluno> getAllAlunos()
	{
		return alunoRepository.findAll();
	}

	@Override
	public Aluno salvarAluno(Aluno aluno)
	{
		return alunoRepository.save(aluno);
	}

	@Override
	public Aluno getAlunoById(Integer id)
	{
		return alunoRepository.findById(id).get();
	}

	@Override
	public Aluno atualizarAluno(Aluno aluno)
	{
		return alunoRepository.save(aluno);
	}

	@Override
	public void excluirAlunoById(Integer id)
	{
		alunoRepository.deleteById(id);
	}
	
	
}
