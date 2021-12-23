import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio15 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
		String C;
		int c;
	
		System.out.println("Cual fue su calificacion");
		C=lector.readLine();
		c=Integer.parseInt(C);
		
		
		if(c==10) {
		System.out.println("su calificacion es A");
	       }	
	    if(c==9) {
	    	System.out.println("su calificacion es B");
	    }
		if(c==8) {
			System.out.println("su calificacion es C");
		}
		if(c==7||c==6) {
			System.out.println("su calificacion es D");
		}
		if(c>=0&&c<=5) {
			System.out.println("su calificacion es F");
		}
		
	}

}
