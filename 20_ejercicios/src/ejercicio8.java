import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ejercicio8 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Ingresa las horas en el estacionamiento");
		String H =lector.readLine();
		int h = Integer.parseInt(H);
		
		if(h<=2)
		{
			System.out.println("El precio del estacionamiento es " + h*5);
		}
		else
		{
			if(h>2&&h<6)
			{
				System.out.println("El precio del estacionamiento es " + (h*4+10));
			}
			else
			{
				if(h>=6&&h<11)
				{
					System.out.println("El precio del estacionamiento es " + (h*3+30));
				}
				else
				{
					System.out.println("El precio del estacionamiento es " + (h*2+60));
				}
			}
		}
	}

}