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


		consumogasNatural  = new consumogasNatural(
		       JOptionPane.ShowInputDialog("Gás Natural - Gás de Encanamento
						   \nVocê utiliza Gás Natural?
						   \n1 - Sim 
						   \n2 - Não"
		);				   
		x.setco2(consumo.calculo());


		consumolixo consumo = new consumolixo(
			JOptionPane.showInputDialog("Qual o seu consumo diário de lixo em quilos ?"),
			 true
		 );
		x.setco2(consumo.calculo());


		consumoveiculoDiesel  = new consumoveiculoDiesel(
			JOptionPane.ShowInputDialog("Você utiliza Carro movido á Diesel??
						   \n1 - Sim 
						   \n2 - Não"
		);				   
		x.setco2(consumo.calculo());

		consumoveiculoEtanol  = new consumoveiculoEtanol(
			JOptionPane.ShowInputDialog("Você utiliza Carro movido á Etanol??
						   \n1 - Sim 
						   \n2 - Não"
		);				   
		x.setco2(consumo.calculo());


		consumoveiculoGNV  = new consumoveiculoGNV(
			JOptionPane.ShowInputDialog("Você utiliza Carro movido á GNV??
						   \n1 - Sim 
						   \n2 - Não"
		);				   
		x.setco2(consumo.calculo());


		consumoveiculoGasolina  = new consumoveiculoGasolina(
			JOptionPane.ShowInputDialog("Você utiliza Carro movido á Gasolina??
					   \n1 - Sim 
					   \n2 - Não"
		);				   
		x.setco2(consumo.calculo());  


		consumoviagens  = new consumoviagens(
			JOptionPane.ShowInputDialog("Você viajou recentemente?
					   \n1 - Sim 
					   \n2 - Não"
		);				   
		x.setco2(consumo.calculo());



		calculoArvores.plantar() ;
	
	}
	
}
