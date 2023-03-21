package factories;

// Imports dos packages que serão utilizados
import button.Button;
import checkbox.Checkbox;

// Declaração da interface gráfica que irá implementar
// os métodos createButton e createCheckbox.
public interface GUIFactory {
	Button createButton();
	Checkbox createCheckbox();
}
