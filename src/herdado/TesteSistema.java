package herdado;

public class TesteSistema {

	public static void main(String[] args) {
		// criando o Gerente.
		Gerente g = new Gerente();
		g.setSenha(2222);
		
		// criando um Admistrador.
		Administrador adm = new Administrador();
		adm.setSenha(3333);
		
		// criando um Cliente;
		Cliente cliente = new Cliente();
		cliente.setSenha(2222);
		
		// criando o sistema interno, e testando se o Gerente, Admistrador e o Cliente tem acesso.
		SistemaInterno si = new SistemaInterno();
		si.autentica(g);
		si.autentica(adm);
		si.autentica(cliente);		
	}

}
