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
		
		return "Voc� precisa plantar " + mes + " arvores por m�s com a emiss�o atual \n ou " + ano + " no periodo de um ano";
	}
	
}
