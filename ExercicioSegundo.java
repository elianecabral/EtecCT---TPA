package vetor;
import java.util.Scanner;
public class ExercicioSegundo {
	
	public static void main (String[] args) {
	Scanner in= new Scanner (System.in);
	
	int a[] = new int [10];
	int b[] = new int [10];
	int c[] = new int [10];
	
	System.out.println("Digite os 10 primeiros n�meros");
	
	for (int i=0; i<10; i++) {
	System.out.println("Digite o "+(i+1)+"� n�mero:");
	a[i] = in.nextInt();
	
	}
	System.out.println("\nDigite os 10 segundos n�meros");
	
	for (int i=0; i<10; i++) {
	System.out.println("Digite o "+(i+1)+"� n�mero:");
	b[i] = in.nextInt();	
	
	}
	
	for(int i=0; i<10; i++) {
	c[i] = a[i]- b[i];		
	
	}
	
	System.out.println("\nResultado das subtrac�es:");
	
	for (int i=0; i<10; i++) {
	System.out.println(+a[i]+"-"+b[i]+"="+c[i]);
	}
}
}
