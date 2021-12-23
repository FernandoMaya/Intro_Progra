import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio6 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Ingrese su edad");
		String edad = lector.readLine();
		int e = Integer.parseInt(edad);
		
		if(e>18) {
			System.out.println("Usted Puede Votar En Las proximas elecciones");
		}
		if(e<18) {
			System.out.println("Usted NO puede votar");
		}
	}

}
