package calculadoraCo2;
import javax.swing.JOptionPane;

public class gasNatural extends co2{

	public gasNatural (int res) {
		
		boolean verificador = false; 
		
		this.setEmissao(22.674);
		
		while (verificador == false){
			
			if(res == 1){
				verificador = true;
			}else if (res == 2){
				this.setVerificar(false);
			}else {
				try {
					res = Integer.parseInt(JOptionPane.showInputDialog("Op��o invalida, tente novamente!!"
							+ "\n\nVoc� utiliza G�s Natural?"
		    		   		+ "\n1 - sim "
		    		   		+ "\n2 - n�o"
						));
				}catch(Exception e) {
					verificador = false;
				}
			}
		} 
		
		if(res == 1){
			this.setValor(Integer.parseInt(JOptionPane.showInputDialog("Quantos m� por m�s?")));
			this.setVerificar(true);
		}
		
		this.calculo();
		
	}
	
	public double resultado() {
		
		return this.calculo();
	}

}
