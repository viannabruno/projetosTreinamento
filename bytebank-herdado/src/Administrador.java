
public class Administrador extends Funcionario implements Autenticavel {

	private AutenticacaoUtil au;
	
	public Administrador() {
		this.au = new AutenticacaoUtil();
	}

	@Override
	public double getBonificacao() {
		return 50;
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
