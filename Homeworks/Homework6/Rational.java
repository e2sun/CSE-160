//Evelyn Sun
//115417946
import java.util.Scanner;

public class Rational {
    private int numerator;
    private int denominator;

    public Rational(int n, int d) {
        numerator = n;
        denominator = d;
    }

    public Rational() {
        numerator = 0;
        denominator = 1;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public Rational add(Rational r) {
        int num = (numerator * r.getDenominator()) + (r.getNumerator() * denominator);
        int denom = denominator * r.getDenominator();
        return new Rational(num, denom);
    }

    public Rational subtract(Rational r) {
        int num = (numerator * r.getDenominator()) - (r.getNumerator() * denominator);
        int denom = denominator * r.getDenominator();
        return new Rational(num, denom);
    }

    public Rational multiply(Rational r) {
        int num = numerator * r.getNumerator();
        int denom = denominator * r.getDenominator();
        return new Rational(num, denom);
    }

    public Rational divide(Rational r) {
        int num = numerator * r.getDenominator();
        int denom = denominator * r.getNumerator();
        return new Rational(num, denom);
    }

    public int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }

    public void simplify() {
        int gcd = findGCD(numerator, denominator);
        numerator = numerator / gcd;
        denominator = denominator / gcd;
    }

    public void print() {
        simplify();
        System.out.print(numerator + "/" + denominator);
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter numerator for the first rational number: ");
        int n1 = kb.nextInt();
        System.out.print("Enter a non-zero denominator for the first rational number: ");
        int d1 = kb.nextInt();

        System.out.print("Enter numerator for the second rational number: ");
        int n2 = kb.nextInt();
        System.out.print("Enter a non-zero denominator for the second rational number: ");
        int d2 = kb.nextInt();

        Rational one = new Rational(n1, d1);
        Rational two = new Rational(n2, d2);

        System.out.print("First rational number is: ");
        one.print();
        System.out.println();
        System.out.print("Second rational number is: ");
        two.print();
        System.out.println();
        System.out.print("Addition of the rational numbers is ");
        one.add(two).print();
        System.out.println();
        System.out.print("Subtraction of the rational numbers is ");
        one.subtract(two).print();
        System.out.println();
        System.out.print("Multiplication of the rational numbers is ");
        one.multiply(two).print();
        System.out.println();
        System.out.print("Division of the rational numbers is ");
        one.divide(two).print();
        kb.close();

     
    }
}
