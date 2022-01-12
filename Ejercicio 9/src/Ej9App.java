
public class Ej9App {

	public static void main(String[] args) {

		System.out.print("Numeros del 1 al 100 divisibles entre 2 y 3: ");
		boolean first = true;
		
		for (int i = 1; i <= 100; i++)
		{
			if (i % 2 == 0 && i % 3 == 0) 
			{
				if(!first)
				{
					System.out.print(", ");
				}
				System.out.print(i);
				first = false;
			}
		}
		
	}

}
