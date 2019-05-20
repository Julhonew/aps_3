package calculadoraCo2;

public class veiculoDisel extends co2{

	public veiculoDisel (int valor, boolean verificar, int veiculo ) {
		
		double[] veiculos = {
				3.091, // Carro
				2.28,  // Ônibus em Perímetro Urbano
				0.6,   // Ônibus em Rodovia
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
