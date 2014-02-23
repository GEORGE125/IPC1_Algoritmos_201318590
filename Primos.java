
public class Primos{   

   public static void main(String[] args) {
    
int cont;
int numero=Integer.parseInt(args[0]);

switch(numero){
        case 1:
        System.out.println("NO HAY PRIMOS ANTESESORES");
        System.out.println("1");
        break;
        case 2:
        System.out.println("NO HAY PRIMOS ANTESESORES");
        System.out.println("2");
        break;
        default:
           System.out.println("2");
           for (cont=3;cont<numero;cont++){
                if (((Math.pow(2,cont-1))%cont)==1) System.out.println(cont);
                                         }
            System.out.println(numero);  
               }

}
}