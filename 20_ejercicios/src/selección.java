import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class selección {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Ingrese un numero");
		int dia = Integer.parseInt(lector.readLine());
		
		switch(dia) {
			case 1:
				System.out.println("Lunes");
			break;
			
			case 2:
				System.out.println("Martes");
			break;
			
			case 3:
				System.out.println("Miercoles");
				break;
				
			case 4:
				System.out.println("Jueves");
				break;
				
			case 5:
				System.out.println("Viernes");
				break;
				
			case 6:
				System.out.println("Sabado");
				break;
				
			case 7:
				System.out.println("Domingo");
				break;
				
			case 8:
				System.out.println("Dia No Valido");
				break;
			
			
		}
	}
}