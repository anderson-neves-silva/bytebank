package encapsulado;

public class Conta {
	private double saldo;  // deixando esse atributo privado ou protegido, agora ele não pode ser lido e nem modificado, a não ser pela própria classe através dos métodos
	private int agencia;
	private int numero;
	private Cliente titular;  // aqui eu mudo o tipo da variável String para o tipo Cliente que possibilita fazer a ligação ou referência da conta para a classe cliente
	
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
	
	public double getSaldo() {  // método que devolvi o saldo
		return this.saldo;
	}
	
	public int getNumero() {  // método que devolvi o número da conta
		return this.numero;
	}
	
	public void setNumero(int numero) {  // métodos que normalmente altera um atributo eles geralmente não retorna nada, ou seja, void
		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
}
