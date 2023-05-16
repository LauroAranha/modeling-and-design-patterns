package exemplo;

//Criação da classe
public final class Janela {
	
	// Atributos privados
	private static final Janela INSTANCE = new Janela();
	private static final String Teste = "Exemplo Singleton Privado";

	// Atributo público
	public static final String Singleton = "Exemplo Singleton Publico";

	// Contrutor privado
	private Janela() {

	}

	// Método público estático realizando o primeiro e único acesso necessário nessetipo de aplicação
	private static Janela getInstance() {
		return INSTANCE;
	}
	
	// Execução dessse método de qualquer parte do projeto
	public static void Abrir() {
		System.out.println("Abrir janela");
	}

	// Execução dessse método de qualquer parte do projeto
	public static void Fechar() {
		System.out.println("Abrir fechar!");
	}

}