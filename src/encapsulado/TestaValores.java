package encapsulado;

public class TestaValores {	
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 25255);		
		
		System.out.println(conta.getAgencia());
		
		conta.setAgencia(1232123);
		
		Conta conta2 = new Conta(1337, 16549);
		Conta conta3 = new Conta(2112, 14660);
		/*
		 * aqui como alteramos lá na classe conta que esse método o getTotal é estático ele é da classe e podemos chamar
		 * ou invocar esse método assim Conta.getTotal, e não mais como conta2.getTotal
		 */
		System.out.println(Conta.getTotal());
		
		// fim do curso Java OO
	}	
}
