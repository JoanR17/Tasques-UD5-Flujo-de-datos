import javax.swing.JOptionPane;

public class Ej4App {

	public static void main(String[] args) {
		
		double r = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor del radio del circulo en cm."));
		
		JOptionPane.showMessageDialog(null, "La area del circulo es " + (Math.PI * Math.pow(r, 2)) + " cm2");
	}

}
