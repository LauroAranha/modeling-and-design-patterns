package app;

// Definição da classe demo
public class Demo {

	// Criação do método configureApplication
	private static Application configureApplication() {
		// Instancia da application e guifactory, declarando as respectivamente 
		// como app e factory
		Application app;
		GUIFactory factory;
		
		// String que tem como valor o retorno do método System.getProperty
		String osName = System.getProperty("os.name").toLowerCase();
		
		// Caso a string osName contenha a substring mac, a factory é instanciada como 
		// new MacOSFactory(), caso contrario, é instanciado 
		if(osName.contains("mac") {
			factory = new MacOSFactory();
		} else {
			factory = new WindowsFactory();
		}
		
		// Criação de nova instancia application 
		app = new Application(factory);
		
		// retorno da instancia criada
		return app;
	}

	// Criação do método main, que será o primeiro método a ser executado
	// pelo programa
	public static void main(String[] args) {
		Application app = configureApplication();
		app.paint();
	}
}
