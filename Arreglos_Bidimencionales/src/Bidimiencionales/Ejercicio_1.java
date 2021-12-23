package Bidimiencionales;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio_1 {

public static void main(String[] args) throws IOException {
		
        BufferedReader lector = new BufferedReader (new InputStreamReader(System.in));
        
        int a=0;
        int b=0;
        
        System.out.println ("Ingresa el numero de filas: ");
        a =Integer.parseInt(lector.readLine());
        
        System.out.println("Ingresa el numero de columnas: ");
        b=Integer.parseInt(lector.readLine());
        
        int [][] c = new int [a][b];
        
       
        for (int i=0; i<a; i++)
        {
        	for (int j=0; j<b; j++)
        	{
        		
        		System.out.println("Ingresa un numero: ");
        		c[i][j]=Integer.parseInt(lector.readLine());
	
        	}
        
        }
        
        for (int i=0; i<a; i++)
        {
        	for (int j=0; j<b; j++)
        	{
        		
        		
        		System.out.print("[" + c[i][j] + "]");
        	}
        	
        	System.out.println();
        
        }
        
        
        System.out.println("--------------------");
        
        for (int j=0; j<b; j++)
        {
        	for (int i=0; i<a; i++)
        	{
        		
        		
        		System.out.print("[" + c[i][j] + "]");
        	}
        	
        	System.out.println();
        
        }
        
        
        
      
        

	}

}
