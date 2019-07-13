package starcraft;
import javax.swing.JLabel;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

import javax.swing.JProgressBar;
 class Pelea extends Thread
{
	
	String nombre_proto;
	String nombre;
	Integer danho;
	Integer vidha;
	//JProgressBar raceTrackTerra;
	JProgressBar raceTrackProto;
	JLabel runTime;
	JLabel sleepTime;
	Integer vida_terra;
	Integer dano_terra;
	Integer vida_proto;
	Integer dano_proto;
	Integer velocidad;
	
	
	Pelea(String nombre_terra_,String nombre_proto_,JProgressBar raceTrack_proto, JLabel runT, JLabel sleepT/*,JProgressBar raceTrack_proto*/,Integer vida_terra_,Integer dano_terra_,Integer vida_proto_,Integer dano_proto_,Integer velocidad_ ){
		
		this.nombre_proto=nombre_proto_;
		this.nombre=nombre_terra_;
		this.raceTrackProto= raceTrack_proto;
		//this.raceTrackProto= raceTrack_proto;
		runTime = runT;
		sleepTime = sleepT;
		this.vida_terra=vida_terra_;
		this.dano_terra=dano_terra_;
		this.vida_proto=vida_proto_;
		this.dano_proto=dano_proto_;
		this.velocidad=velocidad_;
		Pelea2 pele2;
		pele2 =new Pelea2();
	}
	Pelea(){
		
	};
	
	public String getNombre_terra() {
		return nombre;
	}
	public String getNombre_proto() {
		return nombre_proto;
	}
	
/*	
	static Fanatico getFanatico(){
		return new Fanatico();
	}
	static Transporte getTransporte(){
		return new Transporte();
	}
	static Acechador getAcechador(){
		return new Acechador();
	}
	*/
	static Terran getTerran(){
		return new Terran();
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
	
	public void run() {
	
		long start = System.nanoTime();
		
		int r = velocidad;
		//int vidaactual=vidaTerran.element();
		//int vidaactual=Pelea.getVidaactual()
        try { 
            while ((0-dano_proto < vida_terra) && -dano_terra<= vida_proto ) { 

            	System.out.print(vida_terra);
            	//raceTrackTerra.setValue(vida_terra); 
            	raceTrackProto.setValue(vida_proto); 
                
                sleep(r); 
                
                sleepTime.setText(String.valueOf(Integer.parseInt(sleepTime.getText())+r));
                
                //vida_terra=vida_terra-dano_proto;
                vida_proto=vida_proto-dano_terra;
                
            } 
        } 
        catch (Exception e) { 
        } 
        
        long finish = System.nanoTime();
        
        runTime.setText(String.valueOf(finish-start));
    } 
	
	static Queue<String> nombresTerran = new LinkedList<String>(Arrays.asList(getSoldado().getNombre(),getMurcielago().getNombre(),getGoliat().getNombre(),getCruzero().getNombre()));
	static Queue<Integer> danoTerran = new LinkedList<Integer>(Arrays.asList(getSoldado().getdanho(),getMurcielago().getdanho(),getGoliat().getdanho(),getCruzero().getdanho()));
	static Queue<Integer> vidaTerran = new LinkedList<Integer>(Arrays.asList(getSoldado().getvidha(),getMurcielago().getvidha(),getGoliat().getvidha(),getCruzero().getvidha()));
	static Queue<Integer> velocidadTerran = new LinkedList<Integer>(Arrays.asList(getSoldado().getvelocidad(),getMurcielago().getvelocidad(),getGoliat().getvelocidad(),getCruzero().getvelocidad()));
	static Queue<JProgressBar> berraTerran = new LinkedList<JProgressBar>(Arrays.asList(getSoldado().barra(),getMurcielago().barra(),getGoliat().barra(),getCruzero().barra()));
/*
	static Queue<String> nombresProtoss = new LinkedList<String>(Arrays.asList(getFanatico().getNombre(),getFanatico().getNombre(),getAcechador().getNombre(),getTransporte().getNombre()));
	static Queue<Integer> danoProtoss = new LinkedList<Integer>(Arrays.asList(getFanatico().getdanho(),getFanatico().getdanho(),getAcechador().getdanho(),getTransporte().getdanho()));
	static Queue<Integer> vidaProtoss = new LinkedList<Integer>(Arrays.asList(getFanatico().getvidha(),getFanatico().getvidha(),getAcechador().getvidha(),getTransporte().getvidha()));
	static Queue<Integer> velocidadProtoss = new LinkedList<Integer>(Arrays.asList(getFanatico().getvelocidad(),getFanatico().getvelocidad(),getAcechador().getvelocidad(),getTransporte().getvelocidad()));
	static Queue<JProgressBar> berraProtoss = new LinkedList<JProgressBar>(Arrays.asList(getFanatico().barra(),getFanatico().barra(),getAcechador().barra(),getTransporte().barra()));
	*/
	
}
