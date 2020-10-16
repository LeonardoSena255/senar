package tarea4;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JTextArea;

public class SerieFibonacci extends JFrame {

	private JPanel contentPane;
	private JTextField txtNum1;
	private JTextField txtNum2;
	private JTextField txtIteraciones;
	private JTextArea textArea;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SerieFibonacci frame = new SerieFibonacci();
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
	public SerieFibonacci() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 446, 296);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ingrese el primer numero:");
		lblNewLabel.setBounds(51, 13, 163, 16);
		contentPane.add(lblNewLabel);
		
		txtNum1 = new JTextField();
		txtNum1.setBounds(219, 10, 63, 22);
		contentPane.add(txtNum1);
		txtNum1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Ingrese el segundo numero:");
		lblNewLabel_1.setBounds(44, 42, 170, 16);
		contentPane.add(lblNewLabel_1);
		
		txtNum2 = new JTextField();
		txtNum2.setColumns(10);
		txtNum2.setBounds(219, 39, 63, 22);
		contentPane.add(txtNum2);
		
		txtIteraciones = new JTextField();
		txtIteraciones.setColumns(10);
		txtIteraciones.setBounds(219, 74, 63, 22);
		contentPane.add(txtIteraciones);
		
		JLabel lblNewLabel_2 = new JLabel("Ingrese la cantidad de iteraciones:");
		lblNewLabel_2.setBounds(12, 77, 209, 16);
		contentPane.add(lblNewLabel_2);
		
		JButton btnMostrar = new JButton("Mostrar");
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int suma = 0;
				int num1 = Integer.parseInt(txtNum1.getText());
				int num2 = Integer.parseInt(txtNum2.getText());
				int iter = Integer.parseInt(txtIteraciones.getText());
				textArea.setText("Serie:");
				for(int i = 1; i<= iter; i++ ) {
					textArea.setText(textArea.getText()+"\n"+suma);
					suma = num1 + num2;
		            num1 = num2;
		            num2 = suma;
				}
			}
		});
		btnMostrar.setBounds(322, 38, 97, 25);
		contentPane.add(btnMostrar);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(22, 106, 394, 130);
		contentPane.add(textArea);
	}
}
