package guru.springframework;

public interface Expression {
    Expression times(int multiplier);

    Money reduce(Bank bank, String to);

    Expression plus(Expression addend);
}
