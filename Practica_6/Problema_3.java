import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problema_3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		
	BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		
    int N,c=0,c0=0,c1=0,c2=0;
 
	System.out.println("ingrese el numero de cantidades");	
	 c=Integer.parseInt(teclado.readLine());
	 
	 System.out.println();
		
		for(int i=c;i>0;i=i-10) {
			
			System.out.println("Ingrese el numero");
			N=Integer.parseInt(teclado.readLine());
			
			if(N==0) {
			c0=0;
			c0++;	
			}
			if(N>0) {
				c1=0;
				c1++;	
				}
			if(N<0) {
				c1=0;
				c1++;
			}
			System.out.println("los numeros iguales a cero son="+c0
					+"\n Los numeros mayores a 0 son"+c1
					+"\n Los numeros menores a 0 son"+c2);
					
			
			
			
		}
	}

}
