import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class for_2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
		
		int f = 1;
		
		System.out.println("introduce un numero ");
		String num = lector.readLine();
		int nu = Integer.parseInt(num);
		
		
		
		for(int n = nu; n>0; n--)
		{
			f = f * n;
		}
		
		System.out.println("el resultado es :" + f);

	}

}
