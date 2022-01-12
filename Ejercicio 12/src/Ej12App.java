import javax.swing.JOptionPane;

public class Ej12App {

	public static void main(String[] args) {

		String pass = "CursoJ4v4";
		boolean acierto = false;
		int i = 3;
		
		do 
		{
			String intento = JOptionPane.showInputDialog("Acierta la contraseña, tienes " + i + " intentos.");
			
			if(intento.equals(pass))
			{
				acierto = true;
			}
			
			i--;
		} 
		while (i != 0 && !acierto);
		
		if (acierto) 
		{
			JOptionPane.showMessageDialog(null, "Enhorabuena");	
		} 
		else 
		{
			JOptionPane.showMessageDialog(null, "Mala suerte, intentalo de nuevo.");	
		}

	}

}
