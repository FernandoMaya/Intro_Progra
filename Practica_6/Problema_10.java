import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problema_10 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		
		int i=0,v=0,va=0,vb=0,vc=0;
		
		System.out.println("cual es el numero de ventas realizado?");
		int nv=Integer.parseInt(teclado.readLine());
		
		for(i=nv;i>0;i=i-1) {
			System.out.println("cual es el valor de la venta");
			v=Integer.parseInt(teclado.readLine());
			System.out.println("el valor de la venta es "+v);
			
			if(v<=10000) {
				va++;
			}
			if(v>10000&&v<20000) {
				vb++;
			}
			
		}
		System.out.println("el valor total de las ventas es de "+vc+" el numero de ventas menores a 10000 es "+va+" y mayores "+vb);
		
		
		
		
		
		
		
		
	}

}
