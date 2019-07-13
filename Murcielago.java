package starcraft;

import javax.swing.JProgressBar;

public class Murcielago extends Terran{

	Murcielago(){
		
		this.nombre= "Murcielago";
		this.danho= 17;
		this.vidha=180;
		this.velocidad=800;
		JProgressBar progressBarterra= barra();
		progressBarterra.setMaximum(180);
	}

	public JProgressBar barra() {
		return new JProgressBar();
	}
}
