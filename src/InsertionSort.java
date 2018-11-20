import java.util.Arrays;

public class InsertionSort {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int[] arr = new int[] {17, 3, -2, 23, -5, 8, 5};
    insertionSort(arr);
    System.out.println(Arrays.toString(arr));
  }
  public static void insertionSort(int[] arr){
    for(int k=1; k<arr.length; k++){
      int elementK = arr[k];
      int i =k;
     
      while(i>0 && elementK <arr[i-1]){
        arr[i] = arr[i-1];
        i = i-1;
      }
      
      arr[i] = elementK;
    
    }
  }
}
