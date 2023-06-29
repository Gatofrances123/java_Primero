
public class For_each {
    public static void main(String[] args) {
        String[] nombres = {"Juan","Pablo","Quintero","Casaidego"};
        
        int c = 0;
        
        while(c< nombres.length){
            System.out.println(nombres[c]);
            
            c++; 
        }
        
        for(int i=0; i< nombres.length; i++){
            System.out.println(nombres[i]);
        }
    }
}
