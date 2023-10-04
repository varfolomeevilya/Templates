import java.util.Arrays;
import java.util.Comparator;

public class MyMatrix<T>{

        T[] matrix;
        private int size;
        public MyMatrix(T[] matrix){
            this.matrix= matrix;


        }
        public MyMatrix(int size){
            matrix=(T[]) new Object[size];
        }

        public void fillMatrix(iRandom<T> iRandom){
            for(int i=0; i<size; i++){
                matrix[i]= iRandom.random();
            }

        }
        public int  plus(iOperator  ioperator){
            int  res = (int)this.matrix[0];
            for(int i =0; i<this.matrix.length; i++){
                for(int j=0; j<this.matrix.length; j++){
                    res= this.matrix.length + this.matrix.length;
                }
            }
            return res;
        }
        public void minus(iOperator ioperator){
            int res=0;
            for (int i=0; i<this.matrix.length; i++){
                for(int j=0; j<this.matrix.length; j++){
                    res = this.matrix.length + this.matrix.length;
                }
            }

        }
        public int multip(iOperator  iOperator){
            int res=0;
            for(int i=0; i<this.matrix.length; i++){
                for(int j=0; j<this.matrix.length; j++){
                    res= this.matrix.length * this.matrix.length;
                }
            }
           return res;
        }
        public int division(iOperator ioperator){
            int res=0;
            for(int i=0; i<this.matrix.length; i++){
                for(int j=0; j<this.matrix.length; j++){
                    res=this.matrix.length/this.matrix.length;
                }
            }
            return res;
        }
        public T maxItem(Comparator <T> comparator){
            T max=this.matrix[0];
            for(int i=0; i<size; i++){
                if(comparator.compare(max, this.matrix[i])>0){
                    max=this.matrix[i];
                }
            }
            return max;
        }
        public T searchMinItem(Comparator <T> comparator){
            T min = this.matrix[0];
            for(int i=0; i<size; i++){
                if(comparator.compare(min, this.matrix[i])<0){
                    min=this.matrix[i];
                }
            }
            return min;
        }
        public int searchMedium(iMedium <T> imedium) {
            int sum = 0;
            for(int i=0; i<this.matrix.length; i++){
                sum+= imedium.medium(this.matrix[i]);
            }
            return sum/this.matrix.length;

        }

        @Override
        public String toString() {
            return "MyMatrix{"+ Arrays.toString(matrix)+
                    "}";

        }
}
