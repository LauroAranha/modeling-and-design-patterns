package atividadeFactoryMethod;

public class Logistica {
	public void main(String[] args) {

		// Aqui é instanciado um novo objeto fabricaCaminhao do tipo FabricaTransporte,
		// resultante do método FabricaCaminhao()
		FabricaTransporte fabricaCaminhao = new FabricaCaminhao();

		// Aqui é instanciado um novo objeto fabricaNavio do tipo FabricaTransporte,
		// resultante do método FabricaNavio()
		FabricaTransporte fabricaNavio = new FabricaNavio();

		// Aqui é instanciado um novo objeto caminhão do tipo Transporte,
		// resultante do método criarTransporte, fornecido pelo objeto fabricaCaminhao
		Transporte caminhao = fabricaCaminhao.criarTransporte();
		
		// Aqui é executado o método entregar, proveniente da classe caminhão
		caminhao.entregar();

		// Aqui é instanciado um novo objeto navio do tipo Transporte,
		// resultante do método criarTransporte, fornecido pelo objeto fabricaNavio
		Transporte navio = fabricaNavio.criarTransporte();
		// Aqui é executado o método entregar, proveniente da classe navio
		navio.entregar();
	}
}
