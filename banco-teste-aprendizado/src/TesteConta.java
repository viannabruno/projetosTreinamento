
public class TesteConta {
	
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.setTitular("Fábio");
		conta.deposita(100.0);
		
	

		double valorSaque = 50.0;
		conta.saca(valorSaque);

		double valorDeposito = 70.0;
		conta.deposita(valorDeposito);
		
		System.out.println("Titular: " + conta.getTitular() + " Saldo: " + conta.getSaldo());
	}

}
