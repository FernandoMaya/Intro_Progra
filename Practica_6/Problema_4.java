import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problema_4 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		
		int i,cr=0,cv=0,cb=0;
		String c=null;
		
          System.out.println("cual es el numero de focos en el lote");		
		  int r=Integer.parseInt(teclado.readLine());
		
		for(i=r;i>0;i=i-1) {
			System.out.println("de que color es el foco? R=rojo B=blanco V=verde");
			c=teclado.readLine();
			
			if(c.equals("R")||c.equals("r")){
				cr++;
			}
			if(c.equals("B")||c.equals("b")) {
				cb++;
			}
			if(c.equals("v")||c.equals("V")) {
				cv++;
			}
			
			
		}
		System.out.println("el numero de focos blancos es: "+cb+" rojos: "+cr+" verdes: "+cv);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
