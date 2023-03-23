package herdado;
// a classe EditorVideo herda tudo da classe Funcionario.
public class EditorVideo extends Funcionario {
	// mudando a regra de bonificação de padrão mais 100.
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificação do Editor de Vídeo");
		return super.getBonificacao() + 100;
	}
	
}
