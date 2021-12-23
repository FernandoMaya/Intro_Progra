package Bidimiencionales;

import java.io.IOException;

public class Ejercicio_5 {

   public static void main(String[] args) throws IOException {
		
        int [][]a=new int [19][12];
        
        for (int i=0; i<19; i++)
        {
        	for (int j=0; j<12; j++)
        	{
        		a[i][j] = (int) (Math.random()*7-1); 
        		if (a[i][j]<0)
        		{
        			a[i][j]=0;
        		}
        	}
        }
        
        
        for (int i=0; i<19; i++)
        {
        	for (int j=0; j<12; j++)
        	{
        		
        		if (a[i][j]<0)
        		{
        			a[i][j]=0;
        		}
        		System.out.print("[" + a[i][j] + "]");
        	}
        	System.out.println();
        }  

	}

}