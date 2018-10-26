
public class TestaGetESet {
	public static void main(String[] args) {
		Conta conta = new Conta(50, 50);
		conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		Cliente paulo = new Cliente();
		paulo.setNome("Paulo Paulo");
		
		conta.setTitular(paulo);
		
		System.out.println(conta.getTitular());
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Profissao");
		conta.getTitular().setCpf("333.333.333-33");
		
		System.out.println(conta.getTitular().getProfissao());
		System.out.println(conta.getTitular().getCpf());
		
	}

}
