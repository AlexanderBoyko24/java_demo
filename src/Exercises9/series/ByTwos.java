package Exercises9.series;

// Реализация интерфейса Series
public class ByTwos implements Series { //Реаnизует интерфейс Series
    int start;
    int val;
    int prev;

    ByTwos() {
        start = 0;
        val = 0;
        prev = -2;
    }

    public int getNext() {
        prev = val;
        val += 2;
        return val;
    }

    @Override
    public void reset() {
        start = 0;
        val = 0;
        prev = -2;
    }

    @Override
    public void setStart(int x) {
        start = x;
        val = x;
        prev = x-2;
    }

    int getPrevious(){ //Добоменне метода, не объ1вnенноrо в интерфейсе Series
        return prev;
    }
}
//мы можем менять реализацию методов как угодно, интерфейс при этом не изменится, поскольку изменения не видны за пределами класса
