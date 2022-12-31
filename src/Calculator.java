import java.util.function.*;

public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;

    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;

    //    Обработка ошибки деления на 0
    BinaryOperator<Integer> devide = (x, y) -> {
        if (y != 0) {
            return x / y;
        } else {
            System.out.println("Произошла попытка деления на 0! Проверьте данные!");
            return y;
        }
    };

    //    Использование тернарного оператора:
//    BinaryOperator<Integer> devide = (x, y) -> y != 0 ? x / y : 0;
    UnaryOperator<Integer> pow = (x) -> x * x;
    UnaryOperator<Integer> abs = (x) -> x > 0 ? x : x * -1;

    Predicate<Integer> isPositiv = (x) -> x > 0;

    Consumer<Integer> println = System.out::println;
}
