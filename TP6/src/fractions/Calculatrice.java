package fractions;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;
import javax.swing.text.BadLocationException;
import javax.swing.JList;
import javax.swing.JTable;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Calculatrice {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	// ------------------ Declare variables as global
	double firstNumber;
	double secondNumber;
	double result;
	String operations;
	String answer;
	private JTextField textField_;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculatrice window = new Calculatrice();
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
	public Calculatrice() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 269, 423);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Calculatrice");
		frame.getContentPane().setLayout(null);

		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(10, 11, 237, 75);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		// ------------------Row 0---------------------

		JButton btnbackSpace = new JButton("<-");
		btnbackSpace.setBackground(Color.CYAN);
		btnbackSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace = null;
				if (textField.getText().length() > 0) {
					StringBuilder strB = new StringBuilder(textField.getText());
					strB.deleteCharAt(textField.getText().length() - 1);
					backSpace = strB.toString();
					textField.setText(backSpace);
				}

			}
		});
		
		textField_1= new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_1.setBounds(10, 50, 237, 36);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		btnbackSpace.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnbackSpace.setBounds(12, 97, 55, 55);
		frame.getContentPane().add(btnbackSpace);

		JButton btnC = new JButton("C");
		btnC.setBackground(Color.CYAN);
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnC.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnC.setBounds(70, 97, 55, 55);
		frame.getContentPane().add(btnC);

		JButton btnPourcentage = new JButton("%");
		btnPourcentage.setBackground(Color.PINK);
		btnPourcentage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "%";
			}
		});
		btnPourcentage.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnPourcentage.setBounds(132, 97, 55, 55);
		frame.getContentPane().add(btnPourcentage);

		JButton btnDiv = new JButton("/");
		btnDiv.setBackground(Color.PINK);
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "/";
			}
		});
		btnDiv.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnDiv.setBounds(192, 97, 55, 55);
		frame.getContentPane().add(btnDiv);

		// --------------------Row 1-----------------------

		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "7");
			}
		});
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn7.setBounds(12, 153, 55, 55);
		frame.getContentPane().add(btn7);

		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "8");
			}
		});
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn8.setBounds(70, 153, 55, 55);
		frame.getContentPane().add(btn8);

		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "9");
			}
		});
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn9.setBounds(132, 153, 55, 55);
		frame.getContentPane().add(btn9);

		JButton btnp = new JButton("+");
		btnp.setBackground(Color.PINK);
		btnp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "+";
			}
		});
		btnp.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnp.setBounds(192, 153, 55, 55);
		frame.getContentPane().add(btnp);

		// --------------------Row 2------------------------

		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				textField.setText(textField.getText() + "4");
			}
		});
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn4.setBounds(12, 210, 55, 55);
		frame.getContentPane().add(btn4);

		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "5");
			}
		});
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn5.setBounds(70, 210, 55, 55);
		frame.getContentPane().add(btn5);

		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "6");
			}
		});
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn6.setBounds(132, 210, 55, 55);
		frame.getContentPane().add(btn6);

		JButton btnSub = new JButton("-");
		btnSub.setBackground(Color.PINK);
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "-";
			}
		});
		btnSub.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSub.setBounds(192, 211, 55, 55);
		frame.getContentPane().add(btnSub);

		// --------------------Row 3------------------------

		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "1");
			}
		});
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn1.setBounds(12, 265, 55, 55);
		frame.getContentPane().add(btn1);

		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "2");
			}
		});
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn2.setBounds(70, 265, 55, 55);
		frame.getContentPane().add(btn2);

		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "3");
			}
		});
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn3.setBounds(132, 265, 55, 55);
		frame.getContentPane().add(btn3);

		JButton btnMul = new JButton("*");
		btnMul.setBackground(Color.PINK);
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "*";
			}
		});
		btnMul.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnMul.setBounds(192, 265, 55, 55);
		frame.getContentPane().add(btnMul);

		// --------------------Row 4---------------------------

		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "0");
			}
		});
		btn0.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn0.setBounds(12, 319, 55, 55);
		frame.getContentPane().add(btn0);

		JButton btnDot = new JButton(".");
		btnDot.setBackground(Color.PINK);
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + ".");
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnDot.setBounds(67, 319, 55, 55);
		frame.getContentPane().add(btnDot);

		JButton btnPM = new JButton("+/-");
		btnPM.setBackground(Color.PINK);
		btnPM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().charAt(0) == '-') {
					try {
						textField.setText(textField.getText(1, textField.getText().length() - 1));
					} catch (BadLocationException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				} else
					textField.setText("-" + textField.getText());
			}
		});
		btnPM.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnPM.setBounds(120, 319, 77, 55);
		frame.getContentPane().add(btnPM);

		JButton btnEqual = new JButton("=");
		btnEqual.setBackground(Color.PINK);
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer; 
				secondNumber = Double.parseDouble(textField.getText()); 
				if (operations == "+") {
					result = firstNumber + secondNumber; 
					answer = String.format("%.2f", result); 
					textField.setText(answer);
				}
				
				if (operations == "-") {
					result = firstNumber - secondNumber; 
					answer = String.format("%.2f", result);
					textField.setText(answer);

				}
				
				if (operations == "*") {
					result = firstNumber * secondNumber; 
					answer = String.format("%.2f", result);
					textField.setText(answer);

				}
				
				if (operations == "/") {
					result = firstNumber / secondNumber; 
					answer = String.format("%.2f", result);
					textField.setText(answer);

				}
				
				if (operations == "%") {
					result = firstNumber % secondNumber; 
					answer = String.format("%.2f", result);
					textField.setText(answer);

				}
				
			}
		});
		btnEqual.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnEqual.setBounds(192, 319, 55, 55);
		frame.getContentPane().add(btnEqual);

	}
}
