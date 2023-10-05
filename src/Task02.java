import java.util.Comparator;
import java.util.Scanner;

public class Task02 {
    Scanner scanner = new Scanner(System.in);
    int size = scanner.nextInt();
    MyMatrix<Integer> integerMyMatrix = new MyMatrix<>(120);

    iRandom<Integer> integeriRandom = new iRandom<Integer>() {
        @Override
        public Integer random() {
            return Integer.valueOf((int) (Math.random() * size));
        }
    };
    integerMyMatrix.fillMatrix(integeriRandom);
    System.out.println(integerMyMatrix)



    Integer max = integerMyMatrix.maxItem(new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o1.compareTo(o2);
        }

    });

    Integer min = integerMyMatrix.searchMinItem(new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o1.compareTo(o2);
        }
    });

    Integer medium = integerMyMatrix.searchMedium(new iMedium<Integer>() {
        @Override
        public int medium(Integer integer) {
            int sum = 0;
            for (int i = 0; i < integer; i++) {
                sum += integer;
            }
            return sum / integer;
        }
    });
     Integer plus = integerMatrix. plus(new iOperator<Integer>(){
         @Override
             public int plus (Integer integer){
                 int res=0;
                 for(int i=0; i< integer; i++){
                     for(int j =0; j<integer; j++){
                         res = integer + integer;
                     }
                 }
                 return res;
             }
     });
     Integer minus = integerMyMatrix.minus(new iOperator<Integer>(){
         @Override
         public int minus(Integer integer){
             int res=0;
             for(int i=0; i< integer; i++){
                 for(int j=0; j<integer; j++){
                     res = integer - integer;
                 }
             }
             return res;
         }
     });
     Integer multip = integerMyMatrix.multip(new iOperator <Integer>(){
         @Override
         public int multip(Integer integer){
             int res=0;
             for(int i=0; i< integer; i++){
                 for(int j=0; j<integer; j++){
                     res = integer * integer;
                 }
             }
             return res;
         }
     });
     Integer division = integerMyMatrix.division(new iOperator<Integer>(){
         @Override
         public int division(Integer integer){
             int res=0;
             for(int i=0; i<integer; i++){
                 for(int j=0; j<integer; j++){
                     res = integer / integer;
                 }
             }
             return res;
         }
     });
}

