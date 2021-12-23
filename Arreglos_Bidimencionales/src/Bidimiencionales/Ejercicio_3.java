package Bidimiencionales;

import java.io.IOException;

public class Ejercicio_3 {

public static void main(String[] args) throws IOException {
		
      
        
        int [][] a = new int [12][15];
        int nm=1000000;
        int s=0;
        
        for (int i=0; i<12; i++)
        {
        	for (int j=0; j<15; j++)
        	{
        		a[i][j] = (int) (Math.random()*9+1);        		
        		if (a[i][j]<nm)
        		{
        			nm=a[i][j];
        		}
        		
        	}
        }
        
        
        
        for (int i=0; i<12; i++)
        {
        	for (int j=0; j<15; j++)
        	{
        		System.out.print("[" + a[i][j] + "]");
        	}
        	
        	System.out.println();
        }
        
        for (int i=0; i<12; i++)
        {
        	for (int j=0; j<5; j++)
        	{
        		s=s+a[i][j];

        	}
        }
        
        System.out.println("El numero menor es: " + nm);
        System.out.println ("La suma de las 5 primeras filas es de: " + s);   

	}

}