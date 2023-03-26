package herdadoconta;

public class TesteContas {

	public static void main(String[] args) {
		/*
		 * -criando uma referência ou objeto e depositando na conta.
		 * -nas linha duas próximas linhas fica claro a reutilização de código ou herança, pois as duas classes 
		 * ContaCorrente e ContaPauça elas não possuem o método deposita, ele está na super classe ou na classe Conta.
		 */
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(100.0);
		
		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposita(200.0);
		// -transferindo dinheiro.
		cc.transfere(10.0, cp);
		System.out.println("CC:" + cc.getSaldo());
		System.out.println("CP:" + cp.getSaldo());
		
	}

}
