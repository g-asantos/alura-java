package br.com.alura.escola.infra.aluno;

import br.com.alura.escola.dominio.aluno.CifradorDeSenha;

public class CifradorDeSenhaMD5 implements CifradorDeSenha {

	@Override
	public String cifrarSenha(String senha) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean validarSenhaCifrada(String senhaCifrada, String senha) {
		return senhaCifrada.equals(cifrarSenha(senha));
	}
	
}
