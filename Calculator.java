import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        System.out.println("Enter First number");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        String op = sc.next();
        int num2 = sc.nextInt();
        switch(op){
            case "+" -> System.out.println(num1+num2);
            case "-" -> System.out.println(num1-num2);
            case "X" -> System.out.println(num1*num2);
            case "/" -> {if(num2!=0){System.out.println(num1/num2);
            }else{System.out.println("Cannot be divided by 0");}}
            default -> System.out.println("Input a Valid Operator");
        }
        sc.close();
    }
}
