package br.mic.crud.model.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.mic.crud.model.Aluno;
import br.mic.crud.service.AlunoService;

@Controller
public class AlunoController
{
	private AlunoService alunoService;

	public AlunoController(AlunoService alunoService)
	{
		super();
		this.alunoService = alunoService;
	}
	
	@GetMapping("/alunos")
	public String listarAlunos(Model model)
	{
		model.addAttribute("alunos", alunoService.getAllAlunos());
		return "alunos.html";
	}
	
	@GetMapping("/alunos/cadastro")
	public String cadastrarAlunoViaForm(Model model)
	{
		Aluno aluno = new Aluno();
		model.addAttribute("aluno", aluno);
		return "cadastrarAluno.html";
	}

	@PostMapping("/alunos")
	public String salvarAluno(@ModelAttribute("aluno") Aluno aluno)
	{
		alunoService.salvarAluno(aluno);
		return "redirect:/alunos";
	}
	
	@GetMapping("/alunos/editar/{id}")
	public String editarAlunoViaForm(@PathVariable Integer id, Model model)
	{
		Aluno aluno = new Aluno();
		model.addAttribute("aluno", alunoService.getAlunoById(id));
		return "atualizarAluno.html";
	}
	
	@PostMapping("/alunos/{id}")
	public String atualizarAluno(@PathVariable Integer id, @ModelAttribute("aluno") Aluno aluno,Model model)
	{
		Aluno existenciaDoAluno = alunoService.getAlunoById(id);
		existenciaDoAluno.setId(aluno.getId());
		existenciaDoAluno.setNome(aluno.getNome());
		existenciaDoAluno.setSobrenome(aluno.getSobrenome());
		existenciaDoAluno.setIdade(aluno.getIdade());
		existenciaDoAluno.setEmail(aluno.getEmail());
		alunoService.atualizarAluno(existenciaDoAluno);
		
		return "redirect:/alunos";
	}
	
	@GetMapping("/alunos/excluir/{id}")
	public String excluirAlunoViaForm(@PathVariable Integer id)
	{
		Aluno aluno = new Aluno();
		alunoService.excluirAlunoById(id);
		return "redirect:/alunos";
	}
	
	
}
