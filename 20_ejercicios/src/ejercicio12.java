import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio12 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
		String A;
		int a;
		
		System.out.println("cuantos años tienes de antiguedad");
		A=lector.readLine();
		a=Integer.parseInt(A);
		
		switch (a) {
		case 1:
			System.out.println("su bono es de 100");
			break;
		case 2:
		    System.out.println("su bono es de 200");
		    break;
	    case 3:
	        System.out.println("su bono es de 300");
	        break;
	    case 4:
		    System.out.println("su bono es de 400");
		    break;
	    case 5:
		    System.out.println("su bono es de 500");
		    break;
		    default:
		    	System.out.println("su bono es de 1000");
		    	break;
		}
		
		
		
	}

}