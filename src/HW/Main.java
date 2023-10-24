//2. Напишите обобщенный метод compareArrays(), который принимает два массива и возвращает true, если они одинаковые,
//   и false в противном случае. Массивы могут быть любого типа данных, но должны иметь одинаковую
//   длину и содержать элементы одного типа.

public class Main {
    public static void main(String[] args) {
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
    }

}