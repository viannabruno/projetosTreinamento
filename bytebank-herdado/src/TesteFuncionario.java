
public class TesteFuncionario {
	public static void main(String[] args) {
		
		Gerente funcionario = new Gerente();
		
		funcionario.setNome("Funcionario1");
		funcionario.setCpf("555.555.555-55");
		funcionario.setSalario(2500.0);
		
		System.out.println(funcionario.getNome());
		System.out.println(funcionario.getBonificacao());
		
	}

}
