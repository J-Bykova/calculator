

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Cli cli = new Cli(calculator);
        cli.start();

    }
}
