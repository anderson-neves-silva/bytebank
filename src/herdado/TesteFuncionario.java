package herdado;

public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario anderson = new Funcionario();
		anderson.setNome("Anderson Neves");
		anderson.setCpf("111333444-00");
		anderson.setSalario(1000.00);
		
		System.out.println(anderson.getNome());
		System.out.println(anderson.getBonificacao());
	}

}