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
//				JOptionPane.showInputDialog("Voc� ultiliza botij�o de gas de 13kg "
//						+ "\n1 - sim "
//						+ "\n2 - n�o"
//						)
//		);
//		x.setCo2(botijao.calculo());
//
		try {
		opt = Integer.parseInt(JOptionPane.showInputDialog("Voc� utiliza G�s Natural?"
		   		+ "\n1 - sim "
		   		+ "\n2 - n�o"
			));
		}catch (Exception e) {
			opt = 3;
		}
		gasNatural gasN = new gasNatural(opt);				   
		x.setCo2(gasN.resultado());

//
//		lixo lixo1 = new lixo(
//			JOptionPane.showInputDialog("Quannto de lixo voc� gera por dia em quilos ?"),
//			 true
//		 );
//		x.setCo2(lixo1.calculo());
//
//
//		veiculoDiesel veiculoD = new veiculoDiesel(
//			JOptionPane.showInputDialog("Voc� utiliza Carro movido á Diesel?"
//							+ "\n1 - sim "
//							+ "\n2 - n�o"
//						)
//		);				   
//		x.setCo2(veiculoD.calculo());
//
//		veiculoEtanol veiculoE  = new veiculoEtanol(
//			JOptionPane.showInputDialog("Voc� utiliza Carro movido á Etanol?"
//							+ "\n1 - sim "
//							+ "\n2 - n�o"
//						)
//		);				   
//		x.setCo2(veiculoE.calculo());
//
//
//		veiculoGNV veiculoG = new veiculoGNV(
//			JOptionPane.showInputDialog("Voc� utiliza Carro movido á GNV?"
//							+ "\n1 - sim "
//							+ "\n2 - n�o"
//						)
//		);				   
//		x.setCo2(veiculoG.calculo());
//
//
//		veiculoGasolina veiculoGA  = new veiculoGasolina(
//			JOptionPane.showInputDialog("Voc� utiliza Carro movido á Gasolina?"
//							+ "\n1 - sim "
//							+ "\n2 - n�o"
//						)
//		);				   
//		x.setCo2(veiculoGA.calculo());  
//
//
//		viagens  viagem = new viagens(
//			JOptionPane.showInputDialog("Voc� viajou recentemente?"
//						+ "\n1 - sim "
//						+ "\n2 - n�o"
//						)
//		);				   
//		x.setCo2(viagem.calculo());



		x.plantar() ;
	
	}
	
}
