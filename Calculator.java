import java.util.Scanner;
class CannotDivideByZeroException extends Exception{
    public CannotDivideByZeroException(){}
}
class NotAValidOperatorException extends Exception{
    public NotAValidOperatorException(){}
}

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Enter First number");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        String op = sc.next();
        int num2 = sc.nextInt();
        try {
            System.out.println(
                    Cal(num1, op, num2));
        } catch (CannotDivideByZeroException e) {
            System.out.println("Cannot divide by zero");
        } catch (NotAValidOperatorException e) {
            System.out.println("Not a valid operator");
        }
        sc.close();
    }
    public static int Cal(int num1,String op, int num2) throws CannotDivideByZeroException, NotAValidOperatorException {
        switch(op){
            case "+" -> {
                return (num1+num2);
            }
            case "-" -> {
                return(num1-num2);
            }
            case "X" -> {
                return(num1*num2);
            }
            case "/" -> {if(num2!=0){return(num1/num2);
            }else{throw new CannotDivideByZeroException();}}
            default -> throw new NotAValidOperatorException();
        }
    }
}
