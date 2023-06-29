
import java.util.Scanner;


public class TablaMultiplicacion {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("INgrese un numero para que sea multiplicado");
       int n = leer.nextInt();
       
       //Vamos a crear un contador 
       
       int i =0;
       while(i<=10){
           System.out.printf("| %d * %d = %d |\n" , n , i , (n * i));
       i++;
       }
    }
    
}
