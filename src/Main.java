public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        System.out.println("   Сложение:");
        int a = calc.plus.apply(1, 2);
        calc.println.accept(a);

        System.out.println("   Вычитание:");
        int b = calc.minus.apply(1, 1);
        calc.println.accept(b);

        System.out.println("   Деление:");
//     Предотвращение остановки работы программы в случае деления на 0.
        try {
            int c = calc.devide.apply(a, b);
            calc.println.accept(c);
        } catch (RuntimeException e) {
            System.out.println("Произошла попытка деления на 0! Проверьте данные.");
        }

        System.out.println("   Умножение:");
        int m = calc.multiply.apply(3, 7);
        calc.println.accept(m);

        System.out.println("   Возведение в квадрат:");
        int square = calc.pow.apply(16);
        calc.println.accept(square);

        System.out.println("   Получение абсолютного значения:");
        int absN = calc.abs.apply(-13);
        calc.println.accept(absN);

        System.out.println("   Определение положительности числа:");
        boolean isPos = calc.isPositiv.test(-13);
        System.out.println(isPos);
    }
}