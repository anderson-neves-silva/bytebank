package herdado;

public class Funcionario {
	/*
	 * protected double salario; essa linha fala de protected que está entre private e public, public para as classes 
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
