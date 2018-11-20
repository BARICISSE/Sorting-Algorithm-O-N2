import java.util.Arrays;

//This in place but its still O(N^2)
public class selectionSorting {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int[] arr = new int[] {17, 3, -2, 23, -5, 8, 5};
    SelectionSort(arr);
    System.out.println(Arrays.toString(arr));
  }
  
  public static void SelectionSort(int[] arr){
   for(int i = 0; i<arr.length -1; i++){
         int index = i;
         int minValue = arr[index];
     for(int k=index; k<arr.length; k++){
       if(arr[k]< minValue){
         index = k; 
         minValue = arr[k];
       }
     }
     if(index != i){
       int temp = arr[i];
       arr[i] = minValue;
       arr[index] = temp;
     }
     
   }
  }
  

}
