package factories;

//Imports das classes que serão utilizados
import button.Button;

//Definição da classe WindowsFactory
public class WindowsFactory implements GUIFactory {

	// Criação do método createButton() o qual sobrescreve
	// o método implementado anteriormente na interface GUIFactory
	@Override
	public Button createButton() {
		return new WindowsButton();
	}

	// Criação do método createCheckbox() o qual sobrescreve
	// o método implementado anteriormente na interface GUIFactory
	@Override
	public Checkbox createCheckbox() {
		return new WindowsCheckbox();
	}
}
