import java.util.*;
public class exercicioIdade {
	public static void main (String args []) {
  	  Scanner in= new Scanner (System.in);
  	  
  	 int idade;
   	 int nascimento;
  	 int atual;
  	 int velho=0;
  	 int novo=500;
  	
  	 System.out.println("Informe o ano em que você está:");
  	  atual = in.nextInt();
  	 
  	 for (int i=0; i<=5; i++) {
	    System.out.println("\nInforme seu ano de nascimento");
		nascimento= in.nextInt();
	
  	     idade = atual - nascimento;
  	          
  	        System.out.println("A idade é: "+idade);
  	        
  	      if(idade>velho) {
  	    	velho= idade;
  	     
  	      }
  	        if(idade<novo) {
	          novo =idade;
         
           }
           }
  			  System.out.print("\nO usuário mais novo é o de "+novo);
  			 System.out.print("\nO usuário mais velho é com idade "+velho);
  		  
  		  }
  	  }  
	
	
	
	



