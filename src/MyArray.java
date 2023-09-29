import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class MyArray<E> {

    private E[] arrays;
    private int position;
    private int size;

    public MyArray(){
        this.arrays=arrays;
        this.position=0;
    }
    public MyArray(E[] arrays, int position){
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
   public E minItem(Comparator<E> comparator){
       E min = this.arrays[0];
       for(int i=0; i<size; i++){
           if(comparator.compare(min, this.arrays[i])<0){
               min=this.arrays;
           }
       }
       return min;
   }
   public int searchariMedium(Medium<E> medium) {
        int sum = 0;
        for(int i=0; i<this.arrays.length; i++){
            sum+= medium.medium((E) this.arrays);
        }
        return sum/ this.arrays.length;

    }
     public int searcharMedium(Medium<E> medium) {
        int sum = 0;
        for(int i=0; i<this.arrays.length; i++){
            sum+= medium.medium((E) this.arrays);
        }
        return sum/ this.arrays.length;

    }
    
}
    @Override
    public String toString() {
        return "MyArray{" + Arrays.toString(arrays) +
                '}';
    }
}

