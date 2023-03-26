package herdadoconta;

public class ContaPoupanca extends Conta {
	
	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}
	// implementei aqui no filho o corpo do método.
	@Override
	public void deposita(double valor) {
		super.saldo += valor;
		
	}
	
}
