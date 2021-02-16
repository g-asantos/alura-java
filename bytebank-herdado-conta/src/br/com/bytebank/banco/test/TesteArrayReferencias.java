package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {
	public static void main(String[] args) {
		
		Object[] referencias = new Object[5];
		
		ContaCorrente cc1 = new ContaCorrente(22, 11);
		
		contas[0] = cc1;
		
		
		ContaPoupanca cc2 = new ContaPoupanca(22, 22);
		
		contas[1] = cc2;
		
		Cliente cliente = new Cliente();
		contas[2] = cliente;
		
		System.out.println(cc1.getNumero());
		
//		Object referenciaGenerica = contas[0];
//		
//		System.out.println(referenciaGenerica[0].getNumero());
		
		Conta ref = contas[1];
		
		System.out.println(ref.getNumero());
		
		ContaCorrente ref2 = (ContaCorrente) contas[1];

	}
}
