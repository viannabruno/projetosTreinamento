
public class Cliente implements Autenticavel {

	private AutenticacaoUtil au;

	public Cliente() {
		this.au = new AutenticacaoUtil();

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
