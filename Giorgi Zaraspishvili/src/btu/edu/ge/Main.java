package btu.edu.ge;
import btu.edu.ge.im.CalculatorServiceImpl;


public class Main {
     public static void main(String[] args) {
        CalculatorService calculator = new CalculatorServiceImpl();
            int x = calculator.divide(10, 2);
            System.out.println(x);
        }
}

