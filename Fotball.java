
public class Fotball{   

   public static void main(String[] args) {


Double velocidai=Double.parseDouble(args[0]);
Double angulo =Double.parseDouble(args[1]);
Double tiempo =((velocidai*Math.sin(angulo))/4.9);
Double distancia=(tiempo*velocidai*Math.cos(angulo));
System.out.println("EL TIEMPO DE VUELO ES   " + tiempo + "  segundos" );
System.out.println("EL ALCANCE MAXIMO  ES   " + distancia + "  metros") ;



}
}