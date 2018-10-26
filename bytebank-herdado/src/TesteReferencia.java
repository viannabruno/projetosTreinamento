
public class TesteReferencia {
	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		g1.setNome("Gerente1");
		g1.setSalario(5000.0);
		String nome = g1.getNome();
		
		
		EditorDeVideo e = new EditorDeVideo();
		e.setSalario(2500.0);
		
		Designer d = new Designer();
		d.setSalario(2000.0);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(e);
		controle.registra(d);
		
		System.out.println(controle.getSoma());
		
	}

}
