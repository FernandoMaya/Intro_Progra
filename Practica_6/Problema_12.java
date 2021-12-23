import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problema_12 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
		double c,ct;
		boolean salir=false;
		
		while(!salir) {
		System.out.println("Ingresa tu nombre");
		String nam=lector.readLine();
		{
		System.out.println("Ingresa tu sueldo");
		double sueldo = Integer.parseInt(lector.readLine());
			if(sueldo <=149) { 
			System.out.println("Se le restara el 5%");
			c= sueldo*.05;
			ct=sueldo-c;
		System.out.println("Tu sueldo "+nam+" es de $"+ct);
		}	
		else {
			if(sueldo>=150 && sueldo<=299) {
				System.out.println("Se le restara el 7%");
				c= sueldo*.07;
				ct=sueldo-c;
			System.out.println("Tu sueldo "+nam+" es de $"+ct);
				
			}
			else
			{
				if(sueldo>=300 && sueldo<=450) {
					System.out.println("Se le restara el 9%");
					c= sueldo*.09;
					ct=sueldo-c;
				System.out.println("Tu sueldo "+nam+" es de $"+ct);
				}
			}
			}
		}
	}
	}

}
