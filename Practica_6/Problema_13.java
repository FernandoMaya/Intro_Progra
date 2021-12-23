import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problema_13 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader lector = new BufferedReader (new InputStreamReader(System.in));
		boolean salir=false;
		
		while (!salir) {
		int res,c;
		System.out.println("Ingresa el numero /Escribe 0 para salir");
		c=Integer.parseInt(lector.readLine());
		if(c>=1){
		res=c*c*c;
		System.out.println("El cubo del numero es: "+res);
		}if(c==0) 
		{
			System.out.println("**FIN DEL PROGRAMA**");
			salir=true;
		}
	}
	}

}
