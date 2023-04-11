package atividadeFactoryMethod;

// Aqui � declarada a classe navio, que implementa a interface de transporte
public class Navio implements Transporte{
	
	// Aqui � declarado o m�todo entregar(), que sobrescreve o m�todo entregar() fornecido pela interface
	// transporte.
	@Override
	public void entregar() {
		System.out.println("Entregando por navio");
	}
}
