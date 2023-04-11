package atividadeFactoryMethod;

public class Logistica {
	public void main(String[] args) {

		// Aqui � instanciado um novo objeto fabricaCaminhao do tipo FabricaTransporte,
		// resultante do m�todo FabricaCaminhao()
		FabricaTransporte fabricaCaminhao = new FabricaCaminhao();

		// Aqui � instanciado um novo objeto fabricaNavio do tipo FabricaTransporte,
		// resultante do m�todo FabricaNavio()
		FabricaTransporte fabricaNavio = new FabricaNavio();

		// Aqui � instanciado um novo objeto caminh�o do tipo Transporte,
		// resultante do m�todo criarTransporte, fornecido pelo objeto fabricaCaminhao
		Transporte caminhao = fabricaCaminhao.criarTransporte();
		
		// Aqui � executado o m�todo entregar, proveniente da classe caminh�o
		caminhao.entregar();

		// Aqui � instanciado um novo objeto navio do tipo Transporte,
		// resultante do m�todo criarTransporte, fornecido pelo objeto fabricaNavio
		Transporte navio = fabricaNavio.criarTransporte();
		// Aqui � executado o m�todo entregar, proveniente da classe navio
		navio.entregar();
	}
}
