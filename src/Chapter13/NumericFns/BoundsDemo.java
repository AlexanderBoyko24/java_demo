package Chapter13.NumericFns;

public class BoundsDemo {
    public static void main(String[] args) {
        NumericFns<Integer> iOb = new NumericFns<Integer>(5);

        System.out.println("reverse value iOb - " + iOb.reciprocal());
        System.out.println("doublwe value iOb - " + iOb.fraction());
        System.out.println();

                NumericFns<Double> dOb = new NumericFns<Double>(5.24);
        System.out.println("reverse value iOb - " + iOb.reciprocal());
        System.out.println("doublwe value iOb - " + iOb.fraction());
        System.out.println();

       //! Следующая строка кода не будет компилироваться, так как
// класс String не является производным от класса NurnЬer.
// NumericFns<String> strOb = new NumericFns<String>("Oшибкa")
    }
}
