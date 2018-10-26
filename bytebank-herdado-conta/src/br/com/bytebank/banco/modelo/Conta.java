package br.com.bytebank.banco.modelo;

import java.io.Serializable;

/**
 * 
 * @author bruno_o
 *
 */

public abstract class Conta extends Object implements Comparable<Conta>, Serializable {

	protected double saldo;
	private int agencia;
	private int numero;
	private transient Cliente titular;
	private static int total = 0;

	/**
	 * 
	 * @param agencia
	 * @param numero
	 */
	public Conta(int agencia, int numero) {
		Conta.total++;
		// System.out.println("O total de contas �: " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		// this.saldo = 100;
		// System.out.println("Estou criando uma conta " + this.numero);
	}

	public void deposita(double valor) {
		// this.saldo = this.saldo + valor;
		this.saldo += valor;
	}

	/**
	 * 
	 * @param valor
	 * @throws SaldoInsuficienteException
	 */
	public void saca(double valor) throws SaldoInsuficienteException {
		if (this.saldo < valor) {
			// problema
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + " Valor: " + valor);

		}
		// this.saldo = this.saldo - valor;
		this.saldo -= valor;

	}

	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
		this.saca(valor);
		destino.deposita(valor);

	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("n�o pode valores menores que 0");
			return;
		}
		this.numero = numero;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("n�o pode valores menores que 0");
			return;
		}
		this.agencia = agencia;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cliente getTitular() {
		return titular;
	}

	public static int getTotal() {

		return Conta.total;
	}
	
	@Override
	public int compareTo(Conta outra) {
		// TODO Auto-generated method stub
		
		
		return Double.compare(this.saldo, outra.saldo);
	}

	@Override
	public String toString() {
		return " numero : " + this.numero + " Agencia: " + this.agencia + " Saldo: " + this.saldo;
	}

	@Override
	public boolean equals(Object ref) {
		
		Conta conta = (Conta) ref;
		
		if(this.agencia != conta.agencia) {
			return false;
		}
		if (this.numero != conta.numero) {
			return false;
		}
		
		return true;
	}
	
	

}