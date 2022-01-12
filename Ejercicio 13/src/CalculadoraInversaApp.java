import javax.swing.JOptionPane;

public class CalculadoraInversaApp {

	public static void main(String[] args) {
		
		int x = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero entero."));
		int y = Integer.parseInt(JOptionPane.showInputDialog("Introduce otro numero entero."));
		
		char simb = JOptionPane.showInputDialog("Introduce un signo aritmetico (+, -, *, /, ^, %)").charAt(0);
		
		switch (simb) 
		{
			case '+':
					JOptionPane.showMessageDialog(null, x + " + " + y + " = " + (x + y));
				break;
				
			case '-':
					JOptionPane.showMessageDialog(null, x + " - " + y + " = " + (x - y));
				break;
				
			case '*':
					JOptionPane.showMessageDialog(null, x + " * " + y + " = " + (x * y));
				break;
				
			case '/':
					if(y != 0)
					{
						JOptionPane.showMessageDialog(null, x + " / " + y + " = " + ((double)x / y));
					}
					else
					{
						JOptionPane.showMessageDialog(null, "El segundo valor vale 0 por ende no se puede dividir.");
					}
				break;
				
			case '^':
					JOptionPane.showMessageDialog(null, x + " ^ " + y + " = " + Math.pow(x, y));
				break;
				
			case '%':
					if(y != 0)
					{
						JOptionPane.showMessageDialog(null, x + " % " + y + " = " + (x % y));
					}
					else
					{
						JOptionPane.showMessageDialog(null, "El segundo valor vale 0 por ende no se puede dividir ni saber su resto.");
					}
				break;
	
			default:
					JOptionPane.showMessageDialog(null, "El texto/caracter introducido no pertenece al grupo de caracteres aritmeticos.");
				break;
		}
		
	}

}
