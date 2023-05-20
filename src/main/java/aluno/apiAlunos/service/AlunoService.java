package aluno.apiAlunos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aluno.apiAlunos.model.AlunoModel;
import aluno.apiAlunos.repository.AlunoRepository;

@Service
public class AlunoService {
	@Autowired
	private AlunoRepository alunoRepository;
	
	public void salvar(AlunoModel aluno) {
		alunoRepository.saveAndFlush(aluno);
	}
	
	public List<AlunoModel> buscarTodos(){
		return alunoRepository.findAll();
	}
	
	public Optional<AlunoModel> buscarPorId(long id){
		return alunoRepository.findById(id);
	}
	
	public void removerPorId(long id) {
		alunoRepository.deleteById(id);
	}

	

	public Optional<AlunoModel> buscarPorNome(String nome) {
		return alunoRepository.findByNome(nome);
	}

	public Optional<AlunoModel> buscarPorCurso(String curso) {
		return alunoRepository.findByCurso(curso);
	}
	public Optional<AlunoModel> buscarPorCampus(String campus) {
		return alunoRepository.findByCampus(campus);
	}
	
}
