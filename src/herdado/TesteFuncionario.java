package herdado;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();		
		
		Gerente anderson = new Gerente();
		anderson.setNome("Anderson Neves");
		anderson.setCpf("111333444-00");
		anderson.setSalario(1000.00);
		
		//System.out.println(anderson.getNome());
		System.out.println(anderson.getBonificacao());
		
		//anderson.salario = 300;
		
	}

}
