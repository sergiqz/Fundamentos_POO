package starcraft;

import javax.swing.JProgressBar;

public class Cruzero extends Terran{

	Cruzero(){
		
		this.nombre= "Cruzero";
		this.danho= 50;
		this.vidha=900;
		this.velocidad=100;
		JProgressBar progressBarterra= barra();
		progressBarterra.setMaximum(900);
	}

	public JProgressBar barra() {
		return new JProgressBar();
	}
}
