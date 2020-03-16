import java.util.Scanner;

public class Cli {
    private Scanner myScanner = new Scanner(System.in);
    private Calculator calculator;
    private int value1;
    private int value2;
    private String operation = null;

    public Cli(Calculator calc){
        calculator = calc;
    }

    public void start() {
        requestFirstNumber();
        requestOperation();
        requestSecondNumber();
        calculate(value1, value2, operation);
    }

    private void requestFirstNumber() {
        System.out.println("Type first number:");
        value1 = myScanner.nextInt();
    }

    private void requestSecondNumber() {
        System.out.println("Type second number:");
        value2 = myScanner.nextInt();
    }

    private void requestOperation() {
        while (operation == null) {
            System.out.println("Type operation: ");
            String input = myScanner.next();
            if (input.equals("+") || input.equals("-") || input.equals("*") || input.equals("/")) {
                operation = input;
            } else {
                System.out.println("Incorrect operation. Try again!");
            }
        }
    }

    private void calculate(int value1, int value2, String operation) {
        switch (operation) {
            case "+":
                System.out.println(calculator.plus(value1, value2));
                break;
            case "-":
                System.out.println(calculator.minus(value1, value2));
                break;
            case "*":
                System.out.println(calculator.multiplication(value1, value2));
                break;
            case "/":
                System.out.println(calculator.division(value1, value2));
                break;
        }
    }
}
