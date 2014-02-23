
public class Palindromo{   

   public static void main(String[] args) {
   		String palabra;
                int cont,i;



 for (i=0;i<=(args.length-1);i++){
 palabra = args[i].toString();
 int n =palabra.length();
       for (cont =0;cont<=(n/2);cont++)  {
             if ((palabra.charAt(cont))==(palabra.charAt(n-1-cont))){}
                  else{
                       cont = n;
                       System.out.println(palabra + "            LA PALABRA NO ES PALINDROMA");
                       }
                                          }
if  (cont == (n/2)+1) 
System.out.println(palabra + "                  LA PALABRA ES PALINDROMA");
                   
}

}
}