package herdado;
// a classe Gerente herda tudo da classe Funcionario.
public class Gerente extends Funcionario {

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
	/*
	 * -aqui eu mudo de this para super pois o atributo salário não está defenido aqui na classe Gerente, ele está
	 * defenido na super classe sendo a classe Funcionário, pois sabemos que o this guarda a referência do atributo 
	 * da classe onde ele está presente.
	 * -public double getBonificacao() {}, essa linha é conhecida como a assinatura do método, note que ele está escrito 
	 * aqui igual está escrito na classe Funcionario, a característica de reescrita que é o que estamos fazendo aqui é 
	 * usar a mesma assinatura mas pode variar algumas coisas de um para o outro.
	 * -reaproveitando o método criado na super classe, estamos usando o método getBonificacao() {} padrão implementado
	 * na classe Funcionario, com isso não duplicamos código, reaproveito também o acesso ao método getSalario() {} o
	 * e com isso mudo a visibilidade dele lá na super classe de protected para private.
	 */
	public double getBonificacao() {
		return super.getBonificacao() + super.getSalario();
	}
	
}
