package HW;
//1. Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы: sum(), multiply(),
//   divide(), subtract(). Параметры этих методов – два числа разного типа (но необязательно разного между собой),
//   над которыми должна быть произведена операция.

public class Calculator {
    public static <A extends Number, B extends Number> double sum(A a, B b){
        return a.doubleValue() + b.doubleValue();
    }
    public static <A extends Number, B extends Number> double multiply(A a, B b){
        return a.doubleValue() * b.doubleValue();
    }
    public static <A extends Number, B extends Number> double subtract(A a, B b){
        return a.doubleValue() - b.doubleValue();
    }
    public static <A extends Number, B extends Number> double divide(A a, B b){
        return a.doubleValue() / b.doubleValue();
    }
}