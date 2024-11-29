public class Calculator {

    public int add(int a, int b){
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
    public int times(int a, int b){
        return a * b;
    }
    public int solver() {
        return dif(div(add(times(15, 2), 10), 5), 3);
    }
}