package factories;

//Imports das classes que ser�o utilizados
import button.Button;

//Defini��o da classe WindowsFactory
public class WindowsFactory implements GUIFactory {

	// Cria��o do m�todo createButton() o qual sobrescreve
	// o m�todo implementado anteriormente na interface GUIFactory
	@Override
	public Button createButton() {
		return new WindowsButton();
	}

	// Cria��o do m�todo createCheckbox() o qual sobrescreve
	// o m�todo implementado anteriormente na interface GUIFactory
	@Override
	public Checkbox createCheckbox() {
		return new WindowsCheckbox();
	}
}
