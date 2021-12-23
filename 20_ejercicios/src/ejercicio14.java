
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ejercicio14 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		String N;
		int n,c=0;
		
		System.out.println("inserte el  numero de alumnos");
		N=teclado.readLine();
		n=Integer.parseInt(N);
		
		if(n>100) {
			c=n*20;
		}
		if(n<=100&&n>=50) {
			c=n*35;
		}
		if(n<=49&&n>=20) {
			c=n*40;
		}
		if(n<20) {
			c=n*70;
		}
		System.out.println("el costo total por el viaje es "+c);
		
		
		
		
		
		
		
	}

}
