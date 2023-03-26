package herdadoconta;
// ninguém mais pode instanciar objetos dessa classe.
public abstract class Conta {
	// classe abstrata pode conter atributos, sim, são os atributos que os filhos vão herdar.
	protected double saldo; 
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	// classe abstrata pode conter um construtor, sim, esse construtor pode ser chamado por um filho através do super().
	public Conta (int agencia, int numero) {
		Conta.total++;
		//System.out.println("o total de contas é " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		//this.saldo = 100;
		//System.out.println("estou criando uma conta " + this.numero);
	}
	/*
	 * -classe abstrata pode conter métodos concretos, sim, os filhos vão ganhar essas funcionalidades.
	 * -mas eu vou alterar esse método para ser abstrato, isso obriga todos os filhos a implementar ele, vou fazer isso
	 * lá neles.
	 */
	public abstract void deposita(double valor);  
	
	// esse if verifica se possui dinheiro suficiente para o saque.
	public boolean saca(double valor) {  
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}	
	/*
	 * -esse if verifica se possui valor disponível para transferir, saca(valor); essa linha reutiliza o método saca 
	 * para retira o valor da conta origem.
	 * -aqui usamos o polimorfismo, pois passamos para quem recebe o tipo mais genérico como parâmetro o tipo Conta, aqui
	 * essa referência do tipo Conta pode apontar para a ContaCorrente ou ContaPopanca, ou qualquer tipo de conta.
	 */
	public boolean transfere(double valor, Conta destino) {  
		if (this.saldo >= valor) {
			saca(valor);
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}
	}	
	// método que devolvi o saldo.
	public double getSaldo() {
		return this.saldo;
	}	
	// método que devolvi o número da conta.
	public int getNumero() {
		return this.numero;
	}
	/* 
	 * -métodos que normalmente altera um atributo ele geralmente não retorna nada, ou seja, é do tipo void.
	 * -esse if verifica que se o número for negativo não é permitido.
	 * -o return para a execução sem alterar o número.
	 */	
	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("não é permitido valores menor ou igual a 0!");
			return;
		}
		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}	
	// esse if checa se o número for negativo ele não é permitido.
	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("não é permitido valores menor ou igual a 0!");
			return;
		}
		this.agencia = agencia;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	/*
	 * -criando o método estático get que exibe o total de contas criadas, note que não usamos o this e sim o conta, 
	 * porque ele é da classe, aqui vale para o mesmo que a explicação do atributo total, ele é da classe e não da 
	 * instância criada.
	 */
	public static int getTotal() {
		return Conta.total;
	}
	
}
