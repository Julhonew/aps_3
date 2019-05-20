package calculadoraCo2;

public class consumoEnergia extends co2 {
	
	public consumoEnergia (int valor, boolean verificar ) {
		
		this.setVerificar(verificar);
		this.setValor(valor);
		this.setEmissao(0.295);
		this.calculo();
		
	}
	
	public double resultado() {
		
		return this.calculo();
	}

}
