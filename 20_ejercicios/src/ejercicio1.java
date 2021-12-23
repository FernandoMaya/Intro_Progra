import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio1 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader lector = new BufferedReader (new InputStreamReader (System.in));
		System.out.println ("Ingrese cantidad 1");
		String a1 = lector.readLine();
		int a = Integer.parseInt(a1);
		System.out.println("Ingrese cantidad 2");
		String b1 = lector.readLine();
		int b = Integer.parseInt(b1);
		System.out.println("Ingrese cantidad 3");
		String c1 = lector.readLine();
		int c = Integer.parseInt(c1);
		if(a==b&&b==c)
		{
			System.out.println("Las Cantidades son Iguales");
		}
		else
		{
			if(a>b&&a>c)
			{
				System.out.println("A es la mayor");
			}
			else 
			{
				if(b>a&&b>c)
				{
					System.out.println("B es la mayor");
				}
				else
				{
					if(c>b&&c>a)
					{
						System.out.println("C es la mayor");
					}
				}
			}
		}
	}

}
