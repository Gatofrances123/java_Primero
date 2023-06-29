
import java.util.Scanner;

public class CondicionesAnidadas {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //System.out.println("ingrese un numero");
        
        
        /*1. declaramos la variable n */
        int n = leer.nextInt();
        //System.out.printf("Su numero es %d\n",n);
        
        /*2. si n no es 0 entonces que inicie el proceso */
        //con elprimer if decimos si el valor es neutro o no
    if(n !=0){
    //Vamos a decir si es positivo o no 
    if(n > 0){
    //vamos a decir si es par o no 
    if(n %2 ==0){
        
    // POSITIVOS 
    System.out.printf("El valor %d es  positivo\n",n);
    System.out.printf("El valor %d es par \n",n);
    }else{
       // FIN POSITIVOS 
    System.out.printf("El valor %d es positivo\n",n);
     System.out.printf("El valor %d es impar\n",n);
    } }else{
        if(n %2 ==0){
        
    //NEGATIVOS
    System.out.printf(    "El valor %d     es par \n",n);
        System.out.printf("El valor %d es  negativo\n",n);
    }else{
     // FIN NEGATIVOS
    System.out.printf("El valor %d es impar\n",n);
     System.out.printf("El valor %d es negativo\n",n);
    }}
    
    
 
    //vamos a decir que e valor no es 0  FIN if(n !=0)
    System.out.printf("el valor %d no es neutro\n" , n);
    } else {
    System.out.printf("el valor %d es neutro\n" , n);
    }            
  }
    
}
