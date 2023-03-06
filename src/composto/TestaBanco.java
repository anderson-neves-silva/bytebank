package composto;

public class TestaBanco {
	
	public static void main(String[] args) {
		Cliente anderson = new Cliente();  // criando uma referência para um cliente  
		anderson.nome = "Anderson Neves";  // populando a refeência do objeto anderson
		anderson.cpf = "222.222.222-22";
		anderson.profissao = "programador";
		
		Conta contaDoAnderson = new Conta();  // criando o objeto
		contaDoAnderson.deposita(100);  // depositando 100 na conta
		
		contaDoAnderson.titular = anderson;  // fazendo a ligação entre conta e cliente, conhecido como composição de objetos, aqui associa o cliente anderson a conta contaDoAnderson
		System.out.println(contaDoAnderson.titular.nome);
		System.out.println(contaDoAnderson.titular);  // note que faz a referência para o mesmo obejto anderson
		System.out.println(anderson);
	}

}
