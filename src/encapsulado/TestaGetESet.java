package encapsulado;

public class TestaGetESet {	
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 25254);

		System.out.println(conta.getNumero());
		
		Cliente anderson = new Cliente();
		//conta.titular = anderson;
		//anderson.nome = "anderson neves";
		anderson.setNome("anderson neves");
		
		// a próxima linha associa o atributo titular da classe conta a classe cliente que nesse caso é o anderson.
		conta.setTitular(anderson);
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("programador");
		System.out.println(conta.getTitular().getProfissao());
		
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("programador");
		// essas 3 linhas abaixo mostra a referência para o mesmo objeto.
		System.out.println(titularDaConta);
		System.out.println(anderson);
		System.out.println(conta.getTitular());
	}	
}
