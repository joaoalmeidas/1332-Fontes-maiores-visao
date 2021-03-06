import java.awt.Font;

import javax.swing.JTextArea;

public class VisaoPanel extends JTextArea {
	
	private int tamanhoFonte;
	private boolean negrito;
	private String tipoFonte;
	private Font fonte;
	
	public VisaoPanel() {
		
		tipoFonte = "Serif";
		tamanhoFonte = 18;
		negrito = false;
		fonte = new Font(tipoFonte, Font.PLAIN, tamanhoFonte);
		setFont(fonte);
		
	}

	public int getTamanhoFonte() {
		return tamanhoFonte;
	}

	public void setTamanhoFonte(int tamanhoFonte) {
		this.tamanhoFonte = tamanhoFonte;
	}

	public boolean isNegrito() {
		return negrito;
	}

	public void setNegrito(boolean negrito) {
		this.negrito = negrito;
		atualizaFonte();
	}
	
	
	
	public String getTipoFonte() {
		return tipoFonte;
	}

	public void setTipoFonte(String tipoFonte) {
		this.tipoFonte = tipoFonte;
	}

	public void aumentaFonte() {
		
		setTamanhoFonte(getTamanhoFonte() + 1);
		atualizaFonte();
		
	}
	
	public void diminuiFonte() {
		
		if(getTamanhoFonte() != 1) {
			
			setTamanhoFonte(getTamanhoFonte() - 1);
			
		}

		atualizaFonte();
		
	}
	
	public void alteraTipoFonte(String nome) {
		
		setTipoFonte(nome);
		atualizaFonte();
		
	}
	

	
	public void atualizaFonte() {
		
		fonte = new Font(tipoFonte, negrito == true ? Font.BOLD : Font.PLAIN, tamanhoFonte);
		setFont(fonte);
		
	}


}
