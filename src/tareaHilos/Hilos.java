package tareaHilos;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import tareaHilos.ThreadAuxiliar;
import javafx.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.JProgressBar;
import javax.swing.JButton;


public class Hilos extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnCorrer;
	private JProgressBar prgBarraUno;
	private JProgressBar prgBarraDos;
	private ThreadAuxiliar barra1, barra2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hilos frame = new Hilos();
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
	public Hilos() {
		setTitle("Carrera");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 449, 253);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCaballoUno = new JLabel("Caballo 1:");
		lblCaballoUno.setFont(new Font("Arial", Font.PLAIN, 17));
		lblCaballoUno.setBounds(28, 41, 81, 20);
		contentPane.add(lblCaballoUno);
		
		JLabel lblCaballoDos = new JLabel("Caballo 2:");
		lblCaballoDos.setFont(new Font("Arial", Font.PLAIN, 17));
		lblCaballoDos.setBounds(28, 103, 81, 16);
		contentPane.add(lblCaballoDos);
		
		JProgressBar prgBarraUno = new JProgressBar();
		prgBarraUno.setBounds(121, 41, 268, 20);
		contentPane.add(prgBarraUno);
		
		JProgressBar prgBarraDos = new JProgressBar();
		prgBarraDos.setBounds(121, 99, 268, 20);
		contentPane.add(prgBarraDos);
		
		JButton btnCorrer = new JButton("Correr");
		btnCorrer.setBounds(122, 150, 179, 43);
		btnCorrer.addActionListener(this);
		contentPane.add(btnCorrer);
	}

	@Override
	public void actionPerformed(java.awt.event.ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==btnCorrer)
		{
			barra1 = new ThreadAuxiliar(prgBarraUno,"Uno");
			barra2 = new ThreadAuxiliar(prgBarraDos,"Dos");
			barra1.start();
			barra2.start();
		}
		
	}
}
