package calculadoraCo2;

public class veiculoGNV extends co2{

	public veiculoGNV (int valor, boolean verificar, int veiculo ) {
		
		double[] veiculos = {
				3.128, // Carro
				0.000  // Não possui
		};
		
		this.setVerificar(verificar);
		this.setValor(veiculos[veiculo]);
		this.setEmissao(22.674);
		this.calculo();
		
	}
	
	public double resultado() {
		
		return this.calculo();
	}
}
