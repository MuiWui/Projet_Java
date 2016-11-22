import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class AffichageResultat {

	private JFrame frmAffichageResultat;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AffichageResultat window = new AffichageResultat();
					window.frmAffichageResultat.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AffichageResultat() {
		initialize();

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAffichageResultat = new JFrame();
		frmAffichageResultat.setBounds(100, 100, 450, 300);
		frmAffichageResultat.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAffichageResultat.getContentPane().setLayout(null);

		JLabel lblResultat = new JLabel("Voici les r\u00E9sultats trouv\u00E9 :");
		lblResultat.setBounds(10, 95, 156, 38);
		frmAffichageResultat.getContentPane().add(lblResultat);

		JTextArea textArea = new JTextArea();
		textArea.setBounds(195, 52, 143, 134);
		frmAffichageResultat.getContentPane().add(textArea);

		JButton btnBack = new JButton("Retour");
		btnBack.setBounds(221, 227, 89, 23);
		frmAffichageResultat.getContentPane().add(btnBack);
	}
}
