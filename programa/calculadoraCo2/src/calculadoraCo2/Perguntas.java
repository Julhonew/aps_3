package calculadoraCo2;

public class Perguntas {
	
   private String [][] perguntas = {
			{"Qual o seu consumo mensal em KWH?",
			 "",
			 "null"}, // 0
			{"Voc� ultiliza botij�o de gas de 13kg?",
			 "Quantos botij�es por m�s?",
			 "null"}, // 1
			{"Voc� ultiliza gas natural?",
			 "Quantos m� por m�s?",
		     "null"}, // 2
			{"Voc� utiliza algum veiculo movido a gasolina?",
		     "1 - Pequeno (at� 1.4) \n2 - M�dio (de 1.5 a 2.0) \n3 - Grande (maior que 2.0) \n4 - Motocicleta", 
		     "Quantos km por m�s?"}, // 3
			{"Voc� utiliza algum veiculo movido a Etanol?",
		     "1 - Pequeno (at� 1.4) \n2 - M�dio (de 1.5 a 2.0) \n3 - Grande (maior que 2.0)",	 
		     "Quantos km por m�s?"}, // 4
			{"Voc� utiliza algum veiculo movido a diesel?",
		     "1 - Carro \n2 - �nibus em Per�metro Urbano \n3 - �nibus em Rodovia",	 
		     "Quantos km por m�s?"}, // 5
			{"Voc� utiliza Carro movido a GNV?",
		     "Quantos km por m�s?",
		     "null"}, // 6
			{"Quanto lixo voc� produz por dia em quilos?",
		     "",
		     "null"} // 7
	};
	
	public String[] pergunta(int p) {

		String [] pergunta = {
				this.perguntas[p][0], // 0 
				this.perguntas[p][1], // 1
				this.perguntas[p][2], // 2
				"\n1 - Sim \n2 - N�o", // 3
				"Op��o invalida tente novamente !!\n\n" // 4
		};
		
		return pergunta;
	}

}
