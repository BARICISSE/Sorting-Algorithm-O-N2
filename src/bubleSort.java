import java.util.Arrays;

public class bubleSort {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int[] arr = new int[] {17, 3, -2, 23, -5, 8, 5};
    bubbleSort(arr);
    System.out.println(Arrays.toString(arr));

  }
  public static void bubbleSort(int[] arr){
    boolean breakingLoop = false;
    int ct = 0;
    do{
      
      if(ct==arr.length -2) breakingLoop = true;
      for(int i=0; i<arr.length-ct-1; i++){
        if(arr[i] > arr[i+1]){
          int temp = arr[i];
          arr[i] = arr[i+1];
          arr[i+1] = temp;
        }
      }
      ct++;
      
    }while(breakingLoop == false);
  }

}
