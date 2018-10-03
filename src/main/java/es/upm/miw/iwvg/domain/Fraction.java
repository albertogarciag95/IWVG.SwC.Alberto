package es.upm.miw.iwvg.domain;

public class Fraction {

    private int numerator;

    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction() {
        this(1, 1);
    }

    public double decimal() {
        return (double) numerator / denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public Fraction multiply(Fraction fraction) {
        Fraction result = new Fraction(
                this.getNumerator() * fraction.getNumerator(),
                this.getDenominator() * fraction.getDenominator()
        );
        return result;
    }

    public Fraction divide(Fraction fraction) {
        Fraction result = new Fraction(
                this.getNumerator() * fraction.getDenominator(),
                this.getDenominator() * fraction.getNumerator()
        );
        return result;
    }

    public boolean isPropia() {
        return this.numerator < this.denominator;
    }

    public boolean isImpropia() {
        return !isPropia();
    }

    public boolean isHigherThan(Fraction fraction) {
        return this.getNumerator() / this.getDenominator() > fraction.getNumerator() / fraction.getDenominator();
    }

    public boolean isLowerThan(Fraction fraction) {
        return this.getNumerator() / this.getDenominator() < fraction.getNumerator() / fraction.getDenominator();
    }
}
