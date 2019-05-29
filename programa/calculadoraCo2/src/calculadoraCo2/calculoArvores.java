package calculadoraCo2;

public class calculoArvores {

	private double co2;

	public double getCo2() {
		return co2;
	}

	public void setCo2(double co2) {
		this.co2 =+ co2;
	}

	public String plantar() {
		
		double ano = (12 * this.getCo2()) * 7.14; 
		double mes = this.getCo2() * 7.14;
		
		return "Você precisa plantar " + mes + " arvores por mês com a emissão atual \n ou " + ano + " no periodo de um ano";
	}
	
}
