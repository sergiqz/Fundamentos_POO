package starcraft;

import javax.swing.JProgressBar;

public class Fanatico extends Protoss{

	Fanatico(){
		
		this.nombre= "Fanatico";
		this.danho= 15;
		this.vidha=150;
		this.velocidad=100;
		JProgressBar progressBarterra= barra();
		progressBarterra.setMaximum(150);
	}
	
	public JProgressBar barra() {
		return new JProgressBar();
	}
}