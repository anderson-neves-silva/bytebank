package herdado;

public class TesteReferencias {
	
	public static void main(String[] args) {
		
		Gerente g = new Gerente();		
		g.setNome("Juca");
		g.setSalario(5000.0);		
		
		EditorVideo ev = new EditorVideo();
		ev.setSalario(2500.0);
		
		Designer d = new Designer();
		d.setSalario(2000.0);
		/*
		 * registrando o funcionário do tipo gerente, o funcionário do tipo funcionário sendo o mais genérico, e 
		 * registrando o funcionário do tipo editor de vídeo. 
		 */
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g);
		controle.registra(ev);
		controle.registra(d);
		
		System.out.println(controle.getSoma());
	}

}
