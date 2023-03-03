package bytebank;

public class TesteReferencias {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();  // aqui na verdade não é um objeto do tipo conta, o correto é afirmar que é uma referência para o objeto do tipo conta, é como se fosse uma flecha apontando para esse objeto
		primeiraConta.saldo = 300;
		
		System.out.println("saldo da primeira: " + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;  // aqui ele copia a referência de primeiraConta para a segundaConta, é como se fosse uma outra flecha apontando para o mesmo objeto, ou seja, duas referências apontando para o mesmo objeto
		
		System.out.println("saldo da segunda conta: " + segundaConta.saldo);  // aqui vale 300
		System.out.println("saldo da primeira conta: " + primeiraConta.saldo);  // aqui também vale 300
		
		segundaConta.saldo += 100;  // acrescentei mais 100
		System.out.println("saldo da segunda conta: " + segundaConta.saldo);  // aqui vale 400
		
		System.out.println("saldo da primeira conta: " + primeiraConta.saldo);  // aqui também vale 400
		
		if (primeiraConta == segundaConta) {  // fazendo um if para saber se as contas é a mesma
			System.out.println("são a mesma conta");
		} else {
			System.out.println("são contas diferentes");
		}
		
		System.out.println(primeiraConta);  // aqui mostra a referência para o objeto do tipo conta
		System.out.println(segundaConta);  // aqui mostra a mesma referência do objeto primeiraConta
	}
}
