package atividadeFactoryMethod;

//Aqui � declarada a classe FabricaCaminhao, a qual implementa a interface FabricaTransporte
public class FabricaCaminhao implements FabricaTransporte {
	
	// Aqui � declarado o m�todo criarTranporte, que retorna uma nova instancia 
	// do Objeto Caminhao, do tipo Transporte
	@Override
	public Transporte criarTransporte() {
		return new Caminhao();
	}
}
