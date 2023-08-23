
package javaapplication5;

import java.util.Scanner;


public class exercicio9 {
    public static void main(String[] args) {
        System.out.println("Digite sua senha numerica");
        int Senha = 1234;
        Func2(Senha);
    }
    public static void Func2(int Senha){
        Scanner Input = new Scanner(System.in);
        int Input1 = Input.nextInt();
            if(Senha == Input1){
                System.out.println("Senha correta");
                System.out.close();
            }else{
                for(int i = 4;Senha != Input1;i--){
                    System.out.println("Senha incorreta. Tente novamente. Quantidade max("+i+")");
                    Scanner Input3 = new Scanner(System.in);
                    int Input2 = Input3.nextInt();
                        if(Senha == Input2){
                            System.out.println("Senha correta");
                            break;
                        }
                            if(i<=1){
                                System.out.println("Conta bloqueada");
                                break;   
                            }
                }
            }
    }        
}
             

        
    
        
     
   
   
   
    

