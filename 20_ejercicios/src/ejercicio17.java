import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio17 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
		
	
		String P,S;
		int p ,s,st=0;
		
		System.out.println("dame el salario minimo");
		S=lector.readLine();
		s=Integer.parseInt(S);
		
		System.out.println("dame tus puntos reunidos");
		P=lector.readLine();
		p=Integer.parseInt(P);
		
		if(p<100) {
			st=s+s;
			
		}
		if(p>101&&p<150) {
			st=s*3;
		}
		if(p>151) {
			st=s*4;
		}
	System.out.println("su bono es "+st );
	
	
	
	
	
	
	
	}

}
