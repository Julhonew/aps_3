package calculadoraCo2;

abstract class co2 {
	
	private double emissao, valor;
	private boolean verificar;
	protected double resultado;
	
	public boolean isVerificar() {
		return verificar;
	}
	public void setVerificar(boolean verificar) {
		this.verificar = verificar;
	}
	
	public double getEmissao() {
		return emissao;
	}
	public void setEmissao(double emissao) {
		this.emissao = emissao;
	}
	
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public double calculo() {
		
		if(this.isVerificar()) {
			this.resultado = this.getValor() * this.getEmissao();
		}
		
		return this.resultado;
	}
	
}
