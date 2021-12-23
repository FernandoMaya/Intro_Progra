import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio16 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
		
		String D;
		int d;
		
		System.out.println("Indique el nuumero del dia");
		D=lector.readLine();
		d=Integer.parseInt(D);
		
		switch (d) {
		
		case 1:
			System.out.println("el dia es lunes");
			break;
	    case 2:
		     System.out.println("el dia es martes");
		break;
	    case 3:
		     System.out.println("el dia es miercoles");
		break;
	    case 4:
		     System.out.println("el dia es jueves");
		break;
	    case 5:
		     System.out.println("el dia es viernes");
		break;
	    case 6:
		     System.out.println("el dia es sabado");
		break;
	    case 7:
		     System.out.println("el dia es domingo");
		break;
		
		default:
	          System.out.println("el dia no es valido");
		break;
		}
			
			
		
		
		
		
		
	}

}
