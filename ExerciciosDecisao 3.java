package prjExercicios;
import java.util.Scanner;
public class ExerciciosDecisao {
       
       public static void main(String[]args){
             
       Scanner in=new Scanner (System.in);

       int numero;
              
  System.out.println("Digite o número");
   numero=in.nextInt();
            
   if ((numero%2)==0) {
                 
   System.out.println("Seu número é par.");
   } else{      
      
   System.out.println ("Seu número é impar.");
  
              }
              

      }


}