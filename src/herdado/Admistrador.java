package herdado;
// a classe Admistrador herda tudo da classe FuncionarioAutenticavel.
public class Admistrador extends Funcionario {

	@Override
	public double getBonificacao() {
		return 50;
	}

}
