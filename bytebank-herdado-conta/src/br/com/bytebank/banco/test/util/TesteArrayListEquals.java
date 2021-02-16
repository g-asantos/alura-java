package br.com.bytebank.banco.test.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {
	public static void main(String[] args) {
		
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		Conta cc = new ContaCorrente(22, 22);
		
		Conta cc2 = new ContaCorrente(32, 22);
		
		lista.add(cc);
		lista.add(cc2);
		
		Conta cc3 = new ContaCorrente(32, 22);

		
		boolean existe = lista.contains(cc3);
		
		System.out.println(existe);
		
		for (Object oRef : lista) {
			System.out.println(oRef);
		}
	}
}
