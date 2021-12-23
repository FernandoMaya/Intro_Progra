import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio11 {

	public static void main(String[] args)  throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader lector = new BufferedReader (new InputStreamReader(System.in));

		System.out.println("Ingrese su edad");
		String edad = lector.readLine();
		int e = Integer.parseInt(edad);
		
		System.out.println("¿Usted bebe alcohol? Escriba V o F");
		String al = lector.readLine();
		
		System.out.println("¿Usted usa lentes? Escriba V o F");
		String len = lector.readLine();
		
		System.out.println("¿Usted tiene alguna enfermedad cronica? Escriba V o F");
		String enf = lector.readLine();
		
		System.out.println("Ingrese el tipo de poliza que va a pedir");
		String tipo = lector.readLine();
		
		if ((tipo.equals("A"))||(tipo.equals("B")))
			if ((tipo.equals("A"))) {
			    if ((al.equals("V"))&&(len.equals("V"))&&(enf.equals("V"))&&(e>40)) 
		        System.out.println("Su poliza cuesta " + ((1200*.40)+1200) + " pesos");  
		    	if ((al.equals("F"))&&(len.equals("V"))&&(enf.equals("V"))&&(e>40))
		    	System.out.println("Su poliza cuesta " + ((1200*.20)+1200) + " pesos");
		    	if ((al.equals("V"))&&(len.equals("F"))&&(enf.equals("V"))&&(e>40))
		    	System.out.println("Su poliza cuesta " + ((1200*.35)+1200) + " pesos");
		    	if ((al.equals("V"))&&(len.equals("V"))&&(enf.equals("F"))&&(e>40))
		    	System.out.println("Su poliza cuesta " + ((1200*.35)+1200) + " pesos");
		    	if ((al.equals("F"))&&(len.equals("F"))&&(enf.equals("V"))&&(e>40))
		    	System.out.println("Su poliza cuesta " + ((1200*.15)+1200) + " pesos");
		    	if ((al.equals("V"))&&(len.equals("F"))&&(enf.equals("F"))&&(e>40))
		    	System.out.println("Su poliza cuesta " + ((1200*.30)+1200) + " pesos");
		    	if ((al.equals("F"))&&(len.equals("V"))&&(enf.equals("F"))&&(e>40))
		    	System.out.println("Su poliza cuesta " + ((1200*.25)+1200) + " pesos");
		    	if ((al.equals("F"))&&(len.equals("F"))&&(enf.equals("F"))&&(e>40))
		    	System.out.println("Su poliza cuesta " + ((1200*.20)+1200) + " pesos");
		    	
		    	if ((al.equals("V"))&&(len.equals("V"))&&(enf.equals("V"))&&(e<40))
		    	System.out.println("Su poliza cuesta " + ((1200*.30)+1200) + " pesos");
		    	if ((al.equals("F"))&&(len.equals("V"))&&(enf.equals("V"))&&(e<40))
		    	System.out.println("Su poliza cuesta " + ((1200*.20)+1200) + " pesos");
		    	if ((al.equals("V"))&&(len.equals("F"))&&(enf.equals("V"))&&(e<40))
		    	System.out.println("Su poliza cuesta " + ((1200*.25)+1200) + " pesos");
		    	if ((al.equals("F"))&&(len.equals("F"))&&(enf.equals("V"))&&(e<40))
		    	System.out.println("Su poliza cuesta " + ((1200*.15)+1200) + " pesos");
		    	if ((al.equals("V"))&&(len.equals("V"))&&(enf.equals("F"))&&(e<40))
		    	System.out.println("Su poliza cuesta " + ((1200*.25)+1200) + " pesos");
		    	if ((al.equals("F"))&&(len.equals("V"))&&(enf.equals("F"))&&(e<40))
		    	System.out.println("Su poliza cuesta " + ((1200*.15)+1200) + " pesos");
		    	if ((al.equals("V"))&&(len.equals("F"))&&(enf.equals("F"))&&(e<40))
		    	System.out.println("Su poliza cuesta " + ((1200*.20)+1200) + " pesos");
		    	if ((al.equals("F"))&&(len.equals("F"))&&(enf.equals("F"))&&(e<40))
		    	System.out.println("Su poliza cuesta " + ((1200*.10)+1200) + " pesos");
			}
		    else 	{
			    if ((al.equals("V"))&&(len.equals("V"))&&(enf.equals("V"))&&(e>40)) 
			        System.out.println("Su poliza cuesta " + ((950*.40)+950) + " pesos");  
			    if ((al.equals("V"))&&(len.equals("V"))&&(enf.equals("F"))&&(e>40)) 
			        System.out.println("Su poliza cuesta " + ((950*.35)+950) + " pesos"); 
			    if ((al.equals("V"))&&(len.equals("F"))&&(enf.equals("V"))&&(e>40)) 
			        System.out.println("Su poliza cuesta " + ((950*.35)+950) + " pesos"); 
			    if ((al.equals("V"))&&(len.equals("F"))&&(enf.equals("F"))&&(e>40)) 
			        System.out.println("Su poliza cuesta " + ((950*.30)+950) + " pesos"); 
			    if ((al.equals("F"))&&(len.equals("V"))&&(enf.equals("V"))&&(e>40)) 
			        System.out.println("Su poliza cuesta " + ((950*.30)+950) + " pesos"); 
			    if ((al.equals("F"))&&(len.equals("V"))&&(enf.equals("F"))&&(e>40)) 
			        System.out.println("Su poliza cuesta " + ((950*.25)+950) + " pesos");
			    if ((al.equals("F"))&&(len.equals("F"))&&(enf.equals("V"))&&(e>40)) 
			        System.out.println("Su poliza cuesta " + ((950*.25)+950) + " pesos"); 
			    if ((al.equals("F"))&&(len.equals("F"))&&(enf.equals("F"))&&(e>40)) 
			        System.out.println("Su poliza cuesta " + ((950*.20)+950) + " pesos");
			    
			    if ((al.equals("V"))&&(len.equals("V"))&&(enf.equals("V"))&&(e<40)) 
			        System.out.println("Su poliza cuesta " + ((950*.30)+950) + " pesos");  
			    if ((al.equals("V"))&&(len.equals("V"))&&(enf.equals("F"))&&(e<40)) 
			        System.out.println("Su poliza cuesta " + ((950*.25)+950) + " pesos"); 
			    if ((al.equals("V"))&&(len.equals("F"))&&(enf.equals("V"))&&(e<40)) 
			        System.out.println("Su poliza cuesta " + ((950*.25)+950) + " pesos");  
			    if ((al.equals("V"))&&(len.equals("F"))&&(enf.equals("F"))&&(e<40)) 
			        System.out.println("Su poliza cuesta " + ((950*.20)+950) + " pesos"); 
			    if ((al.equals("F"))&&(len.equals("V"))&&(enf.equals("V"))&&(e<40)) 
			        System.out.println("Su poliza cuesta " + ((950*.20)+950) + " pesos");  
			    if ((al.equals("F"))&&(len.equals("V"))&&(enf.equals("F"))&&(e<40)) 
			        System.out.println("Su poliza cuesta " + ((950*.15)+950) + " pesos");
			    if ((al.equals("F"))&&(len.equals("F"))&&(enf.equals("V"))&&(e<40)) 
			        System.out.println("Su poliza cuesta " + ((950*.15)+950) + " pesos"); 
			    if ((al.equals("F"))&&(len.equals("F"))&&(enf.equals("F"))&&(e<40)) 
			        System.out.println("Su poliza cuesta " + ((950*.10)+950) + " pesos");  
			    			    
		    }
		    	
		    
		        
		        
			}     	
	  
	
	}   

		      
		        
				