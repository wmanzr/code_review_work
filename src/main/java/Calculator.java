public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    public int dif(int a, int b) {
        return a - b;
    }
    public int div(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return a / b;
    }
    public int times(int a, int b) {
        return a * b;
    }
    public int solver() {
        int result = add(-20, div(times(dif(30, 10), 3), 5));
        return result;
    }
}
