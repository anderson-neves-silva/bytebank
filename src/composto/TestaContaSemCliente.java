package composto;

public class TestaContaSemCliente {
	
	public static void main(String[] args) {
		Conta contaDaMarcela = new Conta();  
		System.out.println(contaDaMarcela.saldo);
		
		contaDaMarcela.titular = new Cliente();  // aqui fazemos de forma direta a criação de um cliente e apontar a contadaMacela para a classe Cliente  
		System.out.println(contaDaMarcela.titular);
		
		contaDaMarcela.titular.nome = "Marcela";  // essa linha quando não tinha a linha 8 ela retorna um null que significa referência para lunhar nenhum na mamória, agora podemos colocar um valor em titular
		System.out.println(contaDaMarcela.titular.nome);	
	}
	
}
