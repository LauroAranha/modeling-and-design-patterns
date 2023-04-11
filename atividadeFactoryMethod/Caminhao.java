package atividadeFactoryMethod;

// Aqui é declarado a classe caminhão, que implementa a interface transporte.
public class Caminhao implements Transporte {

	// Aqui é declarado o método entregar, que sobrescreve o método fornecido pela interface
	// Transporte.
	@Override
	public void entregar() {
		System.out.println("Entregando caminhão...");
	}
}
