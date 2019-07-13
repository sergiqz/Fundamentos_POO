package starcraft;

import java.awt.event.*;
import java.util.LinkedList;
import java.util.Queue;
import java.awt.*; 
import javax.swing.*; 

public class Main extends JFrame{

	static JFrame frame; 
	static JLabel label;
	static JButton start;
	static JButton run;
	static JTextField field;
	
	private static Queue<Pelea> queuepele;
	private static Queue<Pelea2> queuepele2;
	
	public static void main(String[] args) {
		
		frame = new JFrame("STARCRAFT");
		
		label = new JLabel("Ingrese el Número de unidades");
		start = new JButton("Start");
		field = new JTextField(15);
		run = new JButton("PELEAR");
		
		final JPanel tempPanel = new JPanel();
		tempPanel.add(label);
		tempPanel.add(field);
		tempPanel.add(start);
		


		queuepele = new LinkedList<Pelea>();
		queuepele2 = new LinkedList<Pelea2>();
		
		start.addActionListener(new ActionListener() {
	        

			public void actionPerformed(ActionEvent arg0) {
				
				int max= Integer.parseInt(field.getText());
				
				JPanel horsePanel = new JPanel();
				horsePanel.setLayout(new GridLayout(0,6));
				
				frame.remove(tempPanel);				
				
				JLabel l1 = new JLabel("Terran");
				JLabel l2 = new JLabel("Vida");
				JLabel l3 = new JLabel("Tiempo Ejecución");
				JLabel l4 = new JLabel("Tiempo Descanso");
				JLabel l5 = new JLabel("Protoss");
				JLabel l6 = new JLabel("Vida");
				
				Font font = new Font("Arial Black", Font.BOLD,12);
						
				l1.setFont(font);
				l2.setFont(font);
				l3.setFont(font);
				l4.setFont(font);
				l5.setFont(font);
				l6.setFont(font);
				
				l1.setHorizontalAlignment(JLabel.CENTER);
				l2.setHorizontalAlignment(JLabel.CENTER);
				l3.setHorizontalAlignment(JLabel.CENTER);
				l4.setHorizontalAlignment(JLabel.CENTER);
				l5.setHorizontalAlignment(JLabel.CENTER);
				l6.setHorizontalAlignment(JLabel.CENTER);
				
				horsePanel.add(l1);
				horsePanel.add(l2);
				horsePanel.add(l3);
				horsePanel.add(l4);
				horsePanel.add(l5);
				horsePanel.add(l6);
				
				for(int m=0;m < max;m++){
					

					JProgressBar progressBarterra = Terran.getberraTerran();
					progressBarterra.setMaximum(Terran.getvida_noelimi_Terra());

					JProgressBar progressBarProtoss = Protoss.getberraProtoss();
					progressBarProtoss.setMaximum(Protoss.getvida_noelimi_Protoss());
					
					
					
					JLabel RunTimeterra = new JLabel("0");
					JLabel RunTimepro = new JLabel("0");
					JLabel SleepTime = new JLabel("0");
					RunTimeterra.setHorizontalAlignment(JLabel.CENTER);
					RunTimepro.setHorizontalAlignment(JLabel.CENTER);
					SleepTime.setHorizontalAlignment(JLabel.CENTER);
					
					Protoss proto = new Protoss();
					Terran terrat = new Terran();
					Integer vidaactualterran=terrat.getvidaTerra();
					Integer vidaactualproto=proto.getvidaProtoss();
					
					Pelea pele = new Pelea(terrat.get_noelimi_NombreTerra(),proto.get_noelimi_NombreProtoss(),progressBarterra,RunTimepro,SleepTime,vidaactualterran,terrat.getdano_noelimi_Terra(),vidaactualproto,proto.getdano_noelimi_Protoss(),terrat.getVelocidadTerra());
					Pelea2 pelea2= new Pelea2(terrat.get_noelimi_NombreTerra(),proto.get_noelimi_NombreProtoss(),RunTimepro,SleepTime,progressBarProtoss,vidaactualterran,terrat.getdanoTerra(),vidaactualproto,proto.getdano_noelimi_Protoss(),proto.getVelocidadProtoss());
					
					JLabel nombreTerran = new JLabel(terrat.getNombreTerra());
					JLabel nombreProto = new JLabel(proto.getNombreProtoss());

					queuepele.add(pele);
					queuepele2.add(pelea2);
					
					horsePanel.add(nombreTerran);
					horsePanel.add(progressBarterra);
					horsePanel.add(RunTimepro);
					horsePanel.add(SleepTime);
					horsePanel.add(nombreProto);
					horsePanel.add(progressBarProtoss);
					
					frame.add(horsePanel);
					
				}
				frame.setSize(900,100+max*20);
				frame.revalidate();

				horsePanel.add(run);
				frame.add(horsePanel);
				
				frame.revalidate();
				
			}          
	      });
		
		run.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent arg0) {
				

				while( !queuepele.isEmpty() ) {
		            if( !queuepele.element().isAlive() ) {
		            	queuepele.element().start();
		            	queuepele.remove();
		            }
				}
				
				while( !queuepele2.isEmpty() ) {
		            if( !queuepele2.element().isAlive() ) {
		            	queuepele2.element().start();
		            	queuepele2.remove();
		            }
				}

				
			}
		});
		
		frame.add(tempPanel);
		
		frame.setSize(500, 80);
		frame.setVisible(true);
		
	}
		
	}