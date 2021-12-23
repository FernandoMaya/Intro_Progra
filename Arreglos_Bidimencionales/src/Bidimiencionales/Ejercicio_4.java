package Bidimiencionales;

import java.io.IOException;

public class Ejercicio_4 {

  public static void main(String[] args) throws IOException {
		
        int [][]a=new int [12][12];
 int aux=0;
        
        for (int i=0; i<12; i++)
        {
        	for (int j=0; j<12; j++)
        	{
        		a[i][j] = (int) (Math.random()*9+1); 
        		
        	}
        }
        
        
        for (int i=0; i<12; i++)
        {
        	for (int j=0; j<12; j++)
        	{
        		if (i==j)
        		{
        			aux=a[i][j];
        		}
        		
        		System.out.print("[" + a[i][j] + "]");
        	}
        	System.out.println();
        }  
        
        
        System.out.println("---------------");
        
 int [][]b=new int [12][12];
 int aux1=0;
        
        for (int i=0; i<12; i++)
        {
        	for (int j=0; j<12; j++)
        	{
        		b[i][j] = (int) (Math.random()*9+1); 
        		
        	}
        }
        
        
        for (int i=0; i<12; i++)
        {
        	for (int j=0; j<12; j++)
        	{
        		if (i==j)
        		{
        			aux1=b[i][j];
        		}
        		System.out.print("[" + b[i][j] + "]");
        	}
        	System.out.println();
        }  
        
        for (int i=0; i<12; i++)
        {
        	for (int j=0; j<12; j++)
        	{
        	}
        }
        
        if (aux==aux1)
        {
        	System.out.println("Las diagonales son iguales");
        }
        else
        {
        	System.out.println("Las diagonales no son iguales");
        }

	}

}