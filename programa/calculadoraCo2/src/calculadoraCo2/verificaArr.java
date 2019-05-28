package calculadoraCo2;

public class verificaArr {
	
	public int verificaArray(String[] arrPergunta) {
		
		int count;
		
		if(arrPergunta[1] == "" && arrPergunta[2] == "null" ){
			count = 1;
		}else if (arrPergunta[1] != "" && arrPergunta[2] == "null") {
			count = 2;
		}else{
			count = 3;
		}
		
		return count;
	}
	
   @SuppressWarnings("unused")
   public int verificaArray(int i) {
		
	   co2 c = new co2();
	   Double[] arrCo2 = c.getArrCo2(i); 
	   
		int count = 0;
		
		for(double co2 : arrCo2){
			
			if(co2 != 0) {
				count++;
			}
			
		}
		
		return count;
	}


}
