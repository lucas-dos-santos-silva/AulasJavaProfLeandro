
package javaapplication1;

import java.util.Scanner;
public class JavaApplication1 {

   
    public static void main(String[] args) {
      int Valor = 8;
      
      if(Valor % 3 == 0 && Valor % 5 == 0){
          System.out.println("  Multiplo de 3 e de 5");
      }else if(Valor % 5 == 0){
          System.out.println("apenas multiplo de 5");
    }else if(Valor %3 == 0){
          System.out.println("apenas multiplo de 3");
          
    }else{
          System.out.println("nao multiplo de nenhum");
    }
}
}
    

