package calculadoraCo2;
import javax.swing.JOptionPane ;

public class escopo {

	public static void main(String[] args) {
	//* Abaixo declaramos a variavel de entrada de cada classe respectiva, todas int conforme a classe de cada 1 propõe.*/ 
	
	calculoArvores x = new calculoArvores();
		
	           consumoEnergia consumo = new consumoEnergia(
		   JOptionPane.showInputDialog("Qual o seu consumo mensal em KWH?"),
	        	true
	    );
	
	           x.setco2(consumo.calculo());
		
	          System.out.println("GLP - Gás Liquefeito de Petróleo Cada Botijão Contém 13Kg de GLP");
			
	          JOptionPane.ShowInputDialog("Você utiliza Gás Liquefeito?\n 1 - Sim \n 2 - Não");
		  x.setco2(consumo.calculo());
	          consumogasBorijao  = new consumogasBorijao(2, true);
		
		
		  JOptionPane.showMessageDialog(null, "Gás Natural (Gás de Encanamento)")
	          consumogasNatural consumo = new consumogasNatural(
		  JOptionPane.showInputDialog("Qual o seu consumo mensal de gás natural em M3"),
		  true, false);
		  x.setco2(consumo.calculo());
		
                  consumolixo consumo = new consumolixo(
		  JOptionPane.showInputDialog("Qual o seu consumo diário de lixo (em quilos)"),
		  true,);
	          x.setco2(consumo.calculo());
		
		  JOptionPane.ShowInputDialog("Você utiliza Carro movido á Diesel?\n 1 - Sim \n 2 - Não");
		  x.setco2(consumo.calculo());
	          consumoveiculoDiesel  = new consumoveiculoDiesel(2, true);
		
               }
		
		
	
		
		
		
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
