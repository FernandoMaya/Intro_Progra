import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio10 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Ingrese el precio inicial");
		String precioi = lector.readLine();
		double pi = Double.parseDouble(precioi);
		
		if(pi>200) {
			double x=pi*.15;
			System.out.println("Su precio final es de " + (pi-x) + " Y Su descuento fue de " + x);
		}
		if(pi>100&&pi<200) {
			double x= pi*.12;
			System.out.println("Su precio final es de " + (pi-x) + " Y Su descuento fue de " + x);
		}
	}

}
