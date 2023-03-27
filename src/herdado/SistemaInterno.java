package herdado;

public class SistemaInterno {
	// essa senha é a que o sistema interno guarda.
	private int senha = 2222;	
	
	// esse sistema só pode entrar que tem a senha correta, nesse caso apenas pessoas autorizadas.
	public void autentica(Autenticavel fa) {
		
		// passando a senha para o método autentica do gerente.
		boolean autenticou = fa.autentica(this.senha);
		if(autenticou) {
			System.out.println("Pode entrar no sistema!");
		} else {
			System.out.println("Não pode entrar no sistema!");
		}
	}

}
