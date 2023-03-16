package herdado;
// a calsse gerente herda tudo da classe funcionario
public class Gerente extends Funcionario {

	private int senha;
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	// método que verifica se a senha está correta
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
		
//	public double getBonificacao() {
//		return this.salario;
//	}
	
}
