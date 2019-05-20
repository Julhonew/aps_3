package calculadoraCo2;

public class gasBorijao extends co2 {

	public gasBorijao (int valor, boolean verificar ) {
		
		this.setVerificar(verificar);
		this.setValor(valor);
		this.setEmissao(35.893);
		this.calculo();
		
	}
	
	public double resultado() {
		
		return this.calculo();
	}

}
