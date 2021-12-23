import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class for_3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
		
		int t = 0;
		
		System.out.println("introduce un numero menor a 10 ");
		String num = lector.readLine();
		int nu = Integer.parseInt(num);
		
		for(int n = 0; n<=10; n++)
		{
			t = nu*n;
			System.out.println("el resultado es :" + t);
		}
		

	}

}
