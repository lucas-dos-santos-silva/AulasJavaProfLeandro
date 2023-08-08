
package javaapplication1;

import java.util.Scanner;
public class JavaApplication1 {

   
    public static void main(String[] args) {
        System.out.println("digite um numero");
        Scanner Scan = new Scanner(System.in);
        int Num = Scan.nextInt();
        
        
        
        if(Num < 0 ){
            System.out.println("Negativo");
        }else if (Num > 0){
            System.out.println("Positivo");
        }else{
            System.out.println("Zero");
        }
     
 
    }
}
    

