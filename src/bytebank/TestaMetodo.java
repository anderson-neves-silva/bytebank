package bytebank;

public class TestaMetodo {
	
	public static void main(String[] args) {
		Conta contaDoAnderson = new Conta();  // instanciando a contaDoAnderson
		contaDoAnderson.saldo = 100;  // adicionando 100 ao saldo
		contaDoAnderson.deposita(55);  // invocando o método deposita do objeto conta, e depositando 55 na conta
		System.out.println(contaDoAnderson.saldo);
	}

}
