package composto;

public class TestaBanco {
	
	public static void main(String[] args) {
		Cliente anderson = new Cliente();    
		anderson.nome = "Anderson Neves";  // populando o objeto
		anderson.cpf = "222.222.222-22";  // populando o objeto
		anderson.profissao = "programador";  // populando o objeto
		
		Conta contaDoAnderson = new Conta();  
		contaDoAnderson.deposita(100);  // depositando 100
		
		contaDoAnderson.titular = anderson;  // fazendo a ligação entre conta e cliente, conhecido também como composição de objetos, aqui associa o cliente anderson a contaDoAnderson
		System.out.println(contaDoAnderson.titular.nome);
		System.out.println(contaDoAnderson.titular);  // note que essa linha e a próxima faz a referência para o mesmo obejto anderson
		System.out.println(anderson);
	}

}
