package vetor;
import java.util.Scanner;
public class VetorInteiro {
     
	public static void main (String[] args) {
	Scanner in= new Scanner (System.in);
	 
	int a[] = new int [10];
	int b[] = new int [10];
	
	for (int i=0; i<10; i++){
	System.out.println("Digite um número inteiro:");
    a[i] = in.nextInt();
    b[i] = a[i]*a[i];
	
	}
	
	for (int i=0; i<10; i++) {
	System.out.println("O número ao quadrado de "+a[i]+" é: "+b[i]);	
	}
	
	
	
	

}
}