package methodo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;

public class ChoixUtilisateur {

	private JFrame frmChoixUtilisateur;
	private JTextField textFSaisie;
	private final Action action = new SwingAction();
	private final Action action_1 = new SwingAction_1();

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChoixUtilisateur window = new ChoixUtilisateur();
					window.frmChoixUtilisateur.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ChoixUtilisateur() {
		initialize();
	}
	
	private void initialize() {
		frmChoixUtilisateur = new JFrame();
		frmChoixUtilisateur.setTitle("Nombres Premiers et Carr\u00E9s Parfaits");
		frmChoixUtilisateur.setBounds(100, 100, 450, 300);
		frmChoixUtilisateur.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmChoixUtilisateur.getContentPane().setLayout(null);
		
		JButton btnPremier = new JButton("Nombres Premiers");
		btnPremier.setAction(action);
		btnPremier.setBounds(28, 107, 160, 31);
		frmChoixUtilisateur.getContentPane().add(btnPremier);
		
		JButton btnSquare = new JButton("Carr\u00E9s Parfaits");
		btnSquare.setAction(action_1);
		btnSquare.setBounds(256, 107, 153, 31);
		frmChoixUtilisateur.getContentPane().add(btnSquare);
		
		JLabel lblExplication = new JLabel("Entrez le nombre de chiffres que vous souhaitez :");
		lblExplication.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblExplication.setBounds(35, 31, 250, 31);
		frmChoixUtilisateur.getContentPane().add(lblExplication);
		
		textFSaisie = new JTextField();
		textFSaisie.setBounds(292, 36, 86, 20);
		frmChoixUtilisateur.getContentPane().add(textFSaisie);
		textFSaisie.setColumns(10);
		}
	
	
	
	
	
	private class SwingAction extends AbstractAction {
		
		private static final long serialVersionUID = 1L;
		public SwingAction() {
			putValue(NAME, "Nombres Premiers");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			System.out.println("bonjour");
			final JFrame frmChoixUtilisateur = new JFrame("Test");
			frmChoixUtilisateur.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frmChoixUtilisateur.setSize(300, 300);
			frmChoixUtilisateur.setVisible(true);
			
		}
	}
	
	
	private class SwingAction_1 extends AbstractAction {
		
		private static final long serialVersionUID = 1L;
		public SwingAction_1() {
			putValue(NAME, "Carrés Parfaits");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			System.out.println("coucou");
		}
	}
}
