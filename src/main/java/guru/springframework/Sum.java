package guru.springframework;

public class Sum implements Expression{
    final Expression augmend;
    final Expression addend;

    public Sum(Expression augmend, Expression addmends) {
        this.augmend = augmend;
        this.addend = addmends;
    }

    @Override
    public Expression times(int multiplier) {
        return new Sum(augmend.times(multiplier),addend.times(multiplier));
    }

    @Override
    public Money reduce(Bank bank, String to){
        int amount = augmend.reduce(bank,to).amount + addend.reduce(bank, to).amount;
        return new Money(amount,to);
    }

    @Override
    public Expression plus(Expression addend) {
        return new Sum(this, addend);
    }
}
