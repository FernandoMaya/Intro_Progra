import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problema_6 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
		String S;
		int s=0,i,ct=0;
		
		System.out.println("cuantos articulos compro?");
		int r=Integer.parseInt(lector.readLine());
		
		for(i=r;i>0;i=i-1) {
		
		System.out.println("dame el costo del articulo");
		S=lector.readLine();
		s=Integer.parseInt(S);
		
		if(s>=100) {
			s=(s/100)*90;
			ct=s+ct;
		}
		if(s>100&&s<=200) {
			s=(s/100)*88;
			ct=s+ct;
		}
		if(s<200) {
			s=(s/100)*85;
			ct=s+ct;
		}
		}
		System.out.println("su costo es de "+ct);
		
		
		
		
		
		
		
		
		
		
	}

}
