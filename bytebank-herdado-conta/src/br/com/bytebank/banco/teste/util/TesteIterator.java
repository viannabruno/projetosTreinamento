package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class TesteIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> nomes = new ArrayList<>();
		nomes.add("Super Mario");
		nomes.add("Yoshi"); 
		nomes.add("Donkey Kong"); 

		Iterator<String> it = nomes.iterator();

		while(it.hasNext()) {
		  System.out.println(it.next());
		}
		
		System.out.println(" -.-.-.-.-.- ");
		
		Set<String> nomes2 = new HashSet<>();
		nomes2.add("Super Mario2");
		nomes2.add("Yoshi2"); 
		nomes2.add("Donkey Kong2"); 

		Iterator<String> it2 = nomes2.iterator();

		while(it2.hasNext()) {
		  System.out.println(it2.next());
		}

	}

}
