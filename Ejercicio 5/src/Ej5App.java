import javax.swing.JOptionPane;

public class Ej5App {

	public static void main(String[] args) {


		int x = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero entero."));
		
		if(x % 2 == 0)
		{
			JOptionPane.showMessageDialog(null, "El numero " + x + " es par(divisible entre 2).");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "El numero " + x + " es impar(no divisible entre 2).");
		}

	}

}
