import java.util.Scanner;
//Необходимо реализовать:
//        ■ заполнение массива с клавиатуры;
//        ■ заполнение массива случайными числами;
//        ■ отображение массива;
//        ■ поиск максимального значения;
//        ■ поиск минимального значения;
//        ■ подсчет среднеарифметического значения;
//        ■ сортировка массива по возрастанию;
//        ■ сортировка массива по убыванию;
//        ■ поиск значения в массиве, используя бинарный поиск;
//        ■ замена значения в массиве на новое значение.

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длина массива:");
        int size= scanner.nextInt();
        MyArray<Integer> integerMyArray = new MyArray<>(100);
//        Medium<Integer> integerMedium = new Medium<Integer>() {
//            @Override
//            public int medium(Integer integer) {
//
//            }
//        }
        HandlerArray<Integer> integerHandlerArray = new HandlerArray<Integer>() {
            @Override
            public Integer randomObject() {
                return Integer.valueOf((int) (Math.random() * 100));
            }
        };
        integerMyArray.fillArrays(integerHandlerArray);
        integerMyArray.searchBinarn(3);
        integerMyArray.replacingValue(3, 10);
        System.out.println(integerMyArray);
        Integer i = integerMyArray.maxItem(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(i);

    }


    }
}
