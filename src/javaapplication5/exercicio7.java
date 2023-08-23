
package javaapplication5;


public class exercicio7 {
    
    public static void main(String[] args) {
        System.out.println(verificaPrimo(28)== "Primo");
    }  
    public static String verificaPrimo(int num){
       
        for(int i = 2;i < num;i++){
         //   return num % i ==0 ? "nao primo": "";
          if(num % i == 0){
              return "nao primo";
          } 
        }
          return "Primo";
            
    }
}
