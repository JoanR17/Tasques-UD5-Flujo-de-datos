import javax.swing.JOptionPane;

public class Ej1App {

	public static void main(String[] args) {

		int x = 17, y = 8;
		
		if(x == y)
		{
			JOptionPane.showMessageDialog(null, "La variable X = " + x + " es igual a la variable Y = " + y);
		}
		else if(x > y)
		{
			JOptionPane.showMessageDialog(null, "La variable X = " + x + " es mayor a la variable Y = " + y);
		}
		else
		{
			JOptionPane.showMessageDialog(null, "La variable X = " + x + " es menor a la variable Y = " + y);
		}

	}

}
