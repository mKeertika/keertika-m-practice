package lambda_prac;
@FunctionalInterface
public interface Calculator {
    int calculate(int x, int y);
}

class Main1{

    public static void main(String[] args) {
        Calculator calculator = new Calculator() {
            @Override
            public int calculate(int x, int y) {
                return x*y;
            }
        };

        Calculator multiply= (x,y)->x*y;
        int result = multiply.calculate(2,4);
        System.out.println(result);

    }
}
