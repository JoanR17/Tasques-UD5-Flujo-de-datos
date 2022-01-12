import javax.swing.JOptionPane;

public class Ej6App {

	public static void main(String[] args) {
		
		double precio = Double.parseDouble(JOptionPane.showInputDialog("Introduce el precio del producto en €."));
		final double IVA = 0.21;
		
		JOptionPane.showMessageDialog(null, "El precio del producto incluido IVA es " + (precio + precio * IVA) + " €");

	}

}
