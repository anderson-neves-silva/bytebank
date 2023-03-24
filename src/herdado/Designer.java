package herdado;
// a classe Designer herda tudo da classe Funcionario.
public class Designer extends Funcionario {

	public double getBonificacao() {
		System.out.println("Chamando o método de bonificação do Designer");
		return 200;
	}
	
}
