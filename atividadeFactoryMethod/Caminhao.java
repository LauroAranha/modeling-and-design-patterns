package atividadeFactoryMethod;

// Aqui � declarado a classe caminh�o, que implementa a interface transporte.
public class Caminhao implements Transporte {

	// Aqui � declarado o m�todo entregar, que sobrescreve o m�todo fornecido pela interface
	// Transporte.
	@Override
	public void entregar() {
		System.out.println("Entregando caminh�o...");
	}
}
