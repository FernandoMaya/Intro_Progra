import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problema_7 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader lector=new BufferedReader (new InputStreamReader(System.in));

		int a,i,am=0,p,at=0,ap=0,c=0;
		
		System.out.println("cuantos seran los años de su inversion?");
		int b=Integer.parseInt(lector.readLine());
		a=b*12;
		
		for(i=a;i>0;i=i-1) {
			System.out.println("Cual es su ahorro mensual?");
			am=Integer.parseInt(lector.readLine());
			
			at=at+am;
			System.out.println("Cual es su ahorro mensual es"+at);
		    c=100-(b*10);
			
			}
		
		
		ap=(at*100)/c;
		System.out.println("su ahorro es de "+ap);
		
		
	}

}
