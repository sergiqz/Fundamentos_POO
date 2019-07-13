package starcraft;

import javax.swing.JProgressBar;

public class Acechador extends Protoss{

	Acechador(){
		
		this.nombre= "Acechador";
		this.danho= 20;
		this.vidha=290;
		this.velocidad=100;
		JProgressBar progressBarterra= barra();
		progressBarterra.setMaximum(250);
	}

	public JProgressBar barra() {
		return new JProgressBar();
	}
}
