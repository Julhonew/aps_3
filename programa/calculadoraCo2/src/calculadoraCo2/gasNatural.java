package calculadoraCo2;

public class gasNatural extends co2{

	public gasNatural (int valor, boolean verificar ) {
		
		this.setVerificar(verificar);
		this.setValor(valor);
		this.setEmissao(22.674);
		this.calculo();
		
	}
	
	public double resultado() {
		
		return this.calculo();
	}

}
