package herdado;
/*
 * -essa classe é apenas abstrata ela não é concreta, ela é apenas um conceito, pois na empresa se você perguntar para 
 * alguém qual o seu cargo lá, a possoa pode responder, sou gerente, sou programador etc. ela já mais vai falar sou 
 * funcionário, por isso usamos essa nova palavra chave relacionada com herança aqui nessa classe, apenas uma observação
 * quando usamos o new criamos um objeto que é algo concreto. 
 */
public abstract class Funcionario {
	/*
	 * -protected double salario; essa linha fala de protected que está entre private e public, public para as classes 
	 * filhos, para o resto é private, esse modificador foi criado para liberar acesso aos filhos e privado para as 
	 * demais classes.
	 */
	private String nome;
	private String cpf;
	private double salario;	
	// função que cria uma bonificação acrescentando 10% ao salário.
	public double getBonificacao() {
		return this.salario * 0.05;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}
