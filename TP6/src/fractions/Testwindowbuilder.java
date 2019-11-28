package fractions;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.text.BadLocationException;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Testwindowbuilder extends Fraction {

	private JFrame frame;
	private JTextField txtEvaluerUneExpression;
	private JTextField txtFractionsgyptiennes;
	private JTextField textField1;
	private JTextField textField2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Testwindowbuilder window = new Testwindowbuilder();
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
	public Testwindowbuilder() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setTitle("TP 6 : Fractions");
		
		txtEvaluerUneExpression = new JTextField();
		txtEvaluerUneExpression.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtEvaluerUneExpression.setForeground(new Color(0, 0, 0));
		txtEvaluerUneExpression.setBackground(Color.LIGHT_GRAY);
		txtEvaluerUneExpression.setText("Evaluer une expression fraction");
		txtEvaluerUneExpression.setBounds(10, 11, 361, 38);
		frame.getContentPane().add(txtEvaluerUneExpression);
		txtEvaluerUneExpression.setColumns(10);
		
		txtFractionsgyptiennes = new JTextField();
		txtFractionsgyptiennes.setText("Fractions \u00E9gyptiennes");
		txtFractionsgyptiennes.setForeground(Color.BLACK);
		txtFractionsgyptiennes.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtFractionsgyptiennes.setColumns(10);
		txtFractionsgyptiennes.setBackground(Color.LIGHT_GRAY);
		txtFractionsgyptiennes.setBounds(10, 133, 361, 38);
		frame.getContentPane().add(txtFractionsgyptiennes);
		
		textField1 = new JTextField();
		textField1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
					Fraction f = new Fraction();
					String val=textField1.getText();
					//if (val.length()>3) {
					if (val.charAt(val.length()-1)== '=')
					System.out.println("" + val.substring(0,val.length()-1));
					
					f=calcul(val.substring(0,val.length()-1));
					
					System.out.println(f);
					//}
					
			}

			private Fraction calcul(String val) {
				char[] list= {'+','-','/','*'};
				while (val != "") {
					
				}
				System.out.println(val.substring(0,val.indexOf(list[0]))+ " val "+ val.charAt(val.indexOf(list[0])));
				return null;
			}
			
			////////
		});
		
		
		textField1.setBounds(10, 60, 361, 44);
	/*	textField1.addActionListener(new ActionListener() {
		      public void actionPerformed(ActionEvent e) {
		        System.out.println("Text=" + textField1.getText());
		      }
		    });*/
		frame.getContentPane().add(textField1);
		textField1.setColumns(10);
		
		textField2 = new JTextField();
		textField2.setColumns(10);
		textField2.setBounds(10, 196, 361, 44);
		frame.getContentPane().add(textField2);
	}
}
