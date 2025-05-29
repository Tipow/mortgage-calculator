import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int percent = 100;
        final int monthsInYear = 12;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter Annual Interest Rate: ");
        double annualInterestRate = scanner.nextDouble();
        double monthlyInterestRate = (annualInterestRate / percent) / monthsInYear;

        System.out.print("Enter period(Years): ");
        double period = scanner.nextDouble();
        double numberOfPayments = period * monthsInYear;

        double mortgage = principal *
                monthlyInterestRate * (Math.pow(1+monthlyInterestRate, numberOfPayments))
                /(Math.pow(1+monthlyInterestRate, numberOfPayments));

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);
    }
}