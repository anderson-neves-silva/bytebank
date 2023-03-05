package bytebank;

public class TestaMetodo {
	
	public static void main(String[] args) {
		Conta contaDoAnderson = new Conta();  // instanciando a conta do anderson
		contaDoAnderson.saldo = 100;  // adicionando 100 ao saldo
		contaDoAnderson.deposita(55);  // invocando o método deposita do objeto conta, e depositando 55 na conta
		System.out.println(contaDoAnderson.saldo);
		
		boolean conseguiuRetirar = contaDoAnderson.saca(20);  // invocando o método saca que possui retorno, sacando 20, guardando o retorno do método em uma variável
		System.out.println("novo saldo: R$" + contaDoAnderson.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaDaMarcela = new Conta();  // criando a conta da marcela
		contaDaMarcela.deposita(1000);  // depositando 1000 na conta
		System.out.println(contaDaMarcela.saldo);
		boolean sucessoTransferencia = contaDaMarcela.transfere(300, contaDoAnderson);  // invocando o método que transfere 300 para a conta do anderson e guarda esse boolean na variável sucessoTransferencia
		if(sucessoTransferencia) {  // como ele retorna um boolean podemos colocar esse if aqui se sucesso
			System.out.println("transferência com sucesso");
		} else {
			System.out.println("saldo insuficiente");
		}
		System.out.println("novo saldo: R$" + contaDaMarcela.saldo);
		System.out.println(contaDoAnderson.saldo);  // checando se a conta recebeu a transferência
		
		contaDoAnderson.titular = "anderson neves";
		System.out.println(contaDoAnderson.titular);
	}

}
