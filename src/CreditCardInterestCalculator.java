public class CreditCardInterestCalculator {
    public static void main(String[] args) {
        double initialBalance = 5000.0;

        double monthlyInterestRate = 0.17 / 12;

        double interestAfterOneMonth = initialBalance * monthlyInterestRate;

        initialBalance += interestAfterOneMonth;

        double interestAfterTwoMonths = initialBalance * monthlyInterestRate;

        System.out.printf("Interest due after one month: $%.2f%n", interestAfterOneMonth);
        System.out.printf("Interest due after two months: $%.2f%n", interestAfterTwoMonths);
    }
}
