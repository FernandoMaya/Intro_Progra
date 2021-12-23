import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class for_4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("introduce un numero ");
		String num = lector.readLine();
		int nu = Integer.parseInt(num);
		
		int t1 = 0;
		int t2 = 1;
		System.out.println("primeros " + nu + " terminos");
		
		for(int n = 1; n<=nu; n++)
		{
			
			System.out.println(t1);
			int sum = t1 + t2;
			t1 = t2;
			t2 = sum;
		}
		

	}

}
