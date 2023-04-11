package atividadeFactoryMethod;

// Aqui é declarada a classe navio, que implementa a interface de transporte
public class Navio implements Transporte{
	
	// Aqui é declarado o método entregar(), que sobrescreve o método entregar() fornecido pela interface
	// transporte.
	@Override
	public void entregar() {
		System.out.println("Entregando por navio");
	}
}
