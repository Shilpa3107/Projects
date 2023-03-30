import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double num1 , num2;
        char oper;
        double result = 0.0;

        System.out.print("Enter first number : ");
        num1 = sc.nextInt();
        System.out.println();

        System.out.print("Enter second number : ");
        num2 = sc.nextInt();
        System.out.println();

        System.out.println("Make sure that num2 should not be equal to 0 in case of operator '/' as it is not defined.");
        System.out.print("Enter operator (+,-,*,/) : ");
        oper = sc.next().charAt(0);
        System.out.println();

        switch(oper){
            case '+' : result = num1 + num2;
            break;

            case '-' : result = num1 - num2;
            break;

            case '*' : result = num1 * num2;
            break;

            case '/' : result = num1 / num2;
            break;

            default : System.out.println("Invalid operator");
        }
        System.out.println("Result : "+result);
    }
}
