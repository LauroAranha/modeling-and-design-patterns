package app;

// Defini��o da classe demo
public class Demo {

	// Cria��o do m�todo configureApplication
	private static Application configureApplication() {
		// Instancia da application e guifactory, declarando as respectivamente 
		// como app e factory
		Application app;
		GUIFactory factory;
		
		// String que tem como valor o retorno do m�todo System.getProperty
		String osName = System.getProperty("os.name").toLowerCase();
		
		// Caso a string osName contenha a substring mac, a factory � instanciada como 
		// new MacOSFactory(), caso contrario, � instanciado 
		if(osName.contains("mac") {
			factory = new MacOSFactory();
		} else {
			factory = new WindowsFactory();
		}
		
		// Cria��o de nova instancia application 
		app = new Application(factory);
		
		// retorno da instancia criada
		return app;
	}

	// Cria��o do m�todo main, que ser� o primeiro m�todo a ser executado
	// pelo programa
	public static void main(String[] args) {
		Application app = configureApplication();
		app.paint();
	}
}
