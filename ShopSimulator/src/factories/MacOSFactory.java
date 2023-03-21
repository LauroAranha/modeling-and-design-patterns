package factories;

// Imports das classes que ser�o utilizados
import button.MacOSButton;
import checkbox.MacOSCheckbox;

// Defini��o da classe MacOSFactory
public class MacOSFactory {

	// Cria��o do m�todo createButton() o qual sobrescreve
	// o m�todo implementado anteriormente na interface GUIFactory
	@Override
	public Button createButton() {
		return new MacOSButton();
	}

	
	// Cria��o do m�todo createCheckbox() o qual sobrescreve
	// o m�todo implementado anteriormente na interface GUIFactory
	@Override
	public Checkbox createCheckbox() {
		return new MacOSCheckbox();
	}
}
