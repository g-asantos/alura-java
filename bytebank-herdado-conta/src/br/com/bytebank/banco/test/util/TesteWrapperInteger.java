package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {
	public static void main(String[] args) {
           int idade = 29;//Integer
           
           
           Integer idadeRef = Integer.valueOf(idade);
           int valor = idadeRef.intValue();
           
           
           String s = args[0];
           
           Integer numero = Integer.valueOf(s);
           int numero = Integer.parseInt(s);
           
           List<Integer> numeros = new ArrayList<Integer>();
           numeros.add(29); // Autoboxing
	}
}
