package app;

// Import das classes necess�rias
import button.Button;
import checkbox.Checkbox;

// Defini��o da classe aplica��o
public class Application {

	// Instancia das classes bot�o e checkbox
	private Button button;
	private Checkbox checkbox;

	// Cria��o do m�todo Application, que tem passa como par�metro
	// a classe GUIFactory, especificando o tipo da classe (factory)
	public Application(GUIFactory factory) {

		// Instancia das classes button e checkbox, que recebem
		// os m�todos createButton e createCheckbox implementados pelo GUIFactory
		button = factory.createButton();
		checkbox = factory.createCheckbox();
	}

	// Cria��o do m�dodo paint, que implementa os m�todos button e checkbox
	public void paint() {
		
		// Execu��o dos m�todos gr�ficos pelo button e paint
		button.paint();
		checkbox.paint();
	}
}
