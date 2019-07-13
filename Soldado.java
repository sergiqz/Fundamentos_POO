package starcraft;
import javax.swing.JProgressBar;

public class Soldado extends Terran{

	Soldado(){
		
		this.nombre= "Soldado";
		this.danho= 10;
		this.vidha=100;
		this.velocidad=100;
		JProgressBar progressBarterra= barra();
		progressBarterra.setMaximum(100);
	}

	public JProgressBar barra() {
		return new JProgressBar();
	}
}