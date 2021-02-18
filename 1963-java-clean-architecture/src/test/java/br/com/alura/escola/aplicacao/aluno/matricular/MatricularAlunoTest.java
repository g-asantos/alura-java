package br.com.alura.escola.aplicacao.aluno.matricular;

import org.junit.jupiter.api.Test;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.CPF;
import br.com.alura.escola.infra.aluno.RepositorioDeAlunosEmMemoria;

class MatricularAlunoTest {

	@Test
	void alunoDeveriaSerPersistido() {
		RepositorioDeAlunosEmMemoria repositorio = new RepositorioDeAlunosEmMemoria();
		
		MatricularAluno useCase = new MatricularAluno(repositorio);
		
		MatricularAlunoDto dados = 
				new MatricularAlunoDto("Fulano", "123.456.789-22", "fulano@email.com");
		
		useCase.matricular(dados);
		
		Aluno encontrado = repositorio.buscarPorCPF(new CPF("123.456.789-22"));
	
		assertEquals("Fulano", encontrado.getNome());
	}

}
