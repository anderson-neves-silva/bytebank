package composto;

public class TesteSacaNegativo {
	
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposita(100);
		System.out.println(conta.saca(101));  // podemos passa a chamada do método saca como argumento aqui também 
		
		conta.saca(101);
		
		System.out.println(conta.pegaSaldo());  // invocando o método que mostra o saldo
	}

}
