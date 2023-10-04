import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длина массива:");
        int size = scanner.nextInt();
        MyArray<Integer> integerMyArray = new MyArray<>(100);

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
        Integer min = integerMyArray.searchMinItem(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(min);
        Integer medium = integerMyArray.searchMedium(new Medium<Integer>() {
            @Override
            public int medium(Integer integer) {
                int sum = 0;
                for (int i = 0; i < integer; i++) {
//                   sum += integer[i];
                }
                return sum / integer;
            }
        });

        integerMyArray.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        integerMyArray.sortMax(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        Integer index = integerMyArray.searchMinItem(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(index);


    }


}
