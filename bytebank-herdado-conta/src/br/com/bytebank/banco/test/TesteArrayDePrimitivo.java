package br.com.bytebank.banco.test;

public class TesteArrayDePrimitivo {
	
	// Array [] 
	
	public static void main(String[] args) {
		
		int[]idades = new int[5]; // inicializa o array com 0
		
		idades[0] = 29;
		idades[1] = 39;
		idades[2] = 249;
		idades[3] = 69;
		idades[4] = 49;
		
		for(int i = 0; i < idades.length; i++) {
			idades[i] = i * i;
		}
		
		for(int i = 0; i < idades.length; i++) {
			System.out.println(idades[i]);
		}

	}
}
