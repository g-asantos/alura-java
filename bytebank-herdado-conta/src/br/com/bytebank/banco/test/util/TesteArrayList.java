package br.com.bytebank.banco.test.util;

import java.util.LinkedList;
import java.util.List;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayList {
	public static void main(String[] args) {
		
		List<Conta> lista = new ArrayList<Conta>();
		
		Conta cc = new ContaCorrente(22, 22);
		
		Conta cc2 = new ContaCorrente(32, 22);
		
		lista.add(cc);
		lista.add(cc2);
		
		System.out.println(lista.size());
		
		Conta ref = lista.get(0);
		
		System.out.println(ref.getNumero());
		
		lista.remove(0);
		
		System.out.println("Tamanho: " + lista.size());
		
		for (int i = 0; i < lista.size(); i++) {
			Object oRef = lista.get(i);
			System.out.println(oRef);
		}
		
		for (Object oRef : lista) {
			System.out.println(oRef);
		}
	}
}
