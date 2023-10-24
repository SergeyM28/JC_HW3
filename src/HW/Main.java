package HW;

public class Main {
    public static void main(String[] args) {
        //Task1
        //Мой калькулятор все приводит к киту double. Это простой путь, и я получаю потерю точности преобразовании
        //пока не придумал лучшего решения
        System.out.println("Task1");
        float a = 10.15f;
        int b = 5;
        System.out.println(Calculator.sum(a, b));
        System.out.println(Calculator.subtract(a, b));
        System.out.println(Calculator.multiply(a, b));
        System.out.println(Calculator.divide(a, b));

        //Task2
        System.out.println("\nTask2");
        Integer[]arr1 = {1, 2, 3};
        Integer[]arr2 = {1, 2, 3};
        Integer[]arr3 = {1, 2, 3, 4};
        Integer[]arr4 = {11, 12, 13};
        String[]arr5 = {"1", "2", "3"};

        ArrayProcessor arrayProcessor = new ArrayProcessor();
        System.out.println(arrayProcessor.compareArrays(arr1, arr2)); //true
        System.out.println(arrayProcessor.compareArrays(arr1, arr3)); //разная длина. false
        System.out.println(arrayProcessor.compareArrays(arr1, arr4)); //разные значения. false
        System.out.println(arrayProcessor.compareArrays(arr1, arr5)); //разные типы данных. false

        //Task3
        System.out.println("\nTask3");
        Pair<Integer, String> pair = new Pair<>(1, "один");
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
        System.out.println(pair);
    }

}