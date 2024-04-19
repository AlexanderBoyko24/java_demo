package Exercises9.series;

public class ByThrees2 implements Series{
    int start;
    int val;

    ByThrees2() {
        start = 0;
        val = 0;
    }

    @Override
    public int getNext() {
        val += 3;
        return val;
    }

    @Override
    public void reset() {
        start = 0;
        val = 0;
    }

    @Override
    public void setStart(int x) {
        start = x;
        val = x;
    }
}

