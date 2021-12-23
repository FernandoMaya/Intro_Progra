import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader lector = new BufferedReader(new InputStreamReader (System.in));
		
		System.out.println("Ingresar credito inicial");
		String credito = lector.readLine();
		double ci = Double.parseDouble(credito);
		
		System.out.println("Ingresar Tipo de Tarjeta");
		String tipo = lector.readLine();
		int t = Integer.parseInt(tipo);
		
		switch(t) {
			case 1: 
				double a = ci*25/100;
				double na = ci + a;
				System.out.println("El aumento de tu credito sera de $ " + a + " pesos y tu credito actual es de $" + na + " Pesos");
				break;
				
			case 2:
				double e = ci*35/100;
				double ne = ci + e;
				System.out.println("El aumento de tu credito sera de $ " + e + " pesos y tu credito acutal es de $" + ne + " Pesos");
				break;
				
			case 3:
				double i = ci*40/100;
				double ni = ci + i;
				System.out.println("El aumento de tu credito sera de $ " + i + "Pesos y tu credito actual es de $" + ni + " Pesos");
				break;
				
			case 4:
				double o = ci*50/100;
				double no = ci + o;
				System.out.println("El aumento de tu credito sera de $ " + o + "Pesos y tu credito actual es de $" + no + " Pesos");
				break;
				
		}
	}

}
