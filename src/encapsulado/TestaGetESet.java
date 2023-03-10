package encapsulado;

public class TestaGetESet {
	public static void main(String[] args) {
		Conta conta = new Conta();
		//conta.numero = 1337;  // essa linha não funciona mais devido ao atributo está encapsulado
		conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		Cliente anderson = new Cliente();
		//conta.titular = anderson;  // essa linha não funciona mais devido ao atributo está encapsulado
		//anderson.nome = "anderson neves";  // essa linha não funciona mais devido ao atributo está encapsulado
		anderson.setNome("anderson neves");
		
		conta.setTitular(anderson);  // essa linha associa o atributo titular da classe conta a classe cliente que é anderson
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("programador");
		System.out.println(conta.getTitular().getProfissao());
		
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("programador");
		// essas 3 linhas abaixo mostra a referência para o mesmo objeto
		System.out.println(titularDaConta);
		System.out.println(anderson);
		System.out.println(conta.getTitular());
	}
}
