package herdado;
// a classe Gerente herda tudo da classe Autenticavel.
public class Gerente extends Funcionario {
	/*
	 * -aqui eu mudo de this para super pois o atributo salário não está defenido aqui na classe Gerente, ele está
	 * defenido na super classe sendo a classe Funcionário, pois sabemos que o this guarda a referência do atributo 
	 * da classe onde ele está presente.
	 * -public double getBonificacao() {}, essa linha é conhecida como a assinatura do método, note que ele está escrito 
	 * aqui igual está escrito na classe Funcionario, a característica de reescrita que é o que estamos fazendo aqui é 
	 * usar a mesma assinatura mas pode variar algumas coisas de um para o outro.
	 * -reaproveitando o método criado na super classe, estamos usando o método getBonificacao() {} padrão implementado
	 * na classe Funcionario, com isso não duplicamos código, reaproveito também o acesso ao método getSalario() {} o
	 * e com isso mudo a visibilidade dele lá na super classe de protected para private.
	 */
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificação do Gerente");
		return super.getSalario();
	}
	
}
