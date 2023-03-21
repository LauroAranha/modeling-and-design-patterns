package factories;

// Imports dos packages que ser�o utilizados
import button.Button;
import checkbox.Checkbox;

// Declara��o da interface gr�fica que ir� implementar
// os m�todos createButton e createCheckbox.
public interface GUIFactory {
	Button createButton();
	Checkbox createCheckbox();
}
