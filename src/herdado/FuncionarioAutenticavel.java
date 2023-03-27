package herdado;
/*
 * -essa classe é intermediária a classe Funcionario, ele usada apenas para permitir apenas usuário autorizados a usar
 * o sistema, ela é só para conceito.
 * -classes abstratas não são obrigadas a implementar métodos abstratos.
 */
public abstract class FuncionarioAutenticavel extends Funcionario {
	
	private int senha;	
	
	// método que adiciona uma senha.
	public void setSenha(int senha) {
		this.senha = senha;
	}
	/*
	 * -método que verifica se a senha está correta.
	 * -na orientação a objetos existe um outro conceito que se chama sobrecarga, isso é dois métodos com o mesmo nome 
	 * na mesma classe mas um apenas passando um parâmetro e outro passando com dois parâmetros, e também pode variar 
	 * os tipos dos parâmetros em ambos os métodos, segue a assinatura como seria um exemplo de sobrecarga,
	 * public boolean autentica(String login int senha) {}, note que tem que passamos dois parâmetros aqui.
	 */
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}

}
