package tabuada;
import java.util.Scanner;
public class Tabuada {
     
	public static void main (String [] Args) {
	 Scanner in= new Scanner (System.in);
 
 int r=0;
 int n;
 int i;
 
  for (i=1; i<=10; i++){ 
  for (n=1; n<=10; n++) {
	  
	  r= (n*i);
			  
	  System.out.println (i+"x"+n+"="+r);  

  }
  }
 }	
}
