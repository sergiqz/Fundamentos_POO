package starcraft;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

import javax.swing.JProgressBar;

public class Terran extends Pelea{


	Terran(){
		
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
	
	static Soldado getSoldado(){
		return new Soldado();
	}
	static Murcielago getMurcielago(){
		return new Murcielago();
	}
	static Cruzero getCruzero(){
		return new Cruzero();
	}
	static Goliat getGoliat(){
		return new Goliat();
	}
	
	public static Integer getVelocidadTerra() {
		
		return velocidadTerran.remove();	
	}
	
	public Integer get_noelimi_VelocidadTerra() {
		
		return velocidadTerran.element();	
	}


	
	public String getNombreTerra() {
					
			return nombresTerran.remove();	
	}
	
	public String get_noelimi_NombreTerra() {
		
		return nombresTerran.element();	
}
	
	public Integer getdanoTerra() {
		
		return danoTerran.remove();
	}
	public Integer getvidaTerra() {
		
		return vidaTerran.remove();
	}
	public static Integer getvida_noelimi_Terra() {
		
		return vidaTerran.element();
	}
	public static Integer getdano_noelimi_Terra() {
		
		return danoTerran.element();
	}
	public static JProgressBar getberra_noelimi_Terran() {
		
		return berraTerran.element();
	}
	
	public static JProgressBar getberraTerran() {
		
		return berraTerran.remove();
	}
}