import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problema_2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		
		String H=null;
		int ct=0,hs=0,hd=0,ht=0;
		
		System.out.println("ingrese el numero de hamburgesas que va a comprar");
		int nh=Integer.parseInt(teclado.readLine());
		
		for(int i=nh;i>0;i=i-1) {
			System.out.println("de que tamaño seria la hamburgesa s=sencilla, d=doble,t=triple");
			H=teclado.readLine();
			
			if(H.equals("S")||H.equals("s")) {
				ct=ct+20;
				hs++;
			}
			if(H.equals("D")||H.equals("d")) {
				ct=ct+25;
				hd++;
			}
			if(H.equals("T")||H.equals("t")) {
				ct=ct+28;
			    ht++;
			}
		}
		System.out.println("El costo total de hamburguesas que compro es de "+ct+" el numero de hamburguesas que compro es de "
				+ "\n Sencillas "+hs
				+ "\n Dobles "+hd
				+ "\n Triple "+ht);
		
		
		
		
		
		
		
	}

}
