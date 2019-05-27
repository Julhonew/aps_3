package calculadoraCo2;
import javax.swing.JOptionPane;

public class escopo {

	@SuppressWarnings("unused")
	public static void main(String[] args) { 
		
		Perguntas pergunta = new Perguntas();
		Erros erro = new Erros();
		
//		String[] arrPergunta = pergunta.pergunta(i);
		
		for(int i = 0; i < 8; i++) {
			String[] arrPergunta = pergunta.pergunta(i);
			int cod = 0;
			
			try {
				if(arrPergunta[1] != ""){
					int p1 = Integer.parseInt(JOptionPane.showInputDialog(arrPergunta[0] + arrPergunta[3]));
					if(p1 == 1) {
						cod = 1;
						int p2 = Integer.parseInt(JOptionPane.showInputDialog(arrPergunta[1]));
						if(arrPergunta[2] != "" ) {
							cod = 2;
							int p3 = Integer.parseInt(JOptionPane.showInputDialog(arrPergunta[2]));
						} 
					}
				}else{
					int p1 = Integer.parseInt(JOptionPane.showInputDialog(arrPergunta[0]));
				}
			}catch(Exception e) {
				if(arrPergunta[1] != ""){
					erro.opcao2(i, true, cod);
				}else {
					erro.opcao2(i, false, cod);
				}
			}
	
		}
		
	}
}
