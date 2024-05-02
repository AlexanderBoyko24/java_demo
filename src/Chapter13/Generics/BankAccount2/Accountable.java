package Chapter13.Generics.BankAccount;

public interface Accountable<T> {
    T getId();
    int getSum();
    void setSum(int sum);
}
