package composto;

public class Conta {
	double saldo;
	int agencia;
	int numero;
	Cliente titular;  // aqui eu mudo o tipo da variável String para o tipo Cliente que possibilita fazer a ligação ou referência da conta para a classe cliente
	
	public void deposita(double valor) {  
		this.saldo += valor;  
	}
	
	public boolean saca(double valor) {  
		if (this.saldo >= valor) {  // possui dinheiro suficiente para o saque
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {  
		if (this.saldo >= valor) {  // possui valor disponível para transferir
			saca(valor);  // reutiliza o método saca para retira o valor da conta origem
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}
	}
}
