package button;

// Cria��o da classe MacOSButton, que implementa a interface button com o 
// objetivo de implementar os m�todos disponibilizados pela mesma (interface)
public class MacOSButton implements Button {

	// O Override � utilizado para assegurar de que o m�todo paint() ser�
	// sobrescrito.

	// Ap�s o Override, o m�todo paint() � sobrescrito de forma tal a que o m�todo
	// atual seja diferente da interface, implementando-o da forma mais adequada a
	// classe atual.
	@Override
	public void paint() {
		System.out.println("You have created MacOSButton");
	}
}
