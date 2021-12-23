import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ejercicio19 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));

	System.out.println("Ingrese su pago anterior");
	String pagoante = lector.readLine();
	int a = Integer.parseInt(pagoante);
	
	System.out.println("Ingrese su saldo anterior");
	String saldoante = lector.readLine();
	int b = Integer.parseInt(saldoante);
	
	int c = a+b;
	System.out.println("Su saldo actual es de " + c + " pesos");
    double d = (c*.15);
	System.out.println("El pago minimo es de " + d + " pesos");
	double e = (c*.85);
	System.out.println("El pago maximo sin intereses es de " +  e + " pesos");
	
	System.out.println("Ingrese su pago deudor");
	String pago = lector.readLine();
	int p = Integer.parseInt(pago);
	
	if (p<d)
		System.out.println("No fue suficiente su pago y se le cobrara " +  ((p*.12)+200) + " pesos");
	if (e>p&&p>d)
		System.out.println("Su pago ha sido un exito");
	if (p>e)
		System.out.println("Se le cobraran intereses");
	
	
	
	
	
	}

}
