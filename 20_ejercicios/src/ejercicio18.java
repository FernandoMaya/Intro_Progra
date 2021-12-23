
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ejercicio18 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Ingresa la edad el paciente");
		String E =lector.readLine();
		int e =Integer.parseInt(E);
		
		System.out.println("Ingresa el sexo del paciente");
		String sexo =lector.readLine();
		
		
		if(e>=70)
		{
			System.out.println("Se aplica la vacuna C");
		}
		else
		{
			if(e>=16&&e<=69&&sexo.equals("mujer"))
			{
				System.out.println("Se aplica la vacuna B");
			}
			else
			{
				if(e>=16&&e<=69&&sexo.equals("hombre"))
				{
					System.out.println("Se aplica la vacuna A");
				}
				else
				{
					System.out.println("Se aplica la vacuna A");
				}
			}
		}


	}

}
