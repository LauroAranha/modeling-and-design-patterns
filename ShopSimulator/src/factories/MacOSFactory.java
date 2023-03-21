package factories;

// Imports das classes que serão utilizados
import button.MacOSButton;
import checkbox.MacOSCheckbox;

// Definição da classe MacOSFactory
public class MacOSFactory {

	// Criação do método createButton() o qual sobrescreve
	// o método implementado anteriormente na interface GUIFactory
	@Override
	public Button createButton() {
		return new MacOSButton();
	}

	
	// Criação do método createCheckbox() o qual sobrescreve
	// o método implementado anteriormente na interface GUIFactory
	@Override
	public Checkbox createCheckbox() {
		return new MacOSCheckbox();
	}
}
