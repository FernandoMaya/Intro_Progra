import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Problema_1 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
		
		int i,su=1500;
		
		for(i=0;i<7;i++) {
			su=(su/100)*110;
			System.out.println("su saldo este año es "+su);
				}
		System.out.println("su saldo final es "+su);
			
	}

}
