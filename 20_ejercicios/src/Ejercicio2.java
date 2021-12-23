import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio2 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader lector = new BufferedReader(new InputStreamReader (System.in));
		
		System.out.println("Ingresar Precio Inicial");
		String precio = lector.readLine();
		
		System.out.println("Ingresa Tipo de Uva");
		String tipo = lector.readLine();
		
		System.out.println("Ingrese Tamaño de Uva");
		String tamaño = lector.readLine();
		int tam = Integer.parseInt(tamaño);
		
		System.out.println("Ingrese Kilogramos");
		String kg = lector.readLine();
		int kilos = Integer.parseInt(kg);
		
		if(tipo.equals("a") && tam ==1)
		{
			double x= 0.2*kilos;
			System.out.println("La ganancia del productor es de: $" + x + " pesos");
		}
		if((tipo.equals("a") && tam == 2) || (tipo.equals("b") && tam == 1) )
		{
			double x= 0.3*kilos;
			System.out.println("La ganancia del productor es de: $" + x + " pesos");
		}
		if(tipo.equals("b") && tam == 2)
		{
			double x= 0.5*kilos;
			System.out.println("La ganancia del productor es de: $" + x + " pesos");
		}
	}

}
