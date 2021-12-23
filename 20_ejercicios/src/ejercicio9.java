import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio9 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Ingresa la primer edad");
		String A =lector.readLine();
		int a = Integer.parseInt(A);
		
		System.out.println("Ingresa el primer nombre");
		String d =lector.readLine();
		
		System.out.println("Ingresa la segunda edad");
		String B =lector.readLine();
		int b = Integer.parseInt(B);
		
		System.out.println("Ingresa el segundo nombre");
		String e =lector.readLine();
		
		System.out.println("Ingresa la tercer edad");
		String C =lector.readLine();
		int c = Integer.parseInt(C);
		
		System.out.println("Ingresa el tercer nombre");
		String f =lector.readLine();
		
		if(a<b&&b<c)
		{
			System.out.println("El menor es " + d + " y su edad es " + a);
		}
		else 
		{
			if(b<a&&b<c)
			{
				System.out.println("El menor es " +  e + " y su edad es " + b);	
			}
			else
			{
				System.out.println("El menor es " + f + " y su edad es " + c);
			}
		}

	}

}
