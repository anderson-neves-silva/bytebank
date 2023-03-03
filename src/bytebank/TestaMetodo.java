package bytebank;

public class TestaMetodo {
	
	public static void main(String[] args) {
		Conta contaDoAnderson = new Conta();  // instanciando a contaDoAnderson
		contaDoAnderson.saldo = 100;  // adicionando 100 ao saldo
		contaDoAnderson.deposita(55);  // invocando o método deposita do objeto conta, e depositando 55 na conta
		System.out.println(contaDoAnderson.saldo);
		
		boolean conseguiuRetirar = contaDoAnderson.saca(20);  // invocando o método saca que possui retorno, sacando 20, guardando o retorno do método em uma variável
		System.out.println("novo saldo: R$" + contaDoAnderson.saldo);
		System.out.println(conseguiuRetirar);
	}

}
