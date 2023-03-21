package button;

// Criação da classe MacOSButton, que implementa a interface button com o 
// objetivo de implementar os métodos disponibilizados pela mesma (interface)
public class MacOSButton implements Button {

	// O Override é utilizado para assegurar de que o método paint() será
	// sobrescrito.

	// Após o Override, o método paint() é sobrescrito de forma tal a que o método
	// atual seja diferente da interface, implementando-o da forma mais adequada a
	// classe atual.
	@Override
	public void paint() {
		System.out.println("You have created MacOSButton");
	}
}
