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
    public E arithmetic mean(){
        E [] arrays= new arrays{6,9,10,12,-20,-46, 34, -33, 17, 26};
    double average=0;
    if(arrays.length>0){
    double sum=0;
    for(int i=0; i<arrays.lenght; i++){
        sum+=arrays[i]
       }
        average = sum / arrays.length;    
    }
    return average;
}
    @Override
    public String toString() {
        return "MyArray{" + Arrays.toString(arrays) +
                '}';
    }
}

