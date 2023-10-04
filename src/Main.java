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
// Создайте шаблонный класс Матрица. Необходимо
// реализовать:
// ■ заполнение матрицы с клавиатуры;
// ■ заполнение случайными значениями;
// ■ отображение матрицы;
// ■ арифметические операции +, –, *, / по правилам работы с матрицами;
// ■ поиск максимального и минимального элемента;
// ■ подсчет среднеарифметического значения.
public class Task02{
     public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int size= scanner.nextInt();
        MyMatrix<Integer> integerMyMatrix = new MyMatrix<>(120);

        System.out.println(integerMyMatrix.toString());
       iRandom<Integer>integeriRandom = new iRandom<Integer>() {
           @Override
           public Integer random() {
               return Integer.valueOf((int) (Math.random()*120));
           }
       };

       Integer max= integerMyMatrix.maxItem(new Comparator<Integer>() {
           @Override
           public int compare(Integer o1, Integer o2) {
               return o1.compareTo(o2);
           }
       });
       System.out.println(max);
       Integer min= integerMyMatrix.searchMinItem(new Comparator<Integer>() {
           @Override
           public int compare(Integer o1, Integer o2) {
               return o1.compareTo(o2);
           }
       });
        System.out.println(min);
       Integer medium= integerMyMatrix.searchMedium(new iMedium<Integer>() {
            @Override
            public int medium(Integer integer) {
                int sum =0;
                for(int i=0; i<integer; i++){
                    sum+=integer;
                }
                return sum/integer;
            }
        });
        System.out.println(medium);

    }
}
