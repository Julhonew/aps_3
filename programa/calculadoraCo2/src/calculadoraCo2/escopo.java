package calculadoraCo2;
import javax.swing.JOptionPane;

@SuppressWarnings("unused")
public class escopo {

	@SuppressWarnings("unused")
	public static void main(String[] args) { 
		verificaArr tamanhoPergunta = new verificaArr();
		calculoArvores arvores = new calculoArvores();
		verificaArr arrCo2 = new verificaArr();
		calculoCo2 calculo = new calculoCo2();
		Perguntas pergunta = new Perguntas();
		Erros erro = new Erros();
		double co2 = 0; 
		
		for(int i = 0; i < 8; i++) {
			String[] arrPergunta = pergunta.pergunta(i);
			int tamanhoTipo = arrCo2.verificaArray(i);
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
					if(opcao == 2) {
						continue;
					}else if(opcao > 2 || opcao <= 0){
						throw new Exception();
					}
					cod = 1;
					valor  = Integer.parseInt(JOptionPane.showInputDialog(arrPergunta[1]));
				}else{
					opcao = Integer.parseInt(JOptionPane.showInputDialog(arrPergunta[0] + arrPergunta[3]));
					if(opcao == 2) {
						continue;
					}else if(opcao > 2 || opcao <= 0){
						throw new Exception();
					}
					cod = 1;
					tipo = Integer.parseInt(JOptionPane.showInputDialog(arrPergunta[1]));
					if(tipo > tamanhoTipo){
						throw new Exception();
					}
					cod = 2;
					valor = Integer.parseInt(JOptionPane.showInputDialog(arrPergunta[2]));
				}
				
				co2 += calculo.co2(valor, tipo, i);
					
			}catch(Exception e) {
				if(tamanho == 1){
					erro.opcao2(i, true, cod);
				}else {
					erro.opcao2(i, false, cod);
				}
			}
		}
		
		arvores.setCo2(co2);
		JOptionPane.showMessageDialog(null, arvores.plantar());
		
	}
}
