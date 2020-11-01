package tareaHilos;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

public class ThreadAuxiliar extends Thread{
	private JProgressBar componente;
	private Random random;
	private volatile boolean completo = false;
	private Random getRand() {
		return random;
	}
	
	public ThreadAuxiliar(JProgressBar componente, String nombre) {
		this.componente = componente;
		random = new Random();
		this.componente.setName(nombre);
		this.componente.setMaximum(100);
	}
	
	public synchronized boolean Completo() {
		return completo;
	}
	
	@Override
	public void run() {
		int intPorcentaje = 0;
		while(!completo) {
			if(componente.getValue()>= 100) {
				completo = true;
			}
			componente.setValue(intPorcentaje);
			intPorcentaje += getRand().nextInt(3);
			try {
				Thread.sleep(35);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		componente.setValue(0);
		JOptionPane.showMessageDialog(componente, componente.getName()+" se ha completado");
	}
}
