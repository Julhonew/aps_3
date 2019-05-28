package calculadoraCo2;
import javax.swing.JOptionPane;

public class escopo {

	@SuppressWarnings("unused")
	public static void main(String[] args) { 
		verificaArr tamanhoPergunta = new verificaArr();
		calculoCo2 calculo = new calculoCo2();
		Perguntas pergunta = new Perguntas();
		Erros erro = new Erros();
		
//		String[] arrPergunta = pergunta.pergunta(i);
		
		for(int i = 0; i < 8; i++) {
			String[] arrPergunta = pergunta.pergunta(i); 
			int tamanho = tamanhoPergunta.verificaArray(arrPergunta);
			int opcao = 0;
			int tipo = 0;
			int valor = 0;
			int cod = 0;
			
			try {

				if(tamanho == 1){
					valor = Integer.parseInt(JOptionPane.showInputDialog(arrPergunta[0]));
				}else if(tamanho == 2){
					opcao = Integer.parseInt(JOptionPane.showInputDialog(arrPergunta[0] + arrPergunta[3]));
					cod = 1;
					valor  = Integer.parseInt(JOptionPane.showInputDialog(arrPergunta[1] + arrPergunta[3]));
				}else{
					opcao = Integer.parseInt(JOptionPane.showInputDialog(arrPergunta[0] + arrPergunta[3]));
					cod = 1;
					tipo = Integer.parseInt(JOptionPane.showInputDialog(arrPergunta[1]));
					cod = 2;
					valor = Integer.parseInt(JOptionPane.showInputDialog(arrPergunta[2]));
				}
				
				calculo.co2(valor, tipo, i);
					
			}catch(Exception e) {
				if(tamanho == 1){
					erro.opcao2(i, true, cod);
				}else {
					erro.opcao2(i, false, cod);
				}
			}
	
		}
		
	}
}
