package calculadoraCo2;

public class co2 {
	
	private double [][] arrCo2 =  {
			{0.00029499999999999996,0,0,0}, //0 - energia
			{0.035893,0,0,0}, // 1 - botijão
			{0.022674,0,0,0}, // 2 - gas natural
			{0.002184, 0.002579, 0.0035710000000000004, 0.001268}, // 3 - carro gasolina
			{0.0007190001000000001, 0.0007190001000000001, 0.0007190001000000001,0}, // 4 - carro etanol
			{0.003091, 0.00228, 0.0006,0}, // 5 - carro disel 
			{0.003128,0,0,0}, // 6 - carro GNV
			{0.9636,0,0,0} // 7 -lixo
	};

	@SuppressWarnings("unused")
	public Double[] getArrCo2(int i) {
		
		Double [] co2 = {
				this.arrCo2[i][0], // 0 
				this.arrCo2[i][1], // 1
				this.arrCo2[i][2], // 2
				this.arrCo2[i][3]  // 3
 		};
		
		return co2;
	}
		
	
}
