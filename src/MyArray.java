import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class MyArray<E> {

    private E[] arrays;
    private int size;

    public MyArray(){
        this.arrays=arrays;
    
    }
    public MyArray(E[] arrays){
       this.arrays= arrays;
       this.position=position;

    }
    public MyArray(int size){
        arrays=(E[]) new Object[size];
    }

   public void fillArrays(HandlerArray<E> handlerArray){
      for(int i=0; i<size; i++){
          arrays[i]= handlerArray.randomObject();
      }

   }
   public E maxItem(Comparator<E> comparator){
        E max=this.arrays[0];
      for(int i=0; i<size; i++){
          if(comparator.compare(max, this.arrays[i])<0){
              max=this.arrays[i];
          }
      }
      return max;
   }
    public E searchMinItem(Comparator<E> comparator){
        E min= this.arrays[0];
        for(int i=0; i<size; i++){
            if(comparator.compare(min, this.arrays[i])<0){
                min=this.arrays[i];
            }
        }
        return min;
   }
     public int searchMedium(Medium<E> medium) {
        int sum = 0;
        for(int i=0; i<this.arrays.length; i++){
            sum+= medium.medium((E) this.arrays);
        }
        return sum/ this.arrays.length;

    }
      public void sort(Comparator comparator){
        Arrays.sort(arrays);

    }
    public void sortMax(Comparator<E> comparator){
        Arrays.sort(arrays, Collections.reverseOrder());
    }
    public void searchBinarn(E  search){
        Arrays.sort(arrays);
        int index= Arrays.binarySearch(arrays, search);
    }
    public void  replacingValue(E search, E replacing ){
        for(int i=0; i<arrays.length; i++){
            if(arrays[i].equals(search)){
                arrays[i]= replacing;
            }
        }
    }

    @Override
    public String toString() {
        return "MyArray{" + Arrays.toString(arrays) +
                '}';
    }
}

