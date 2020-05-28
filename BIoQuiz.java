package a;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
/**
 * 
 * @author Taeho Kim
 *
 */
public class BioQuiz {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BioQuiz window = new BioQuiz();
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
	public BioQuiz() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 600);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel last = new JPanel();
		last.setBounds(0, 0, 794, 565);
		frame.getContentPane().add(last);
		last.setLayout(null);
		
		JLabel lblNewLabel_7 = new JLabel("Good Job! ");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setFont(new Font("HancomEQN", Font.PLAIN, 60));
		lblNewLabel_7.setBounds(126, 85, 515, 173);
		last.add(lblNewLabel_7);
		last.setVisible(false);
		
		JPanel start = new JPanel();
		start.setBounds(0, 0, 794, 565);
		frame.getContentPane().add(start);
		start.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BIO QUIZ");
		lblNewLabel.setFont(new Font("Gulim", Font.PLAIN, 60));
		lblNewLabel.setBounds(234, 84, 274, 124);
		start.add(lblNewLabel);
		
		JButton btnStart = new JButton("Start");
		
		btnStart.setFont(new Font("Gulim", Font.PLAIN, 30));
		btnStart.setBounds(287, 315, 143, 36);
		start.add(btnStart);
		
		JPanel q1 = new JPanel();
		q1.setBounds(0, 0, 794, 565);
		frame.getContentPane().add(q1);
		q1.setLayout(null);
		q1.setVisible(false);
		
		JLabel lblEukaryoticCellsHave = new JLabel("Eukaryotic cells have nucleus");
		lblEukaryoticCellsHave.setFont(new Font("Gulim", Font.PLAIN, 45));
		lblEukaryoticCellsHave.setBounds(65, 82, 637, 137);
		q1.add(lblEukaryoticCellsHave);
		
		JButton q2Answer = new JButton("True");
		q2Answer.setFont(new Font("Gulim", Font.PLAIN, 30));
		q2Answer.setBounds(307, 314, 143, 43);
		q1.add(q2Answer);
		
		JButton btnFalse = new JButton("False");
		btnFalse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Nope! try again");
			}
		});
		btnFalse.setFont(new Font("Gulim", Font.PLAIN, 30));
		btnFalse.setBounds(307, 407, 143, 43);
		q1.add(btnFalse);
		
		JPanel q2 = new JPanel();
		q2.setBounds(0, 0, 794, 565);
		frame.getContentPane().add(q2);
		q2.setLayout(null);
		q2.setVisible(false);
		
		JLabel lblNewLabel_1 = new JLabel("Which following is Not of");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Gulim", Font.PLAIN, 35));
		lblNewLabel_1.setBounds(80, 71, 583, 77);
		q2.add(lblNewLabel_1);
		
		JLabel lblNucleicAcidOf = new JLabel("nucleic acid of DNA?");
		lblNucleicAcidOf.setHorizontalAlignment(SwingConstants.CENTER);
		lblNucleicAcidOf.setFont(new Font("Gulim", Font.PLAIN, 35));
		lblNucleicAcidOf.setBounds(80, 153, 583, 77);
		q2.add(lblNucleicAcidOf);
		
		JButton btnNewButton = new JButton("Adenin");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Nope! Try again");
			}
		});
		btnNewButton.setFont(new Font("Gulim", Font.PLAIN, 25));
		btnNewButton.setBounds(169, 317, 147, 46);
		q2.add(btnNewButton);
		
		JButton btnGuanine = new JButton("Guanine");
		btnGuanine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Nope! Try again");
			}
		});
		btnGuanine.setFont(new Font("Gulim", Font.PLAIN, 25));
		btnGuanine.setBounds(427, 317, 147, 46);
		q2.add(btnGuanine);
		
		JButton btnThymine = new JButton("Thymine");
		btnThymine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Nope! Try again");
			}
		});
		btnThymine.setFont(new Font("Gulim", Font.PLAIN, 25));
		btnThymine.setBounds(47, 438, 147, 46);
		q2.add(btnThymine);
		
		JButton btnCytosine = new JButton("Cytosine");
		btnCytosine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Nope! Try again");
			}
		});
		btnCytosine.setFont(new Font("Gulim", Font.PLAIN, 25));
		btnCytosine.setBounds(303, 438, 147, 46);
		q2.add(btnCytosine);
		
		JButton btnUracil = new JButton("Uracil");
		btnUracil.setFont(new Font("Gulim", Font.PLAIN, 25));
		btnUracil.setBounds(550, 438, 147, 46);
		q2.add(btnUracil);
		
		JPanel q3 = new JPanel();
		q3.setBounds(0, 0, 794, 565);
		frame.getContentPane().add(q3);
		q3.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Which following is NOT");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Gulim", Font.PLAIN, 35));
		lblNewLabel_2.setBounds(144, 91, 496, 69);
		q3.add(lblNewLabel_2);
		
		JLabel lblChracteristicOfLife = new JLabel("chracteristic of life?");
		lblChracteristicOfLife.setHorizontalAlignment(SwingConstants.CENTER);
		lblChracteristicOfLife.setFont(new Font("Gulim", Font.PLAIN, 35));
		lblChracteristicOfLife.setBounds(144, 158, 496, 69);
		q3.add(lblChracteristicOfLife);
		
		JButton btnNewBrutton = new JButton("Reproduction");
		btnNewBrutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Nope! Try again");
			}
		});
		btnNewBrutton.setFont(new Font("Gulim", Font.PLAIN, 25));
		btnNewBrutton.setBounds(89, 295, 262, 56);
		q3.add(btnNewBrutton);
		
		JButton btnAbilityToMove = new JButton("Ability to move");
		btnAbilityToMove.setFont(new Font("Gulim", Font.PLAIN, 25));
		btnAbilityToMove.setBounds(415, 295, 262, 56);
		q3.add(btnAbilityToMove);
		
		JButton btnUseEnergy = new JButton("Use energy");
		btnUseEnergy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Nope! Try again");
			}
		});
		btnUseEnergy.setFont(new Font("Gulim", Font.PLAIN, 25));
		btnUseEnergy.setBounds(89, 415, 262, 56);
		q3.add(btnUseEnergy);
		
		JButton btnResponseToStimuli = new JButton("Response to stimuli");
		btnResponseToStimuli.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Nope! Try again");
			}
		});
		btnResponseToStimuli.setFont(new Font("Gulim", Font.PLAIN, 25));
		btnResponseToStimuli.setBounds(415, 415, 262, 56);
		q3.add(btnResponseToStimuli);
		
		JPanel q4 = new JPanel();
		q4.setBounds(0, 0, 794, 565);
		frame.getContentPane().add(q4);
		q4.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("How can we express ");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Gulim", Font.PLAIN, 30));
		lblNewLabel_3.setBounds(153, 85, 423, 50);
		q4.add(lblNewLabel_3);
		
		JLabel lblHomozygousReccesive = new JLabel("Homozygous recessive?");
		lblHomozygousReccesive.setHorizontalAlignment(SwingConstants.CENTER);
		lblHomozygousReccesive.setFont(new Font("Gulim", Font.PLAIN, 30));
		lblHomozygousReccesive.setBounds(153, 137, 423, 50);
		q4.add(lblHomozygousReccesive);
		
		JButton btnNewButton_1 = new JButton("AA");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Nope! Try again");
			}
		});
		btnNewButton_1.setFont(new Font("Gulim", Font.PLAIN, 25));
		btnNewButton_1.setBounds(160, 309, 105, 27);
		q4.add(btnNewButton_1);
		
		JButton btnAa_1 = new JButton("Aa");
		btnAa_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Nope! Try again");
			}
		});
		btnAa_1.setFont(new Font("Gulim", Font.PLAIN, 25));
		btnAa_1.setBounds(403, 309, 105, 27);
		q4.add(btnAa_1);
		
		JButton btnAa = new JButton("aa");
		btnAa.setFont(new Font("Gulim", Font.PLAIN, 25));
		btnAa.setBounds(160, 440, 105, 27);
		q4.add(btnAa);
		
		JButton btnAa_2 = new JButton("aA");
		btnAa_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Nope! Try again");
			}
		});
		btnAa_2.setFont(new Font("Gulim", Font.PLAIN, 25));
		btnAa_2.setBounds(403, 440, 105, 27);
		q4.add(btnAa_2);
		
		JPanel q5 = new JPanel();
		q5.setBounds(0, 0, 794, 565);
		frame.getContentPane().add(q5);
		q5.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Which following is a mechanism driving evolution?");
		lblNewLabel_4.setFont(new Font("Gulim", Font.PLAIN, 28));
		lblNewLabel_4.setBounds(54, 72, 684, 56);
		q5.add(lblNewLabel_4);
		
		JButton btnNewButton_2 = new JButton("Mutation");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Nope! Try again");
			}
		});
		btnNewButton_2.setFont(new Font("Gulim", Font.PLAIN, 25));
		btnNewButton_2.setBounds(101, 276, 217, 56);
		q5.add(btnNewButton_2);
		
		JButton btnNaturalSelection = new JButton("Natural selection");
		btnNaturalSelection.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Nope! Try again");
			}
		});
		btnNaturalSelection.setFont(new Font("Gulim", Font.PLAIN, 25));
		btnNaturalSelection.setBounds(429, 276, 228, 56);
		q5.add(btnNaturalSelection);
		
		JButton btnGeneticDrift = new JButton("Genetic drift");
		btnGeneticDrift.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Nope! Try again");
			}
		});
		btnGeneticDrift.setFont(new Font("Gulim", Font.PLAIN, 25));
		btnGeneticDrift.setBounds(101, 365, 217, 56);
		q5.add(btnGeneticDrift);
		
		JButton btnMigration = new JButton("Migration");
		btnMigration.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Nope! Try again");
			}
		});
		btnMigration.setFont(new Font("Gulim", Font.PLAIN, 25));
		btnMigration.setBounds(429, 365, 228, 56);
		q5.add(btnMigration);
		
		JButton btnAboveAll = new JButton("Above all");
		btnAboveAll.setFont(new Font("Gulim", Font.PLAIN, 25));
		btnAboveAll.setBounds(265, 454, 217, 56);
		q5.add(btnAboveAll);
		
		JPanel q6 = new JPanel();
		q6.setBounds(0, 0, 794, 565);
		frame.getContentPane().add(q6);
		q6.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("Which following is example of Non-disjunction disease?");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("Gulim", Font.PLAIN, 27));
		lblNewLabel_5.setBounds(26, 66, 724, 58);
		q6.add(lblNewLabel_5);
		
		JButton btnNewButton_3 = new JButton("Sickle cell anemia");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Nope! Try again");
			}
		});
		btnNewButton_3.setFont(new Font("Gulim", Font.PLAIN, 25));
		btnNewButton_3.setBounds(65, 268, 274, 70);
		q6.add(btnNewButton_3);
		
		JButton btnDownsSyndrome = new JButton("Down's syndrome");
		btnDownsSyndrome.setFont(new Font("Gulim", Font.PLAIN, 25));
		btnDownsSyndrome.setBounds(429, 268, 274, 70);
		q6.add(btnDownsSyndrome);
		
		JButton btnHemohillia = new JButton("Hemohillia");
		btnHemohillia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Nope! Try again");
			}
		});
		btnHemohillia.setFont(new Font("Gulim", Font.PLAIN, 25));
		btnHemohillia.setBounds(65, 398, 274, 70);
		q6.add(btnHemohillia);
		
		JButton btnHuntingtunsDiease = new JButton("Huntington's disease");
		btnHuntingtunsDiease.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Nope! Try again");
			}
		});
		btnHuntingtunsDiease.setFont(new Font("Gulim", Font.PLAIN, 25));
		btnHuntingtunsDiease.setBounds(429, 398, 274, 70);
		q6.add(btnHuntingtunsDiease);
		
		JPanel q7 = new JPanel();
		q7.setBounds(0, 0, 794, 565);
		frame.getContentPane().add(q7);
		q7.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("Which following is NOT a requirement of");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setFont(new Font("Gulim", Font.PLAIN, 28));
		lblNewLabel_6.setBounds(61, 62, 668, 36);
		q7.add(lblNewLabel_6);
		
		JLabel lblEvolutionByNatural = new JLabel("evolution by natural selection?");
		lblEvolutionByNatural.setHorizontalAlignment(SwingConstants.CENTER);
		lblEvolutionByNatural.setFont(new Font("Gulim", Font.PLAIN, 28));
		lblEvolutionByNatural.setBounds(61, 110, 668, 36);
		q7.add(lblEvolutionByNatural);
		
		JButton btnNewButton_4 = new JButton("Variation");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Nope! Try again");
			}
		});
		btnNewButton_4.setFont(new Font("Gulim", Font.PLAIN, 25));
		btnNewButton_4.setBounds(113, 292, 193, 57);
		q7.add(btnNewButton_4);
		
		JButton btnHeritability = new JButton("Heritability");
		btnHeritability.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Nope! Try again");
			}
		});
		btnHeritability.setFont(new Font("Gulim", Font.PLAIN, 25));
		btnHeritability.setBounds(450, 292, 193, 57);
		q7.add(btnHeritability);
		
		JButton btnSelection = new JButton("Selection");
		btnSelection.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Nope! Try again");
			}
		});
		btnSelection.setFont(new Font("Gulim", Font.PLAIN, 25));
		btnSelection.setBounds(113, 416, 193, 57);
		q7.add(btnSelection);
		
		JButton btnCreativity = new JButton("Creativity");
		btnCreativity.setFont(new Font("Gulim", Font.PLAIN, 25));
		btnCreativity.setBounds(450, 416, 193, 57);
		q7.add(btnCreativity);
		q7.setVisible(false);
		btnCreativity.addActionListener(new ActionListener() { //q7 answer btn
			public void actionPerformed(ActionEvent e) {
				q7.setVisible(false);
				last.setVisible(true);
			}
		});
		q6.setVisible(false);
		btnDownsSyndrome.addActionListener(new ActionListener() { //q6 answer btn
			public void actionPerformed(ActionEvent e) {
				q6.setVisible(false);
				q7.setVisible(true);
			}
		});
		q5.setVisible(false);
		btnAboveAll.addActionListener(new ActionListener() { // q5 answer btn
			public void actionPerformed(ActionEvent e) {
				q5.setVisible(false);
				q6.setVisible(true);
			}
		});
		q4.setVisible(false);
		
		btnAa.addActionListener(new ActionListener() { //q4 answer btn
			public void actionPerformed(ActionEvent e) {
				q4.setVisible(false);
				q5.setVisible(true);
			}
		});
		q3.setVisible(false);
		
		btnAbilityToMove.addActionListener(new ActionListener() { // q3 answer btn
			public void actionPerformed(ActionEvent e) {
				q3.setVisible(false);
				q4.setVisible(true);
			}
		});
		btnUracil.addActionListener(new ActionListener() { // q2 answer btn
			public void actionPerformed(ActionEvent e) {
				q2.setVisible(false);
				q3.setVisible(true);
			}
		});
		
		q2Answer.addActionListener(new ActionListener() { //q1 answer btn
			public void actionPerformed(ActionEvent e) {
				q1.setVisible(false);
				q2.setVisible(true);
			}
		});
		
		btnStart.addActionListener(new ActionListener() { //start btn
			public void actionPerformed(ActionEvent e) {
				start.setVisible(false);
				q1.setVisible(true);
			}
		});
		
	}

}
