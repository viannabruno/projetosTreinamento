package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int idade = 27;//integer
		Integer idadeRef = Integer.valueOf(29);
		int valor = idadeRef.intValue();
		
		System.out.println(idadeRef.doubleValue());
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Integer.SIZE);
		System.out.println(Integer.BYTES);
		
		
		String s = args[0];
		
		//Integer numero = Integer.valueOf(s);
		int numero = Integer.parseInt(s);
		
		System.out.println(numero);
		
		List<Integer> numeros = new ArrayList<Integer>();
		
		numeros.add(28);
		numeros.add(idade);
		numeros.add(idadeRef);
		
		System.out.println(numeros);
		
		Integer ref = Integer.valueOf("3");
        ref++;
        System.out.println(ref);

	}

}
