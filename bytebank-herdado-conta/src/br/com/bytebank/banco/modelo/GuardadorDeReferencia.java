package br.com.bytebank.banco.modelo;

public class GuardadorDeReferencia {
	
	private Object[] referencia;
	private int posicaoLivre;
	
	public GuardadorDeReferencia() {
		this.referencia = new Object[10];
		this.posicaoLivre = 0;
	}

	public void adiciona(Conta ref) {
		this.referencia[this.posicaoLivre] =ref;
		this.posicaoLivre++;
		
	}

	public int getQuantidadeDeElementos() {
		// TODO Auto-generated method stub
		return this.posicaoLivre;
	}

	public Object getReferencia(int pos) {
		// TODO Auto-generated method stub
		return this.referencia[pos];
	}

}
