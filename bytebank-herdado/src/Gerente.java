import testeDeClasse.FuncionarioTeste;

public class Gerente extends Funcionario implements Autenticavel {

	private AutenticacaoUtil au;
	
	public Gerente() {
		this.au = new AutenticacaoUtil();

	}

	public double getBonificacao() {
		System.out.println("Chamando Bonificacao do Gerente");
		return super.getSalario();
	}


	@Override
	public void setSenha(int senha) {
		this.au.setSenha(senha);

	}

	@Override
	public boolean autentica(int senha) {
		
		boolean autenticou = this.au.autentica(senha);
		return autenticou;

	}

}