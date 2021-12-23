import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio7 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Ingrese el pago por hora");
		String pago = lector.readLine();
		double p = Double.parseDouble(pago);
		
		System.out.println("Ingrese las horas trabajadas");
		String horas = lector.readLine();
		int h = Integer.parseInt(horas);
		
		if(h>40) {
			int x=2*h;
			System.out.println("Su sueldo es de " + (p*x));
		}
		if(h<40) {
			System.out.println("Su sueldo es de " + (h*p));
		}
	}

}
