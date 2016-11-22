package applicationjava;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

public class CarreNombre extends JFrame {

	private JPanel contentPane;
	JButton bouton1 = new JButton("nombres premiers");
	JButton bouton2= new JButton("carrés premiers");
	JButton bouton3= new JButton("Réinitialisation");
	JPanel pan = new JPanel();
	JPanel pan2 =new JPanel();
	JTextArea text = new JTextArea(1,2);
	JTextArea result = new JTextArea("Résultat",40,40);
	JScrollPane scroll = new  JScrollPane(result);
	JLabel label = new JLabel("saisir un nombre");
	Color c = new Color(255,255,0);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CarreNombre frame = new CarreNombre();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CarreNombre() {
		setTitle("Application nombres et carrés premiers");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(550, 550, 550, 550);
		setExtendedState(MAXIMIZED_BOTH);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		/*contentPane.setLayout(new BorderLayout(0, 0));*/
		setLayout(new BorderLayout());
		contentPane.add(pan);
		contentPane.add(pan2);
		pan.add(label);
		pan.add(text);
		pan.add(bouton1);
		pan.add(bouton2);
		pan.add(bouton3);
		getContentPane().add(pan, BorderLayout.SOUTH);
		bouton1.addActionListener(new Bouton1Listener());
		bouton2.addActionListener(new Bouton2Listener());
		bouton3.addActionListener(new Bouton3Listener());
		pan2.add(scroll);
		getContentPane().add(pan2, BorderLayout.NORTH); 
		
	}

		class Bouton1Listener implements ActionListener{
			public void actionPerformed(ActionEvent e){
				String nb = text.getText();
				
			        int compteur = 0;
			        for (int i = 2; compteur < Integer.parseInt(nb); i++)
			            {
			            if ( i % 2 == 0 && i / 2 > 1)
			                continue;
			            else if ( i % 3 == 0 && i / 3 > 1)
			                continue;
			            else if ( i % 5 == 0 && i / 5 > 1)
			                continue;
			            else if ( i % 7 == 0 && i / 7 > 1)
			                continue;
			                compteur = compteur + 1 ;
			                result.setText(result.getText() + "\n" + String.valueOf(i) + "\n");
			                
			           }
			        result.setText(result.getText() + "\n" +"-----------------------------------" );
			       
			  }
		}
	
		class Bouton2Listener implements ActionListener{
			public void actionPerformed(ActionEvent e){
				String nb = text.getText();
				int compteur = 1;
		        
		        for (int i = 1; compteur < Integer.parseInt(nb)+1; i++){
		        
		        	result.setText(result.getText() + "\n" + String.valueOf(i*i) + "\n");
		        	compteur++;
		        	
		        }
		        result.setText(result.getText() + "\n" +"-----------------------------------" );
			}
		}
		
		class Bouton3Listener implements ActionListener{
			public void actionPerformed(ActionEvent e){
				
				result.setText("");
			
			}
		}
}