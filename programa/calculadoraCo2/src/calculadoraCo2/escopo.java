package calculadoraCo2;
import javax.swing.JOptionPane ;

public class escopo {

	public static void main(String[] args) { 
		
		int opt;
	
		calculoArvores  x = new calculoArvores();

//		consumoEnergia energia = new consumoEnergia(
//			JOptionPane.showInputDialog("Qual o seu consumo mensal em KWH?"),
//			trued
//		);
//		x.setCo2(energia.calculo());
//
//		gasBorijao botijao = new gasBorijao(
//				JOptionPane.showInputDialog("Você ultiliza botijão de gas de 13kg "
//						+ "\n1 - sim "
//						+ "\n2 - não"
//						)
//		);
//		x.setCo2(botijao.calculo());
//
		try {
		opt = Integer.parseInt(JOptionPane.showInputDialog("Você utiliza Gás Natural?"
		   		+ "\n1 - sim "
		   		+ "\n2 - não"
			));
		}catch (Exception e) {
			opt = 3;
		}
		gasNatural gasN = new gasNatural(opt);				   
		x.setCo2(gasN.resultado());

//
//		lixo lixo1 = new lixo(
//			JOptionPane.showInputDialog("Quannto de lixo você gera por dia em quilos ?"),
//			 true
//		 );
//		x.setCo2(lixo1.calculo());
//
//
//		veiculoDiesel veiculoD = new veiculoDiesel(
//			JOptionPane.showInputDialog("Você utiliza Carro movido Ã¡ Diesel?"
//							+ "\n1 - sim "
//							+ "\n2 - não"
//						)
//		);				   
//		x.setCo2(veiculoD.calculo());
//
//		veiculoEtanol veiculoE  = new veiculoEtanol(
//			JOptionPane.showInputDialog("Você utiliza Carro movido Ã¡ Etanol?"
//							+ "\n1 - sim "
//							+ "\n2 - não"
//						)
//		);				   
//		x.setCo2(veiculoE.calculo());
//
//
//		veiculoGNV veiculoG = new veiculoGNV(
//			JOptionPane.showInputDialog("Você utiliza Carro movido Ã¡ GNV?"
//							+ "\n1 - sim "
//							+ "\n2 - não"
//						)
//		);				   
//		x.setCo2(veiculoG.calculo());
//
//
//		veiculoGasolina veiculoGA  = new veiculoGasolina(
//			JOptionPane.showInputDialog("Você utiliza Carro movido Ã¡ Gasolina?"
//							+ "\n1 - sim "
//							+ "\n2 - não"
//						)
//		);				   
//		x.setCo2(veiculoGA.calculo());  
//
//
//		viagens  viagem = new viagens(
//			JOptionPane.showInputDialog("Você viajou recentemente?"
//						+ "\n1 - sim "
//						+ "\n2 - não"
//						)
//		);				   
//		x.setCo2(viagem.calculo());



		x.plantar() ;
	
	}
	
}
