package priminhos;
import java.util.Scanner;
public class erro {

	public static void main (String[] args) {
		Scanner in= new Scanner (System.in);
		
	 int a[] = new int[10];
	int  armazenador=0;
	    
	 System.out.println("Números Primos");


	  for (int i=0; i<10; i++) {
	  System.out.println("Digite o "+(i+1)+"º número:");
	  a[i] = in.nextInt();
	 
	  }
	  
	  for (int i=0; i<10; i++) {
	 int divisores =0;
	 
	  
		for (int b = 1; b<=a[i]; b++) {
         if(a[i]%b == 0)  
             divisores= divisores+1;
         
         
         }
     
     if(divisores == 2) {
    	
         System.out.println("O número "+a[i]+ " é primo e está na posição " +(i+1)+"º do vetor ");
     
    	 
    	 
         armazenador++;
	  }
	  }
      
    	 System.out.println(armazenador+ " são primos ");
     }
 
        
         
         
     }

 


	  

	    
	


	    

			