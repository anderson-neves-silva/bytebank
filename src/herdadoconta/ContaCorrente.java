package herdadoconta;
// essa classe herda os atributos e métodos mas não o construtor.
public class ContaCorrente extends Conta {
	/*
	 * vou chamar o construtor específico para não ter que criar um construtor padrão lá na super classe, pois o código
	 * como estava não compilava, para ficar claro não herdamos o construtor em herança, o que fazemos aqui é aproveitar 
	 * o construtor específico que já está lá na classe conta, ou seper classe. 
	 */
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
}
