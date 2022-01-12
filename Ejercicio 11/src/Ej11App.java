import javax.swing.JOptionPane;

public class Ej11App {

	public static void main(String[] args) {

		String dia = JOptionPane.showInputDialog("Introduce un día de la semana.");
		
		switch (dia) 
		{
			case "Lunes":
					JOptionPane.showMessageDialog(null, "Lunes es día laboral");
				break;

			case "Martes":
					JOptionPane.showMessageDialog(null, "Martes es día laboral");
				break;

			case "Miércoles":
					JOptionPane.showMessageDialog(null, "Miércoles es día laboral");
				break;

			case "Jueves":
					JOptionPane.showMessageDialog(null, "Jueves es día laboral");
				break;

			case "Viernes":
					JOptionPane.showMessageDialog(null, "Viernes es día laboral");
				break;

			case "Sábado":
					JOptionPane.showMessageDialog(null, "Sábado no es día laboral");
				break;

			case "Domingo":
					JOptionPane.showMessageDialog(null, "Domingo no es día laboral");	
				break;
	
			default:
					JOptionPane.showMessageDialog(null, "No has introducido un día correcto, o no esta correctamente escrito.");
		}

	}

}
