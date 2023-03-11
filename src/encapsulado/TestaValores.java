package encapsulado;

public class TestaValores {	
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 25254);		
		/*
		 * nesse ponto a conta está incosistente pois ela não deveria aceitar números negativos nos atributos agência 
		 * e conta, pois deve seguir as regras de negócio, lá na classe conta eu uso um if para não permitir isso.
		 */
		conta.setAgencia(-50);
		conta.setNumero(-330);
		
		System.out.println(conta.getAgencia());
	}	
}
