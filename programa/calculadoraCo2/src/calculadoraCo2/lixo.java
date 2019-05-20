package calculadoraCo2;

public class lixo extends co2 {
	
	public lixo (int valor, boolean verificar ) {
		
		this.setVerificar(verificar);
		this.setValor(valor);
		this.setEmissao(963.6);
		this.calculo();
		
	}
	
	public double resultado() {
		
		return this.calculo();
	}
}
