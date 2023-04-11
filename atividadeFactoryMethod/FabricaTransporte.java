package atividadeFactoryMethod;

// Aqui é declarada a interface FabricaTransporte, a qual cria uma nova instância
// do criar transporte, do tipo Transporte.
public interface FabricaTransporte {
	Transporte criarTransporte();
}
