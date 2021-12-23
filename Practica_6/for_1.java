import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class for_1 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
		
		int A = 1;
		
		for(int B = 1; B <= 19; B=B+2)
		{
			A = A * B;
		}
		
		System.out.println("el producto es :" + A);
	}

}
