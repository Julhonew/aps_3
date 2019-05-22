package calculadoraCo2;

public class calculoArvores {

	private double co2;
	protected double arvores = 7.14;

	public double getCo2() {
		return co2;
	}

	public void setCo2(double co2) {
		this.co2 =+ co2;
	}

	public String plantar() {
		
		double res = this.getCo2() * this.arvores; 
		
		return "Você precisa plantar " + res + " arvores";
	}
	
}
