package bytebank;

public class Conta {
	double saldo;
	int agencia;
	int numero;
	String titular;
	
	// criando um método ou comportamento, quando você não retorna nada como resposta em um método use o void
	public void deposita(double valor) {
		// saldo = saldo + valor; // a próxima linha faz o mesmo desta linha
		this.saldo += valor;  // o this ele se refere ao objeto criando onde usamos o new, ele se refere a esse objeto
	}
}
