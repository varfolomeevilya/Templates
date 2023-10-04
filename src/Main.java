import java.util.Scanner;
import java.util.Comparator;
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
       Integer min = integer.searchMinItem( new Comparator<Integer>{
           public int compare(Integer o1, Integer o2){
               return o1.compareTo(o2);
           }
       });
        System.out.println(min)
        String medium= String.valueOf(new Medium<String>() {
            @Override
            public int medium(String s){
                int sum=0;
                for(int i=0; i< s.length();i++){
                    sum+= s.charAt(i);
                }
                return sum/s.length();
            }
        });
        System.out.println(medium);
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
        Integer searchBinarn= integerMyArray.searchMinItem(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(searchBinarn);
//       Integer j =integerMyArray.replacingValue(3, 10){
//
//
//        }
    }


}

