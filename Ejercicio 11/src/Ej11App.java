import javax.swing.JOptionPane;

public class Ej11App {

	public static void main(String[] args) {

		String dia = JOptionPane.showInputDialog("Introduce un d�a de la semana.");
		
		switch (dia) 
		{
			case "Lunes":
					JOptionPane.showMessageDialog(null, "Lunes es d�a laboral");
				break;

			case "Martes":
					JOptionPane.showMessageDialog(null, "Martes es d�a laboral");
				break;

			case "Mi�rcoles":
					JOptionPane.showMessageDialog(null, "Mi�rcoles es d�a laboral");
				break;

			case "Jueves":
					JOptionPane.showMessageDialog(null, "Jueves es d�a laboral");
				break;

			case "Viernes":
					JOptionPane.showMessageDialog(null, "Viernes es d�a laboral");
				break;

			case "S�bado":
					JOptionPane.showMessageDialog(null, "S�bado no es d�a laboral");
				break;

			case "Domingo":
					JOptionPane.showMessageDialog(null, "Domingo no es d�a laboral");	
				break;
	
			default:
					JOptionPane.showMessageDialog(null, "No has introducido un d�a correcto, o no esta correctamente escrito.");
		}

	}

}
