package bytebank;

public class Conta {
	double saldo;
	int agencia;
	int numero;
	String titular;
	
	public void deposita(double valor) {  // criando um método ou comportamento, quando você não retorna nada como resposta em um método use o void
		this.saldo += valor;  // o this ele se refere ao objeto criando onde usamos o new, ele se refere a esse objeto
	}
	
	public boolean saca(double valor) {  // criando um método com retorno que faz o saque, aqui a resposta é devolvida como um boolean se é possível sacar ou não
		if (this.saldo >= valor) {  // esse if verifica se a conta possui dinheiro suficiente para o saque
			this.saldo -= valor;
			return true;  // o return para a execução do método e volta para quem estava chamando e retorna o valor
		} else {
			return false;
		}
	}
}
