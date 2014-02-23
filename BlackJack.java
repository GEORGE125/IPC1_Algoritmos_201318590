import java.util.Scanner;
public class BlackJack{   

   public static void main(String[] args) {
    
 int suma ;

Scanner consola = new Scanner(System.in);

int   carta1 =(int)(Math.random()*11 + 1); 
int carta2 =(int)(Math.random()*11 + 1);
System.out.println("[X][X]");
System.out.println("DESEA UNA TERCERA CARATA,RESPONDE SI O NO");
String respuesta= consola.next().toUpperCase();
switch(respuesta){
        case "SI":
       suma =carta1+carta2+((int)(Math.random()*11 + 1));
      System.out.println("[X][X][X]= " + suma);
        if(suma == 21)  System.out.println("GANO!!!!!");
         else System.out.println("PERDIO!!!!!");
         break;
        case "NO":
     suma =carta1+carta2;
         System.out.println("[X][X]= " + suma);
          if(suma == 21)  System.out.println("GANO!!!!!");
         else System.out.println("PERDIO!!!!!");
        break;
       
         
               } 




}
}