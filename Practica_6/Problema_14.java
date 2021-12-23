import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problema_14 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader lector = new BufferedReader (new InputStreamReader(System.in));
		int n;
		
        System.out.print("Introduce un número entero: ");
        n=Integer.parseInt(lector.readLine());
        for(int i = 1; i<=10; i++){
            System.out.println(n + " * " + i + " = " + n*i);
        }
	}

}
