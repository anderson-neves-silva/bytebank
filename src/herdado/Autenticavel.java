package herdado;
/*
 * -essa classe é transformada em uma interface, podemos pensar que uma interface é uma classe abstrata com todos os 
 * métodos abstratos, ou seja, dentro de uma interface não tem nada concreto, nenhuma implementação.
 * -uma analogia para explicar a interface, é 
 * contrato Autenticavel
 * que assinar esse contrato, precisa implementar os
 * método setSenha
 * método autenticar
 */ 
public abstract interface Autenticavel {	
	
	public abstract void setSenha(int senha);
	
	public abstract boolean autentica(int senha);

}
