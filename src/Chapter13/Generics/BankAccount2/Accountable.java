package Chapter13.Generics.BankAccount2;

public interface Accountable<T> {
    T getId();
    int getSum();
    void setSum(int sum);
}
