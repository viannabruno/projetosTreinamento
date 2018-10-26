package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {

//		Conta cc = new ContaCorrente(11, 11);
//
//		Conta cc2 = new ContaCorrente(22, 22);
//		
//		boolean igual = cc.ehIgual(cc2);
//		System.out.println(igual);

		 List<Conta> lista = new ArrayList<Conta>();
		
		 Conta cc = new ContaCorrente(11, 11);
		 lista.add(cc);
		
		 Conta cc2 = new ContaCorrente(22, 22);
		 lista.add(cc2);
		
		 Conta cc3 = new ContaCorrente(22, 22);
		 //lista.add(cc3);
		
		 boolean existe = lista.contains(cc3);
		
		 System.out.println("Ja Existe? " + existe);
		
//		 for(Conta conta : lista) {
//		 if(conta.equals(cc3)) {
//		 System.out.println("Ja tenho essa conta");
//		 }
//		 }
		
		 for(Conta oRef : lista) {
		 System.out.println(oRef);
		 }
		

	}
}
