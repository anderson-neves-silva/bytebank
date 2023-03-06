package composto;

public class Conta {
	double saldo;
	int agencia;
	int numero;
	Cliente titular;  // aqui eu mudo o tipo da variável String para o tipo Cliente que possibilita fazer a ligação ou referência da conta para a classe cliente
	
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
	
	public boolean transfere(double valor, Conta destino) {  // criando o método que possui dois parâmetros, note que o segundo ele é uma referência ou seta para uma conta
		if (this.saldo >= valor) {  // checa se a conta possui valor disponível para transferir
			saca(valor);  // e se sim utiliza o método já criado chamado saca para retira o valor da conta origem
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}
	}
}
