package encapsulado;

/*
 * deixando esses atributos privado ou protegido, agora eles não podem ser lidos e nem modificados, a não ser pela 
 * própria classe através dos métodos.
 * private Cliente titular; essa linha mudo o tipo da variável String para o tipo Cliente que possibilita fazer a 
 * ligação ou referência da conta para a classe cliente.
 */
public class Conta {
	private double saldo; 
	private int agencia;
	private int numero;
	private Cliente titular;
	/*
	 *  criando o constutor, se você ao criar uma classe não criar ele o java cria ele internamente, ele é conheciado
	 *  como construtor padrão, ele basicamente não faz nada, ele também é conhecido como uma rotina de inicialização,
	 *  ele só executado uma única vez que é quando criamos um objeto ou quando usamos o new.
	 */
	public Conta(int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("estou criando uma conta " + this.numero);
	}
	
	public void deposita(double valor) {  
		this.saldo += valor;  
	}
	
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
	 * esse if verifica se possui valor disponível para transferir.
	 * saca(valor); essa linha reutiliza o método saca para retira o valor da conta origem.
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
	 * métodos que normalmente altera um atributo ele geralmente não retorna nada, ou seja, é do tipo void.
	 * esse if verifica que se o número for negativo não é permitido.
	 * o return para a execução sem alterar o número.
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
	/*
	 * esse if checa se o número for negativo ele não é permitido.
	 * o return para a execução sem alterar o número.
	 */
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
	
}
