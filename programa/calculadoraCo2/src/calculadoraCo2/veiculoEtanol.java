package calculadoraCo2;

public class veiculoEtanol extends co2{

	public veiculoEtanol (int valor, boolean verificar, int veiculo ) {
		
		double[] veiculos = {
				0.7190001,  // Pequeno (até 1.4)
				0.7190001,  // Médio (de 1.5 a 2.0)
				0.7190001,  // Grande (maior que 2.0)
				0.0000000  // Não possui veiculos
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
