import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader lector = new BufferedReader(new InputStreamReader (System.in));
		
		System.out.println("Ingresar Zona");
		String Zona = lector.readLine();
		int Z = Integer.parseInt(Zona);
		
		System.out.println("Ingresa peso en gramos");
		String Peso = lector.readLine();
		double P = Double.parseDouble(Peso);
		
		if (P>5000) {
			 System.out.println("Excedió el peso");
			 
		}
		else {
		
		switch(Z) {
			case 1:
				System.out.println("Su paquete cuesta " + (P*11) + " Pesos");
				break;
			
			case 2:
				System.out.println("Su paquete cuesta " + (P*10) + " Pesos");
				break;
			
			case 3:
				System.out.println("Su paquete cuesta " + (P*12) + " Pesos");
				break;
				
			case 4:
				System.out.println("Su paquete cuesta " + (P*24) + " Pesos");
				break;
				
			case 5:
				System.out.println("Su paquete cuesta" + (P*27) + " Pesos");
				break;
		}
		
		}	
	}

}
