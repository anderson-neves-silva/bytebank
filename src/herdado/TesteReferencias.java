package herdado;

public class TesteReferencias {
	
	public static void main(String[] args) {
		/*
		 * -criando um objeto, repare que no lado esquedo esse objeto é criado do tipo mais genérico, sendo do tipo
		 * Funcionario, note que fazendo isso ao contrário não funciona, isso porque todo funcionário não é um gerente. 
		 */
		Funcionario g1 = new Gerente();
		
		g1.setNome("Juca");
		String nome = g1.getNome();
		/*
		 * -o compilador avalia sempre o tipo da referência, por isso aqui dá erro porque aqui só podemos chamar os 
		 * métodos que estão no tipo da referência que nesse caso é a classe Funcionario, esse método autentica está na 
		 * classe Gerente.
		 */
		//g1.autentica(2222);		
		System.out.println(nome);
	}

}
