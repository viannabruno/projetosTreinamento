
public class TestaBanco {
	
	public static void main(String[] args) {
		Cliente cliente1 = new Cliente();
		cliente1.nome = "Nome Um";
		cliente1.cpf = "222.222.222-22";
		cliente1.profissao = "programador";
		
		Conta conta1 = new Conta();
		conta1.deposita(100);
		
		
		conta1.titular = cliente1;
		
		System.out.println(conta1.titular.nome);
		System.out.println(conta1.titular);
		System.out.println(cliente1);
		
		//Conta conta2 = new Conta();
		//conta2.titular.nome = "Novo nome";
		//System.out.println(conta2.titular.nome);
		//System.out.println(conta2.titular);
		
	}

}
