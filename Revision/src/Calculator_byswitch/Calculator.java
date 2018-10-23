package Calculator_byswitch;

import java.util.Scanner;

public class Calculator {
    public static void main(String args[]) {

        double num1, num2 ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number");
        num1 = sc.nextDouble();

        System.out.print("Enter second number");
        num2 = sc.nextDouble();

        System.out.print("Enter an operator");
        char op = sc.next().charAt(0);
        sc.close();

        switch (op) {
            case '+':
               double add = num1 + num2;
                System.out.println("add="+add);
                break;

            case '-':
                double sub = num1 - num2;
                System.out.println("sub="+sub);
                break;

            case '*':
               double mul = num1 * num2;
                System.out.println("mul="+mul);
                break;

            case '/':

                double div= num1 / num2;
                System.out.println("div="+div);
                break;

            default:
                System.out.print("you have entered wrong operator");
                
        }


    }
}