import java.util.Scanner;
public class Sumar {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese numero1: ");
        var n1 = leer.nextInt();
        System.out.println("Ingrese numero2: ");
        var n2 = leer.nextInt();
        
        var r = n1 + n2 ;
        
        //(\n): Es un salto de linea
        System.out.printf("la suma  %d + %d = %d\n" , n1, n2 ,r);
    }
}
