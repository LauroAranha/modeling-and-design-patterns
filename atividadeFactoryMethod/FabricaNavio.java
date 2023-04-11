package atividadeFactoryMethod;

// Aqui é declarada a classe FabricaNavio, a qual implementa a interface FabricaTransporte
public class FabricaNavio implements FabricaTransporte{
	
	// Aqui é declarado o método criarTranporte, que retorna uma nova instancia 
	// do Objeto Navio, do tipo Transporte
	@Override
	public Transporte criarTransporte() {
		return new Navio();
	}
}
