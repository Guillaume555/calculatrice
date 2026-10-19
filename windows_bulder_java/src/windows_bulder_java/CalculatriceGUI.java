package windows_bulder_java;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class CalculatriceGUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField ecran;
	private JButton btnC;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton btnDiv;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btnMul;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btnMoins;
	private JButton btn0;
	private JButton btnPoint;
	private JButton btnEgal;
	private JButton btnPlus;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatriceGUI frame = new CalculatriceGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public CalculatriceGUI() {
		setTitle("Calculatrice");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 330, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		ecran = new JTextField();
		ecran.setText("0");
		ecran.setEditable(false);
		ecran.setHorizontalAlignment(SwingConstants.RIGHT);
		ecran.setFont(new Font("Arial", Font.BOLD, 28));
		ecran.setBounds(10, 10, 290, 50);
		contentPane.add(ecran);

		btnC = new JButton("C");
		btnC.setBounds(10, 70, 290, 40);
		contentPane.add(btnC);

		btn7 = new JButton("7");
		btn7.setBounds(10, 120, 65, 60);
		contentPane.add(btn7);

		btn8 = new JButton("8");
		btn8.setBounds(85, 120, 65, 60);
		contentPane.add(btn8);

		btn9 = new JButton("9");
		btn9.setBounds(160, 120, 65, 60);
		contentPane.add(btn9);

		btnDiv = new JButton("/");
		btnDiv.setBounds(235, 120, 65, 60);
		contentPane.add(btnDiv);

		btn4 = new JButton("4");
		btn4.setBounds(10, 190, 65, 60);
		contentPane.add(btn4);

		btn5 = new JButton("5");
		btn5.setBounds(85, 190, 65, 60);
		contentPane.add(btn5);

		btn6 = new JButton("6");
		btn6.setBounds(160, 190, 65, 60);
		contentPane.add(btn6);

		btnMul = new JButton("*");
		btnMul.setBounds(235, 190, 65, 60);
		contentPane.add(btnMul);

		btn1 = new JButton("1");
		btn1.setBounds(10, 260, 65, 60);
		contentPane.add(btn1);

		btn2 = new JButton("2");
		btn2.setBounds(85, 260, 65, 60);
		contentPane.add(btn2);

		btn3 = new JButton("3");
		btn3.setBounds(160, 260, 65, 60);
		contentPane.add(btn3);

		btnMoins = new JButton("-");
		btnMoins.setBounds(235, 260, 65, 60);
		contentPane.add(btnMoins);

		btn0 = new JButton("0");
		btn0.setBounds(10, 330, 65, 60);
		contentPane.add(btn0);

		btnPoint = new JButton(".");
		btnPoint.setBounds(85, 330, 65, 60);
		contentPane.add(btnPoint);

		btnEgal = new JButton("=");
		btnEgal.setBounds(160, 330, 65, 60);
		contentPane.add(btnEgal);

		btnPlus = new JButton("+");
		btnPlus.setBounds(235, 330, 65, 60);
		contentPane.add(btnPlus);
	}
}