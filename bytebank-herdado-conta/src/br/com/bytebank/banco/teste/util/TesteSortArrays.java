package br.com.bytebank.banco.teste.util;

import java.util.Arrays;

public class TesteSortArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numeros = new int[]{43, 15, 64, 22, 89};

        Arrays.sort(numeros); //método utilitário sort

        System.out.println(Arrays.toString(numeros)); //método utilitário toString

        //Saida : [15, 22, 43, 64, 89]
		

	}

}
