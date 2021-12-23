import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ejercicio20 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Ingresa el sueldo");
		String S =lector.readLine();
		double s =Double.parseDouble(S);
		
		System.out.println("Ingresa la antiguedad");
		String A =lector.readLine();
		int a =Integer.parseInt(A);
		
		if(a>4||s<2000)
		{
			System.out.println("El bono es del 25% " + (s*.25));
		}
		else
		{
			System.out.println("El bono es del 20% " + (s*.20));
		}


	}

}