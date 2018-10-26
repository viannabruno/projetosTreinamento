package br.com.bytebank.banco.teste;

public class TesteArrayDePrimitivos {

	public static void main(String[] args) {

		int[] idades = new int[5];

		//idades[0] = 29;
		//idades[1] = 39;
		//idades[2] = 49;
		//idades[3] = 59;
		//idades[4] = 69;

		//int idade1 = idades[3];

		//System.out.println(idade1);
		//System.out.println(idades.length);
		
		for(int i = 0; i< idades.length; i++) {
			//System.out.println("idades[]: " + idades[i]);
			//System.out.println("i: "+ i);
			idades[i] = i *i;
			//System.out.println("idades[]: " + idades[i]);
			//System.out.println("i: "+ i);
		}
		
		for(int i = 0; i< idades.length; i++) {
			System.out.println(idades[i]);
		}

	}

}
