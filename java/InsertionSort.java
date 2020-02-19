public class InsertionSort{
  public static void insertionSort(int array[]){
    int n = array.length;

    for (int j = 1; j < n; j++){
      int key = array[j];
      int i = j - 1;
      while ((i > -1) && (array[i] > key)){
        array [i+1] = array [i];
        i--;
      } array[i+1] = key;
    }
  }

  public static void main(String[] args){
    int[] array = {9,3,2,14,5,6,8,9,32};

    System.out.println("Before insertion sort");
    for(int i: array){
      System.out.print(i + " ");
    }

    System.out.println("");
    insertionSort(array); //sort the array

    System.out.println("After insertion sort");

    for(int i:array){
      System.out.print(i + " ");
    }
  }
}
