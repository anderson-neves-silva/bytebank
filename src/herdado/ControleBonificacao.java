package herdado;

public class ControleBonificacao {
	// para lembrar da bonificação criamos esse atributo.
	private double somaBonificacao;	
	/*
	 * -a ideia dessa classe e controlar a bonificação dos funcionáios, pense que na empresa tem uma sala que todo mês
	 * ou ano o funcionário entra nela para receber sua bonificação, resumindo essa classe implementa esse controle 
	 * de bonificação.
	 * -aqui entendemos o real motivo e vantagem do polimorfismo, pois aqui não sabemos qual método será chamado, 
	 * pois depende de onde ele será executado, não importa pois o método específico será chamado, e note que usamos
	 * aqui uma referência genérica ao executar o código sempre será chamado o método específico onde ele aponta.
	 */
	public void registra(Funcionario f) {
		double bonificacao = f.getBonificacao();
		this.somaBonificacao = this.somaBonificacao + bonificacao;
	}
	
	public double getSomaBonificacao() {
		return somaBonificacao;
	}
}
