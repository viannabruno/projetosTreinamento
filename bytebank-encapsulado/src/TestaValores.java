
public class TestaValores {
	public static void main(String[] args) {
		
		Conta conta = new Conta(1337, 22654);
		
		conta.deposita(1000);
		conta.saca(250);
		
		
		//conta.setAgencia(50);
		//conta.setNumero(-330);
		
		System.out.println(conta.getAgencia());
		System.out.println(conta.getSaldo());
		
		Conta conta2 = new Conta(1337, 233654);
		
		Conta conta3 = new Conta(1337, 2334);
		
		Conta conta4 = new Conta(556, 8855654);
		
		conta.transfere(200, conta4);
		
		conta.transfere(120, conta2);
		
		conta4.transfere(40, conta3);
		
		System.out.println("Saldo: " + conta4.getSaldo());
		System.out.println("Saldo: " + conta3.getSaldo());
		System.out.println("Saldo: " + conta2.getSaldo());
		System.out.println("Saldo: " + conta.getSaldo());
		
		System.out.println("Total de Contas: " + Conta.getTotal());
		
		
		
	}

}
