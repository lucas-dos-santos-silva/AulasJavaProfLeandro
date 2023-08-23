
package javaapplication5;

import java.util.Scanner;


public class exercicio8 {
  
    
    public static void main(String[] args) {
        exibirMenu();
    }
    public static void exibirMenu(){
        System.out.println("Qual forma deseja calcular?");
        System.out.println("1.|Quadrado\n2.|Circulo\n3.|Triangulo\n4.|Sair");
        Scanner Input = new Scanner(System.in);
        int Opcao = Input.nextInt();
        Menu(Opcao);
    }
    public static void Menu2(int forma){
        System.out.println("1.|Calcular outra forma\n2.|Recalcular essa forma\n3.|Sair");
        Scanner Menu1 = new Scanner(System.in);
        int Opcao1 = Menu1.nextInt();
            switch(Opcao1){
                case 1: exibirMenu();
                    break;
                case 2:
                    if(forma == 1){
                        Quadrado();
                        }else if(forma == 2){
                            Circulo();
                            }else{
                                Triangulo();
                                };
                    break;
                case 3: System.out.close();
                    break;
                default:System.out.println("Nenhuma das opcoes");
                    break;
            }
    }
    public static void Menu(int Opcao){
        switch(Opcao){
            case 1: Quadrado();
                break;
            case 2: Circulo();
                break;
            case 3: Triangulo();
                break;
            case 4: System.out.println("Até mais");System.out.close();
            default : System.out.println("Nenhuma das opcoes");
                break;
            }
    }
    public static void Quadrado(){
        System.out.println("Calculo do Quadrado");
        System.out.println("Digite o valor de um lado");
        Scanner InputC = new Scanner(System.in);
            double Lado = InputC.nextInt();
        System.out.println("Digite o valor de outro lado");
        Scanner Input2 = new Scanner(System.in);
            double Lado2 = Input2.nextInt();
        System.out.println("Area do Quadrado é: " + Lado * Lado2 + "\n");
            Menu2(1);
    }
     public static void Circulo(){
        System.out.println("Calculo do Circulo");
        System.out.println("Digite o valor do raio");
        Scanner InputC = new Scanner(System.in);
            double Raio = InputC.nextInt();
        System.out.println("Area do Circulo é: " + 3.14 *(Raio * Raio) + "\n");
            Menu2(2);
    }
     public static void Triangulo(){
        System.out.println("Calculo do Triangulo");
        System.out.println("Digite o valor da base");
        Scanner InputC = new Scanner(System.in);
            double Base = InputC.nextInt();
        System.out.println("Digite o valor da altura");
        Scanner Input2 = new Scanner(System.in);
            double Altura = Input2.nextInt();
        System.out.println("Area do Triangulo é: " + (Base * Altura) / 2 + "\n");
            Menu2(3);
    }
                
}
