

import java.util.Scanner;

public class Calculator {
    private Scanner myScanner = new Scanner(System.in);
    private int value1;
    private int value2;
    private String operation = null;

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
                System.out.println(plus(value1, value2));
                break;
            case "-":
                System.out.println(minus(value1, value2));
                break;
            case "*":
                System.out.println(multiplication(value1, value2));
                break;
            case "/":
                System.out.println(division(value1, value2));
                break;
        }
    }

    private int plus(int x, int y) {
        return x + y;
    }

    private int minus(int x, int y) {
        return x - y;
    }

    private int multiplication(int x, int y) {
        return x * y;
    }

    private int division(int x, int y) {
        return x / y;
    }
}

