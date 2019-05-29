package calculadoraCo2;

import javax.swing.JOptionPane;

public class Erros {

	@SuppressWarnings("unused")
	public void opcao2(int p, boolean opt, int cod) {
		// instancia o metodo de calculo de co2
		calculoCo2 calculo = new calculoCo2();
		
		// instancia o array de perguntas 
		Perguntas pergunta = new Perguntas();
		
		// instacia o array de valores co2
		co2 c = new co2();
		
		// recebe o retorno da pergunta requirida do array
		String[] arrPergunta = pergunta.pergunta(p);
		
		// instacia a classe que faz o retorno do tamanho do array de co2 requerido
		verificaArr arrCo2 = new verificaArr();
		//recebe o tamanho do array requerido
		int tamanho = arrCo2.verificaArray(p);
		
		// recebe o tamanho do array perguntas
		int count = this.verficaArr(arrPergunta);
		
		
		boolean verificador = false;
		int opcao = 0;
		int tipo = 0;
		int valor = 0;
		boolean alerta = false;
		String mensagem;
		
		if(count == 1){
			System.out.println(arrPergunta[1]);
			while(!verificador) {
				try {
					valor = Integer.parseInt(JOptionPane.showInputDialog(arrPergunta[4] + arrPergunta[0]));
					verificador = true;
				}catch(Exception e) {
					verificador = false;
				}
			}
		}else if(count == 2) {
			while(!verificador) {
				try {
					if(cod == 0) {
						if(opcao == 0){
							opcao = Integer.parseInt(JOptionPane.showInputDialog(arrPergunta[4] + arrPergunta[0] + arrPergunta[3]));
							if(opcao > 2 || opcao <= 0){
								opcao = 0;
								throw new Exception();
							}
						} 
						if(opcao == 1) {
							mensagem = (alerta) ? arrPergunta[4] : "";
							valor = Integer.parseInt(JOptionPane.showInputDialog(mensagem + arrPergunta[1]));
						}else if(opcao != 2) {
							verificador = false;
						}
					}else if(cod == 1) {
						valor = Integer.parseInt(JOptionPane.showInputDialog(arrPergunta[4] + arrPergunta[1]));
					}
					verificador = true;
				}catch(Exception e) {
					alerta = true;
					verificador = false;
				}
			}
		}else{
			while(!verificador) {
				try {
					if(cod == 0) {
						if(opcao == 0){
							opcao = Integer.parseInt(JOptionPane.showInputDialog(arrPergunta[4] + arrPergunta[0] + arrPergunta[3]));
							if(opcao > 2 || opcao <= 0){
								opcao = 0;
								throw new Exception();
							}
						}
						
						if(opcao == 1) {
							mensagem = (alerta) ? arrPergunta[4] : "";
							if(tipo == 0) {
								tipo = Integer.parseInt(JOptionPane.showInputDialog(mensagem + arrPergunta[1]));
								if(tipo == 5){
									cod = 1;
									tipo = 0;
									throw new Exception();
								}
							}
							if(verificador == false && tipo <= tamanho && tipo > 0) {
								mensagem = (alerta) ? arrPergunta[4] : "";
								valor = Integer.parseInt(JOptionPane.showInputDialog(arrPergunta[4] + arrPergunta[2]));
								verificador = true;
							}
						}else if(opcao == 2) {
							verificador = true;
						}
					}else if(cod == 1) {
						if(tipo == 0) {
							tipo = Integer.parseInt(JOptionPane.showInputDialog(arrPergunta[4] + arrPergunta[1]));
							if(tipo == 5){
								cod = 1;
								tipo = 0;
								throw new Exception();
							}
						}
						if(verificador == false && tipo <= tamanho && tipo > 0) {
							mensagem = (alerta) ? arrPergunta[4] : "";
							valor = Integer.parseInt(JOptionPane.showInputDialog(arrPergunta[4] + arrPergunta[2]));
							verificador = true;
						}
					}else if(cod == 2) {
						mensagem = (alerta) ? arrPergunta[4] : "";
						valor = Integer.parseInt(JOptionPane.showInputDialog(mensagem + arrPergunta[2]));
						verificador = true;
					}
				}catch(Exception e) {
					alerta = true;
					verificador = false;
				}
			}
		}
		
		calculo.co2(valor, tipo, p);
	}
	
	
	public int verficaArr(String[] arrPergunta) {
		
		int count;
		
		if(arrPergunta[1] == "" && arrPergunta[2] == "null" ){
			count = 1;
		}else if (arrPergunta[1] != "" && arrPergunta[2] == "null") {
			count = 2;
		}else{
			count = 3;
		}
		
		return count;
	}
	
}