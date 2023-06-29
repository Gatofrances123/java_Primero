public class SobrecargaFunciones {
    public static void main(String[] args) {
      //Retorno sumar
        //System.out.println(sumar(75 , 80));
        //Fin retorno
        
        //cuenta regresiva con parametro de llamada 10
      cuenta_Regresiva(10);
       Cuenta_regresiva2(); 
        
    }
    //funciones recursivas
    static void cuenta_Regresiva(int numero){
        numero --;
        if(numero > 0){
            System.out.println(numero);
            //Vamos a decirle que se ejecute la misma funcion hasta llegar a 0
            cuenta_Regresiva(numero);
        }else{
            System.out.println("Llego hasta 0");
        }
    }
    
    static void Cuenta_regresiva2(){
    for (int numero = 9 ; numero>=0 ; numero--){
    System.out.println(numero);
       
}
}
    
    
 
    //enteros
    static int sumar(int a , int b){
        return a+b;
    }
    //decimales
   static double sumar(double a , double b){
       return a+b; 
   }
    
    
}
