import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problema_17 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		
		BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
		int b20,b50,m10,m5,m1,t1,t2,t3,t4,t5,T;
		int m=0;
		
		while(m<=1) {
			
		System.out.println("Programa que realiza la suma total de monedas y billetes.");
		
		System.out.println("¿Cuantos billetes de 20 tienes?");
		b20=Integer.parseInt(lector.readLine());
		t1=20*b20;
		
		System.out.println("¿Cuantos billetes de 50 tienes?");
		b50=Integer.parseInt(lector.readLine());
		t2=50*b50;
		
		System.out.println("¿Cuantas monedas de 10 tienes?");
		m10=Integer.parseInt(lector.readLine());
		t3=10*m10;
		
		System.out.println("¿Cuantas monedas de 5 tienes?");
		m5=Integer.parseInt(lector.readLine());
		t4=5*m5;
		
		System.out.println("¿Cuantas monedas de 1 tienes?");
		m1=Integer.parseInt(lector.readLine());
		t5=1*m1;
		
		T=t1+t2+t3+t4+t5;
		
		System.out.println("La suma total de sus ahorros es de: "+T);
	}
		
		
		
		
		
	}

}
