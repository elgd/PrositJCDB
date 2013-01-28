package IHM;

import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JTable;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class IHM {

	private JFrame frame;
	private JTable Ecran;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IHM window = new IHM();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public IHM() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 61, 147, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 66, 0, 66, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JLabel lblAffichage = new JLabel("AFFICHAGE!!");
		GridBagConstraints gbc_lblAffichage = new GridBagConstraints();
		gbc_lblAffichage.insets = new Insets(0, 0, 5, 5);
		gbc_lblAffichage.gridx = 2;
		gbc_lblAffichage.gridy = 1;
		frame.getContentPane().add(lblAffichage, gbc_lblAffichage);
		
		Ecran = new JTable();
		GridBagConstraints gbc_Ecran = new GridBagConstraints();
		gbc_Ecran.insets = new Insets(0, 0, 5, 5);
		gbc_Ecran.gridwidth = 2;
		gbc_Ecran.gridheight = 3;
		gbc_Ecran.fill = GridBagConstraints.BOTH;
		gbc_Ecran.gridx = 2;
		gbc_Ecran.gridy = 2;
		frame.getContentPane().add(Ecran, gbc_Ecran);
		
		JButton btnNewButton = new JButton("Affiche!!");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
Component comp = null;
int index0 =0;
int index1 = 1;
Ecran.addRowSelectionInterval(index0, index1);
Ecran.setRowHeight(200);
			}
		});
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 1;
		gbc_btnNewButton.gridy = 3;
		frame.getContentPane().add(btnNewButton, gbc_btnNewButton);
	}

}
