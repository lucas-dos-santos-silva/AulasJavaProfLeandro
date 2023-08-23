
package javaapplication5;

public class exercicio12 {
    public static void main(String[] args) {
        System.out.println(calculoMmc(1,3)); 
        
       
    }
    public static int calculoMmc(int a,int b){
        int c = 2;
        int r = 1;
        if (a==0 || b==0){
          return 0;
        }else{
            while(a+b!=2){
                if(a%c==0 || b%c==0){
                       r = r * c; 
                    if(a%c==0 ){
                        a = a/c;
                    }
                     if(b%c==0 ){
                        b = b/c; 
                    }
                    }
                else{
                    c++;
                }
            }
        }
    return r;
    }
}