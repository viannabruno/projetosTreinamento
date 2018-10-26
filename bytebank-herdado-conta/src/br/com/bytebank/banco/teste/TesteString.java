package br.com.bytebank.banco.teste;

public class TesteString {

	public static void main(String[] args) {

		// String vazio = " Alura ";
		// String nome = "Alura";// object literal
		// String outro = new String("Alura");

		// String outro = nome.toLowerCase();

		// nome = nome.replace("A", "O");

		// System.out.println(nome);
		// System.out.println(outro);

		// String outroVazio = vazio.trim();
		// System.out.println(vazio);
		// System.out.println(outroVazio.isEmpty());
		// System.out.println(outroVazio);
		// System.out.println(vazio.contains("Alu"));

		// outro = nome.toUpperCase();

		// System.out.println(nome);
		// System.out.println(outro);

		// char c = nome.charAt(2);
		// System.out.println(c);

		// int pos = nome.indexOf("ur");
		// System.out.println(pos);

		// String sub = nome.substring(1);
		// System.out.println(sub);

		// System.out.println(nome.length());

		// for(int i = 0; i < nome.length(); i++) {
		// System.out.println(nome.charAt(i));
		// }

		// String texto = "Socorram";
		// texto = texto.concat("-");
		// texto = texto.concat("me");
		// texto = texto.concat(", ");
		// texto = texto.concat("subi ");
		// texto = texto.concat("no ");
		// texto = texto.concat("ônibus ");
		// texto = texto.concat("em ");
		// texto = texto.concat("Marrocos");
		// System.out.println(texto);

		// StringBuilder builder = new StringBuilder("Socorram");
		// builder.append("-");
		// builder.append("me");
		// builder.append(", ");
		// builder.append("subi ");
		// builder.append("no ");
		// builder.append("ônibus ");
		// builder.append("em ");
		// builder.append("Marrocos");
		// String texto = builder.toString();
		// System.out.println(texto);

		String nome = "ALURA";
		CharSequence cs = new StringBuilder("al");

		nome = nome.replace("AL", cs);

		System.out.println(nome);

	}

}
