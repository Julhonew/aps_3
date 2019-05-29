package calculadoraCo2;

public class calculoCo2 {
	public int tipo;
	
	@SuppressWarnings("unused")
	public double co2 (int valor, int tipo, int pergunta) {
		calculoArvores arvores = new calculoArvores();
		if(tipo > 1){
			this.tipo = tipo - 1;
		}
		
		co2 c = new co2();
		Double resultado;
		
		Double[] arrCo2 = c.getArrCo2(pergunta); 
		
		resultado = arrCo2[this.tipo] * valor;
		
		
		return resultado;
	}
	
}
