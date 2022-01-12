import javax.swing.JOptionPane;

public class Ej3App {

	public static void main(String[] args) {

		String nom = JOptionPane.showInputDialog("Introduce tu nombre.");
		
		JOptionPane.showMessageDialog(null, "Bienvenido " + nom);

	}

}
