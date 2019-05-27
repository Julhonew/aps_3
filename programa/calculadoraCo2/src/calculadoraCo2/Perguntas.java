package calculadoraCo2;

public class Perguntas {
	
   private String [][] perguntas = {
			{"Qual o seu consumo mensal em KWH?",
			 "",
			 "null"}, // 0
			{"Você ultiliza botijão de gas de 13kg?",
			 "Quantos botijões por mês?",
			 "null"}, // 1
			{"Você ultiliza gas natural?",
			 "Quantos m³ por mês?",
		     "null"}, // 2
			{"Você utiliza algum veiculo movido a gasolina?",
		     "1 - Pequeno (até 1.4) \n2 - Médio (de 1.5 a 2.0) \n3 - Grande (maior que 2.0) \n4 - Motocicleta", 
		     "Quantos km por mês?"}, // 3
			{"Você utiliza algum veiculo movido a Etanol?",
		     "1 - Pequeno (até 1.4) \n2 - Médio (de 1.5 a 2.0) \n3 - Grande (maior que 2.0)",	 
		     "Quantos km por mês?"}, // 4
			{"Você utiliza algum veiculo movido a diesel?",
		     "1 - Carro \n2 - Ônibus em Perímetro Urbano \n3 - Ônibus em Rodovia",	 
		     "Quantos km por mês?"}, // 5
			{"Você utiliza Carro movido a GNV?",
		     "Quantos km por mês?",
		     "null"}, // 6
			{"Quanto lixo você produz por dia em quilos?",
		     "",
		     "null"} // 7
	};
	
	public String[] pergunta(int p) {

		String [] pergunta = {
				this.perguntas[p][0], // 0 
				this.perguntas[p][1], // 1
				this.perguntas[p][2], // 2
				"\n1 - Sim \n2 - Não", // 3
				"Opção invalida tente novamente !!\n\n" // 4
		};
		
		return pergunta;
	}

}
