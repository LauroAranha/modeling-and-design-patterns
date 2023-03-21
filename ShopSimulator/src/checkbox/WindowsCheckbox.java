package checkbox;

//Cria��o da classe WindowsCheckbox, que implementa a interface checkbox com o 
//objetivo de implementar os m�todos disponibilizados pela mesma (interface)
public class WindowsCheckbox implements Checkbox{
	
	// O Override � utilizado para assegurar de que o m�todo paint() ser�
	// sobrescrito.

	// Ap�s o Override, o m�todo paint() � sobrescrito de forma tal a que o m�todo
	// atual seja diferente da interface, implementando-o da forma mais adequada a
	// classe atual.
	@Override
	public void paint() {
		System.out.println("You have created WindowsCheckbox");
	}
}
