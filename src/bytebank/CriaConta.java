package bytebank;

public class CriaConta {
	
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();  // criando ou instanciando um objeto do tipo conta
		primeiraConta.saldo = 200;
		System.out.println("R$" + primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println("R$" + primeiraConta.saldo);
		
		Conta segundaConta = new Conta();  // criando um segundo objeto
		segundaConta.saldo = 50;
		
		System.out.println("primeira conta tem R$" + primeiraConta.saldo);
		System.out.println("segunda conta tem R$" + segundaConta.saldo);
		
		System.out.println(primeiraConta.agencia);  // ao criar um objeto todos seus atributos são zerados, o java faz isso
		System.out.println(primeiraConta.numero);  // aqui e a linha anterior o resultado é 0
		
		if (primeiraConta == segundaConta) {  // aqui verifico se as contas são iguais, pois como usei a palavra new duas vezes eu criei duas referências ou objetos diferentes para o objeto do tipo conta
			System.out.println("mesma conta");
		} else {
			System.out.println("contas diferentes");
		}
		
		System.out.println(primeiraConta);  // mostra a referência para o objeto
		System.out.println(segundaConta);  // mostra outra referência diferente da anterior
	}

}
