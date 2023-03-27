package herdado;
/*
 * -essa classe é apenas abstrata ela não é concreta, ela é apenas um conceito, pois na empresa se você perguntar para 
 * alguém qual o seu cargo lá, a possoa pode responder, sou gerente, sou programador etc. ela já mais vai falar sou 
 * funcionário, por isso usamos essa nova palavra chave relacionada com herança aqui nessa classe, apenas uma observação
 * quando usamos o new criamos um objeto que é algo concreto.
 * -nesse tipo de classe não podemos instanciar dessa classe. 
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
	/*
	 * -nesse método os requisitos foi mudado e ela não tem mais uma implementção padrão, ou seja, ele não é mais um 
	 * método concreto, ele passa a ser abstrato, segue o mesmo conceito da classe abstrata na herança.
	 * -método sem corpo, pois ele não será implementado, e essa implementação passa a ser feita nos filhos, ou seja, se 
	 * você implementar um método abstrato em uma classe mãe, você obriga as classes filhas a implementar esse método. 
	 */
	public abstract double getBonificacao();
	
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
