import java.util.Scanner;

public class Ej10App {
	
	public static Scanner teclat = new Scanner(System.in);

	public static void main(String[] args) {
		
		int numVentas;
		double suma = 0;

		System.out.println("N� de ventas?");
		numVentas = teclat.nextInt();
		
		for (int i = 0; i < numVentas; i++) 
		{
			System.out.println("Precio de venta n� " + (i + 1) + "? (Decimales con coma ',')");
			suma += teclat.nextDouble();
		}
		
		System.out.println("Suma total de ventas: " + suma + " �");
	}

}
