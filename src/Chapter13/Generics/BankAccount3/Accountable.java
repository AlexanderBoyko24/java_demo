package Chapter13.Generics.BankAccount3;

public interface Accountable<T> {
    T getId();
    int getSum();
    void setSum(int sum);
}
