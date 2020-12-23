package btu.edu.ge.im;


import btu.edu.ge.CalculatorService;

public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public int sum(int x, int y) {
        return x + y;
    }

    @Override
    public int divide(int x, int y) {
        if (y == 0)
            throw new ArithmeticException();
        return x * y;
    }

    @Override
    public int prod() {
        return 0;
    }

}
