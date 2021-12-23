import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio13 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
		int a,s,st=0,sp;
		String A,S;
		
		System.out.println("cuales son tus años de antuguedad?");
		A=lector.readLine();
		a=Integer.parseInt(A);
		
		System.out.println("cuales es tu sueldo?");
		S=lector.readLine();
		s=Integer.parseInt(S);
		
		if(a<2) {
			System.out.println("no es objeto a bono por atniguedad");
			
			if(s<1000) {
				sp=(s/100)*125;
				st=sp;
			}
			if(s>=1000&&s<3500) {
				sp=(s/100)*115;
				st=sp;
			}
			if(s>3500) {
				sp=(s/100)*110;
			}
		}
		if(a>2&&a<=5) {
			st=(s/100)*120;
			if(s<1000) {
				sp=(s/100)*125;
				st=st+sp;
			}
			if(s>=1000&&s<3500) {
				sp=(s/100)*115;
				st=st+sp;
			}
			if(s>3500) {
				sp=(s/100)*110;
				st=st+sp;
			}
		
		}
		if(a>5) {
			st=(s/100)*130;
			if(s<1000) {
				sp=(s/100)*125;
				st=st+sp;
			}
			if(s>=1000&&s<3500) {
				sp=(s/100)*115;
				st=st+sp;
			}
			if(s>3500) {
				sp=(s/100)*110;
				st=st+sp;
			}
		}
		System.out.println("su nuevo sueldo es "+ st);
	
	
	
	
	
	
	
	
	
	
	}

}
