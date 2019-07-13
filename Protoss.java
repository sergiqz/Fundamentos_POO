package starcraft;

import javax.swing.JProgressBar;

public class Protoss extends Pelea2{


	Protoss(){

	}
	public String getNombre() {
		return nombre;
	}
	public Integer getdanho() {
		return danho;
	}
	public Integer getvidha() {
		return vidha;
	}
	public Integer getvelocidad() {
		return velocidad;
	}
	
	
	static Fanatico getFanatico(){
		return new Fanatico();
	}
	static Transporte getTransporte(){
		return new Transporte();
	}
	static Acechador getAcechador(){
		return new Acechador();
	}
	
public static Integer getVelocidadProtoss() {
		
		return velocidadProtoss.remove();	
}
public Integer get_noelimi_VelocidadProtoss() {
	
	return velocidadProtoss.element();	
}


public  String getNombreProtoss() {
		
		return nombresProtoss.remove();	
}
public String get_noelimi_NombreProtoss() {
	
	return nombresProtoss.element();	
}

public Integer getdanoProtoss(){
	
	return danoProtoss.remove();
}
public Integer getvidaProtoss(){
	
	return vidaProtoss.remove();
}
public static Integer getvida_noelimi_Protoss(){
	
	return vidaProtoss.element();
}

public Integer getdano_noelimi_Protoss(){
	
	return danoProtoss.element();
}

public static JProgressBar getberraProtoss() {
	
	return berraProtoss.remove();
}

}
