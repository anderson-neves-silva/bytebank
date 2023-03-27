package herdado;

public class TesteSistema {

	public static void main(String[] args) {
		// criando o Gerente.
		Gerente g = new Gerente();
		g.setSenha(2222);
		
		// criando um Admistrador.
		Admistrador adm = new Admistrador();
		adm.setSenha(3333);
		
		// criando o sistema interno, e testando se o Gerente e o Admistrador tem acesso.
		SistemaInterno si = new SistemaInterno();
		si.autentica(g);
		si.autentica(adm);
		
	}

}
