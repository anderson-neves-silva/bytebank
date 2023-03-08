package encapsulado;

public class TestaGetESet {
	public static void main(String[] args) {
		Conta conta = new Conta();
		//conta.numero = 1337;  // essa linha não funciona porque o atributo da classe está protegido
		conta.setNumero(1337);
		System.out.println(conta.getNumero());
	}
}
