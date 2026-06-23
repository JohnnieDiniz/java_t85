package abastracao;

public class TriAtleta extends Pessoa implements Nadador, Corredor, Ciclista{

	public TriAtleta(String nome) {
		super(nome);
	
	}

	@Override
	public void aquecer() {
		System.out.println("Aquecendo");
		
	}

	@Override
	public void pedalar() {
		System.out.println("Pedalando");
	}

	@Override
	public void correr() {
		System.out.println("Correndo");
	}

	@Override
	public void nadar() {
		System.out.println("Nadando");
	}

	@Override
	public void cansou() {
		System.out.println("Cansou");
		
	}

}
