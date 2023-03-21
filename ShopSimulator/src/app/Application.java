package app;

// Import das classes necessárias
import button.Button;
import checkbox.Checkbox;

// Definição da classe aplicação
public class Application {

	// Instancia das classes botão e checkbox
	private Button button;
	private Checkbox checkbox;

	// Criação do método Application, que tem passa como parâmetro
	// a classe GUIFactory, especificando o tipo da classe (factory)
	public Application(GUIFactory factory) {

		// Instancia das classes button e checkbox, que recebem
		// os métodos createButton e createCheckbox implementados pelo GUIFactory
		button = factory.createButton();
		checkbox = factory.createCheckbox();
	}

	// Criação do médodo paint, que implementa os métodos button e checkbox
	public void paint() {
		
		// Execução dos métodos gráficos pelo button e paint
		button.paint();
		checkbox.paint();
	}
}
