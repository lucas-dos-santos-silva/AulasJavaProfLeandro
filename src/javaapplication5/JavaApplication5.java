
package javaapplication5;


public class JavaApplication5 {

   
    public static void main(String[] args) {
        
      double Convertido =  Conversao();
     
      System.out.println(" Valor convertido: " + Convertido);
    }
    public static double Conversao(){
        double ValorConversao = 50;
        double ValorDolar = 4.99;
        double Conta = ValorConversao / ValorDolar;
        return Conta;
        
        }

    
    
}
