package starcraft;
import javax.swing.JLabel;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

import javax.swing.JProgressBar;
public class Pelea2 extends Thread{
	String nombre_proto;
	String nombre_terra;
	String nombre;
	Integer danho;
	Integer vidha;
	JProgressBar raceTrackTerra;
	//JProgressBar raceTrackProto;
	JLabel runTime;
	JLabel sleepTime;
	Integer vida_terra;
	Integer dano_terra;
	Integer vida_proto;
	Integer dano_proto;
	Integer velocidad;
	Integer velocidad_terran;
	Integer velocidad_proto;
	
	
Pelea2(String nombre_terra_,String nombre_proto_, JLabel runT, JLabel sleepT,JProgressBar raceTrack_terra,Integer vida_terra_,Integer dano_terra_,Integer vida_proto_,Integer dano_proto_,Integer velocidad_ ){
	
		this.nombre_proto=nombre_proto_;
		this.nombre_terra=nombre_terra_;
		this.raceTrackTerra= raceTrack_terra;
		//this.raceTrackProto= raceTrack_proto;
		runTime = runT;
		sleepTime = sleepT;
		this.vida_terra=vida_terra_;
		this.dano_terra=dano_terra_;
		this.vida_proto=vida_proto_;
		this.dano_proto=dano_proto_;
		this.velocidad=velocidad_;
	}
	Pelea2(){
		
	};
	static Fanatico getFanatico(){
		return new Fanatico();
	}
	static Transporte getTransporte(){
		return new Transporte();
	}
	static Acechador getAcechador(){
		return new Acechador();
	}

	
	public Integer setVidaactualterra(Integer vida_actual_terra) {
		return vida_actual_terra;
	}
public void run() {
		
		long start = System.nanoTime();
		
		int r = velocidad;
		
        try { 
            while ((0-dano_proto < vida_terra) && -dano_terra<= vida_proto ) { 

           
            	System.out.print(velocidad);
            	//raceTrackTerra.setValue(vida_terra); 
            	//raceTrackProto.setValue(vida_proto); 
                
                sleep(r); 
                
                //sleepTime.setText(String.valueOf(Integer.parseInt(sleepTime.getText())+r));
                
                vida_terra=vida_terra-dano_proto; 
                setVidaactualterra(vida_terra);
                //vida_proto=vida_proto-dano_terra;
            } 
        } 
        catch (Exception e) { 
        } 
        
        long finish = System.nanoTime();
        
        runTime.setText(String.valueOf(finish-start));
    } 
	
	static Queue<String> nombresProtoss = new LinkedList<String>(Arrays.asList(getFanatico().getNombre(),getFanatico().getNombre(),getAcechador().getNombre(),getTransporte().getNombre()));
	static Queue<Integer> danoProtoss = new LinkedList<Integer>(Arrays.asList(getFanatico().getdanho(),getFanatico().getdanho(),getAcechador().getdanho(),getTransporte().getdanho()));
	static Queue<Integer> vidaProtoss = new LinkedList<Integer>(Arrays.asList(getFanatico().getvidha(),getFanatico().getvidha(),getAcechador().getvidha(),getTransporte().getvidha()));
	static Queue<Integer> velocidadProtoss = new LinkedList<Integer>(Arrays.asList(getFanatico().getvelocidad(),getFanatico().getvelocidad(),getAcechador().getvelocidad(),getTransporte().getvelocidad()));
	static Queue<JProgressBar> berraProtoss = new LinkedList<JProgressBar>(Arrays.asList(getFanatico().barra(),getFanatico().barra(),getAcechador().barra(),getTransporte().barra()));
	
}
