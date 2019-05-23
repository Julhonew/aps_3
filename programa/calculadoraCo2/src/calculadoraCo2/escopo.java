package calculadoraCo2;
import javax.swing.JOptionPane ;

public class escopo {

	public static void main(String[] args) { 
	
	calculoArvores x = new calculoArvores();
		
	consumoEnergia energia = new consumoEnergia(
		JOptionPane.showInputDialog("Qual o seu consumo mensal em KWH?"),
		true
	);
	x.setco2(consumo.calculo());

       	consumogasBorijao botijao = new consumogasBorijao(
		JOptionPane.ShowInputDialog("GLP - Gás Liquefeito de Petróleo Cada Botijão Contém 13Kg de GLP
					    \nVocê utiliza Gás Liquefeito?
					    \n1 - Sim 
					    \n2 - Não"
	);
	x.setco2(botijao.calculo());

        System.out.println("Gás Natural (Gás de Encanamento)");
	JOptionPane.ShowInputDialog("Você utiliza Gás Natural?\n 1 - Sim \n 2 - Não");
	x.setco2(consumo.calculo());
	consumogasNatural  = new consumogasNatural(2, true);

	  consumolixo consumo = new consumolixo(
	  JOptionPane.showInputDialog("Qual o seu consumo diário de lixo (em quilos)"),
	  true,);
	  x.setco2(consumo.calculo());

	  JOptionPane.ShowInputDialog("Você utiliza Carro movido á Diesel?\n 1 - Sim \n 2 - Não");
	  x.setco2(consumo.calculo());
	  consumoveiculoDiesel  = new consumoveiculoDiesel(2, true);

	  JOptionPane.ShowInputDialog("Você utiliza Carro movido á Etanol?\n 1 - Sim \n 2 - Não");
	  x.setco2(consumo.calculo());
	  consumoveiculoEtanol = new consumoveiculoEtanol(2, true);

	  JOptionPane.ShowInputDialog("Você utiliza Carro movido á GNV?\n 1 - Sim \n 2 - Não");
	  x.setco2(consumo.calculo());
	  consumoveiculoGNV  = new consumoveiculoGNV(2, true);

	  JOptionPane.ShowInputDialog("Você utiliza Carro movido á Gasolina?\n 1 - Sim \n 2 - Não");
	  x.setco2(consumo.calculo());
	  consumoveiculoGasolina  = new consumoveiculoGasolina(2, true);

	  System.out.println("Transporte Aéreo - Km de Distância (ida e volta)");

	  JOptionPane.ShowInputDialog("Você viajou recentemente? \n 1 - Sim \n 2 - Não");
	  x.setco2(consumo.calculo());
	  consumoveiculoGasolina  = new consumoveiculoGasolina(2, true);



	  System.out.println("Você deverá plantar");
	  System.out.println(calculoArvores.plantar(0,null));


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
