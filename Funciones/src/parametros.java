public class parametros {
    public static void main(String[] args) {
        //digitamos a y b
        sumar(10 ,5);
        saludar("juan" , 26);
        
        
        //Retorno
       var retornar = retornar(5 , 5);
        System.out.println("el retorno se vuelve a ejecutar " + retornar);
        //Fin retorno
        
        //Retorno2
        var retorno2 = retorno2("juan pablo" , 26);
        System.out.println("su nombre y edad es: " + retorno2);
        //Fin retorno2
    }
    //funcion 1
     static void saludar(String nombre , int edad){
         System.out.printf("mi nombre es %s y mi edad es %d\n" , nombre , edad);
    }
     
     //funcion 2 
     //Podemos definir las variables dentro del ()
     static void sumar(int a , int b){
         int  sumar= a + b;
         
         System.out.println("la suma es " + sumar);
     }
     
     //funcion  con retur 3
     /*Primero para retornar un valor a o b vamos a camobiar el voir por el tipo 
     de dato que queremos retornar*/
     static int retornar(int a , int b ){
         /*y seguido de eso ponemos return para retornar el  valor correspondiente */
         return a+b; 
         
     }
     
     static String retorno2(String nombre , int edad){
         return  nombre + " " + edad; 
     }
}

