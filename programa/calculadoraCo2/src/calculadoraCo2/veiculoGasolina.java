package calculadoraCo2;

public class veiculoGasolina extends co2{

	public veiculoGasolina (int valor, boolean verificar, int veiculo ) {
		
		double[] veiculos = {
				2.184, // Pequeno (at� 1.4)
				2.579, // M�dio (de 1.5 a 2.0)
				3.571, // Grande (maior que 2.0)
				1.268, // Motocicleta
				0.000  // N�o possui
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
