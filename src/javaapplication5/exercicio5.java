
package javaapplication5;


public class exercicio5 {
    public static void main(String[] args) {
        //Conversao de C para Fh
        double C = 32;
        double CvFhr = (C * 9/5) + 32;
        System.out.println("Celsius para Fahrenheit:" + C + " Fh: " + CvFhr);
        
        //Conversao de Fh para C
        
        double Fh = 54;
        double CvC = (Fh - 32)* 5/9;
        System.out.println("Fahrenheit para Celsius:" + Fh + " C:" + CvC);
        
    }
 
    
    
}
