import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problema_8 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		
		int na=0,ea=0,nta=0,eta=0,eap=0,ps=0,pta=0;
		
		System.out.println("cual es el numero de salones");
		int ns=Integer.parseInt(teclado.readLine());
		
		for(int i=ns;i>0;i=i-1) {
			
			System.out.println("cual es el numero de alumnos");
			na=Integer.parseInt(teclado.readLine());
			nta=na+nta;
			
			eap=0;
			
			for(int c=na;c>0;c=c-1) {
				System.out.println("cual es la edad del alumno?");
				ea=Integer.parseInt(teclado.readLine());
				
				eap=ea+eap;
				
				eta=eta+ea;
				ps=eap/na;
				
				
			}

			System.out.println("el promedio del salon es "+ps);
			
			
		}
		
		pta=eta/nta;
		System.out.println("el promedio de la escuela es "+pta);

		
		
		
	}

}
