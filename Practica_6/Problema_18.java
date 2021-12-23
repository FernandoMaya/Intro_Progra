import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problema_18 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
		
		double pm,pi,sa12,pni;
		int m=0;
		
		while (m<=1) {
		System.out.println("***BANCO BANDIDO DE PELUCHE***");
		System.out.println("Ingrese su saldo actual que aparece en su estado de cuenta");
		Double sa = Double.parseDouble(lector.readLine());
		
		pm=sa/100*15;
		System.out.println("El pago minimo de su tarjeta es de: "+pm);
		
		sa12=sa/100*12;
		pi=sa+sa12;
		pni=pi/100*85;
		System.out.println("El pago para no generar intereses incluye una multa de $200 por morosidad,\nel total a liquidar es de: "+pni+200);
		
		}
		
		
		
		
		
		
		
		
		
		
	}

}
