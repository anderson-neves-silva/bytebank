package bytebank;

public class CriaConta {
	
	public static void main(String[] args) {
		// criando ou instanciando um objeto do tipo conta
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println("R$" + primeiraConta.saldo);
	}

}
