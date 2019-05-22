package calculadoraCo2;
import javax.swing.JOptionPane ;

public class escopo {

	public static void main(String[] args) {
	//* Abaixo declaramos a variavel de entrada de cada classe respectiva, todas int conforme a classe de cada 1 propõe.*/
		
		int entradai, entradabor, entradanat, entradalix, entradavd, entradave, entradagnv, entradagas, entradaviag ; 
	
	consumoEnergia consumo = new consumoEnergia(
		JOptionPane.showInputDialog("Qual o seu consumo mensal em KWH?"),
		true
	);
		
		JOptionPane.showMessageDialog(null, "GLP - Gás Liquefeito de Petróleo Cada Botijão Contém 13Kg de GLP")
			
	consumogasBorijao consumo = new consumogasBorijao(
		  JOptionPane.showInputDialog("Qual o seu consumo mensal de Gás de Cozinha em KG"),
		  true, false
		  );
		
		
		JOptionPane.showMessageDialog(null, "Gás Natural (Gás de Encanamento)")
		
	consumogasNatural consumo = new consumogasNatural(
		  JOptionPane.showInputDialog("Qual o seu consumo mensal de gás natural em M3"),
		  true, false
		  );
		
        consumolixo consumo = new consumolixo(
		  JOptionPane.showInputDialog("Qual o seu consumo diário de lixo (em quilos)"),
		  true,
		  );
		
		
		
	setco2(consumo.calculo())
		
		
		
	/*
	 * Preciso que você faça um quiz com as classe disponivel, dá uma olhada no site que esta na documentação
	 * joga o resultado de cada soma no metodo setCo2 que esta na classe calculoArvores, é essa classe que vai retornar
	 * a quantidade de arvores que o usuario vai ter que plantar no metodo plantar(), qualquer duvida ou correção pode me 
	 * chamar.
	 * 
	 * */
		
     //Exemplo
		consumoEnergia x = new consumoEnergia(10, true);
		System.out.println(x.calculo());
	
	}
	
}
