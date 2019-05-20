package calculadoraCo2;

public class viagens extends co2{

	public viagens (int valor, boolean verificar, int viagem ) {
		
		double[] viagens = {
				0.100188,  // Viagem Nacional
				0.112465,  // Viagem Internacional
				0.000      // Não realiza viagens
		};
		
		this.setVerificar(verificar);
		this.setValor(viagens[viagem]);
		this.setEmissao(22.674);
		this.calculo();
		
	}
	
	public double resultado() {
		
		return this.calculo();
	}
}
