
package javaapplication5;

public class exercicio4 {
    public static void main(String[] args) {
        
        System.out.println(ClasseAleatoria(-1) == "N");
        System.out.println(ClasseAleatoria(1) == "P");
        System.out.println(ClasseAleatoria(0) == "P");
    }
    public static String ClasseAleatoria(int Valor){
        return Valor <= 0 ? "N" : "P";//if ternario;
//        if(Valor < 0){
//            return "N";
//        }
//           return "P";
//        }
    
}
}
