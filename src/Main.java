public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c;

        c = calc.devide.apply(a, b); // b - не может быть нулем
        calc.println.accept(c);

    }
}