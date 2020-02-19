public class SelectionSort{
  public static void selectionSort(int array[]){
    int n = array.length;

    for (int i = 0; i < n - 1; i++){
      int min_index = i;
      for (int j = i +1; j < n; j++)
        if (array[j] < array[min_index])
          min_index = j;

      int temp = array[min_index];
      array[min_index] = array[i];
      array[i] = temp;
    }
  }

  public static void main(String args[]){
    int[] array = {64,25,12,22,11,2,76,24,22};

    System.out.println("Before selection sort");
    for(int i: array){
      System.out.print(i + " ");
    }

    System.out.println("");
    selectionSort(array); //sort the array

    System.out.println("After selection sort");
    for(int i: array){
      System.out.print(i + " ");
    }
  }
}
