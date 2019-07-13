package starcraft;

import javax.swing.JProgressBar;

public class Transporte extends Protoss{

	Transporte(){
		
		this.nombre= "Transporte";
		this.danho= 50;
		this.vidha=800;
		this.velocidad=100;
		JProgressBar progressBarterra= barra();
		progressBarterra.setMaximum(800);
	}

	public JProgressBar barra() {
		return new JProgressBar();
	}
}

