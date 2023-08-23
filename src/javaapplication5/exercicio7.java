
package javaapplication5;


public class exercicio7 {
    
    public static void main(String[] args) {
        System.out.println(verificaPrimo(9));
    }  
    public static String verificaPrimo(int num){
        int div = 0;
        for(int i = 1;i <= num;i++){
          if(num % i ==0){
              div++;
          } 
        }
          if(div == 2){
            return "primo";
          }else{
            return "não primo";
        }
    }
}
