package priminhos;
import java.util.Scanner;
public class erro {

	public static void main (String[] args) {
		Scanner in= new Scanner (System.in);
		
	        

	 int a[] = new int[10];
	                

	  for (int i=0; i<10; i++) {
	  System.out.println("Digite o "+(i+1)+"º número:");
	  a[i] = in.nextInt();
	            
	  }
	  
	  for(int i=0; i<10; i++) 
       if (primo(a[i])) ;
    	
	    

	                }

	            
private static boolean primo (int numero) {
	            for (int j = 2; j<numero; j++) {
	            	if (numero%j==0)
                   return false;
	              



	        }

	       return true; 

	    }

	               

	}		