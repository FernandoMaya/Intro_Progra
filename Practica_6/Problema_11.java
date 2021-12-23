import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problema_11 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
		int i=1;
		int n=0;
		float cal=0;
		int ap=0;
		int rp=0;
		
	System.out.println("Introduce el numero de alumnos");
	
	n=Integer.parseInt(lector.readLine());
	
	while(i<=n) {
		System.out.println("Calificación del alumno: " +i);
		cal=Integer.parseInt(lector.readLine());
		if(cal>5) {
			ap=ap+1;
		}
		else
		{
			rp=rp+1;
		}
		i++;
	}
	System.out.println("El numero de aprobados es: " +ap);
	System.out.println("El numero de reprobados es: " +rp);
	
	
	}

}
