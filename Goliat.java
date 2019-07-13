package starcraft;

import javax.swing.JProgressBar;

public class Goliat extends Terran{

	Goliat(){
		
		this.nombre= "Goliat";
		this.danho= 20;
		this.vidha=250;
		this.velocidad=100;
		JProgressBar progressBarterra= barra();
		progressBarterra.setMaximum(250);
	}

	public JProgressBar barra() {
		return new JProgressBar();
	}
}