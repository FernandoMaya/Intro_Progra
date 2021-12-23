import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problema_16 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader lector=new BufferedReader (new InputStreamReader(System.in));
		boolean salir = false;
		double v,v1,vt;
		int opcion;
		
		while (!salir){
			System.out.println("Ingresa la clave de tu auto para calcular el impuesto de tu compra");
			System.out.println("1. Clave 1");
			System.out.println("2. Clave 2");
			System.out.println("3. Clave 3");
			System.out.println("4. Salir");
			
			System.out.println("Escribe una de las opciones: ");
			opcion=Integer.parseInt(lector.readLine());
			
			switch (opcion) {
			 case 1:
                 System.out.println("Seleccionaste la clave 1, se debera de pagar 10% de impuestos de su valor total");
                 System.out.println("¿Cuál es el costo del vehiculo");
                 v1=Integer.parseInt(lector.readLine());
                 v=(v1)*(.10);
                 vt=v1+v;
                 System.out.println("El pago total del costo del auto mas los impuestos es de : "+vt);
                 System.out.println("El total de impuestos que deberá de pagar es: "+v);
                 System.out.println("_______________________________");
                 break;
             case 2:
            	 System.out.println("Seleccionaste la clave 2, se debera de pagar 7% de impuestos de su valor total");
                 System.out.println("¿Cuál es el costo del vehiculo");
                 v1=Integer.parseInt(lector.readLine());
                 v=(v1)*(.07);
                 vt=v1+v;
                 System.out.println("El pago total del costo del auto mas los impuestos es de : "+vt);
                 System.out.println("El total de impuestos que deberá de pagar es: "+v);
                 System.out.println("_______________________________");
                 break;
              case 3:
            	  System.out.println("Seleccionaste la clave 3, se debera de pagar 5% de impuestos de su valor total");
                  System.out.println("¿Cuál es el costo del vehiculo");
                  v1=Integer.parseInt(lector.readLine());
                  v=(v1)*(.05);
                  vt=v1+v;
                  System.out.println("El pago total del costo del auto mas los impuestos es de : "+vt);
                  System.out.println("El total de impuestos que deberá de pagar es: "+v);
                 System.out.println("_______________________________");
                 break;
              case 4:
              	System.out.println("¡Gracias por visitarnos!");
              	System.out.println("***FIN DEL PROGRAMA***");
                 salir=true;
                 
                 break;
              default:
                 System.out.println("Solo números entre 1 y 4");
                 System.out.println("_______________________________");
			}
	}
		
		
	}

}
