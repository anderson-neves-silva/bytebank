package herdado;

// a classe Gerente herda tudo da classe Funcionario.
public class Gerente extends Funcionario {

	private int senha;	
	
	// método que adiciona uma senha.
	public void setSenha(int senha) {
		this.senha = senha;
	}	
	
	// método que verifica se a senha está correta.
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}	
	/*
	 * aqui eu mudo de this para super pois o atributo salário não está defenido aqui na classe Gerente, ele está
	 * defenido na super classe sendo a classe Funcionário, pois sabemos que o this guarda a referência do atributo 
	 * da classe onde ele está presente.
	 * public double getBonificacao() {}, essa linha é conhecida como a assinatura do método, note que ele está escrito 
	 * aqui igual está escrito na classe Funcionario, a característica de reescrita que é o que estamos fazendo aqui é 
	 * usar a mesma assinatura mas pode variar algumas coisas de um para o outro
	 */
	public double getBonificacao() {
		return super.salario;
	}
	
}
