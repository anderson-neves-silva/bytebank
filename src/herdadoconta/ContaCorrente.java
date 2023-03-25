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
	/*
	 * -surgiu um novo requisito, para a ContaCorrente ao sacar valores é cobrado uma taxinha de 0.20 centavos, e como
	 * já temos o método saca na super classe, vamos apenas redefinir o comportamento desse método, é uma reescrita dele,
	 * ou também conhecido como sobrescrever o método da classe mãe.
	 * -eu usei um recurso da ide, eu escrevi apenas saca aqui e ele criou todo o esboço do método, note que ele criou 
	 * junto uma anotação que em Java isso é uma configuração para o compilador. 
	 */
	@Override
	public boolean saca(double valor) {
		double valorASacar = valor + 0.2;
		return super.saca(valorASacar);
	}
	 
}
