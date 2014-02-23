import java.util.Scanner;
public class Aleatorio{   

   public static void main(String[] args) {
    
 int n,numero;

Scanner consola = new Scanner(System.in);
n=Integer.parseInt(args[0]);
  numero =(int)(Math.random()*100 + 1); 
		
  
 while(n!=numero){
   if (n<numero){
    System.out.println("EL NUMERO INGRESADO ES MENOR, INGRESE OTRO NUMERO");
    n= consola.nextInt();
                }
       else {
          System.out.println("EL NUMERO INGRESADO ES MAYOR, INGRESE OTRO NUMERO");
           n= consola.nextInt();
            }
                  }
if (n==numero) {
System.out.println("ADIVINO EL NUMERO!!!!");
               }
}
}