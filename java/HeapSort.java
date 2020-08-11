public class HeapSort{
  public static void heapSort(int[] array){
      int n = array.length;

      for(int i = n / 2 - 1; i >= 0; i--)
        heapify(array, n, i);

      for (int i=n-1; i>0; i--){
        int tmp = array[0];
        array[0] = array[i];
        array[i] = tmp;

        heapify(array, i, 0);
      }
  }
  public static void heapify(int[] array, int n, int i){
    int largest = i;
    int left = 2 * i + 1;
    int right = 2 * i + 2;

    if(left < n && array[left] > array[largest])  // left child larger than root?
      largest = left;

    if (right < n && array[right] > array[largest]) // right child larger than largest so far?
      largest = right;

    if (largest != i){  // largest is not root?
      int tmp = array[i];
      array[i] = array[largest];
      array[largest] = tmp;

      heapify(array, n, largest); // recursively heapify the affected sub-tree
    }
  }

  public static void main(String[] args){
    int[] array = {9,3,2,14,5,6,8,9,32};

    System.out.println("Before heap sort");
    for(int i: array){
      System.out.print(i + " ");
    }

    System.out.println("");
    heapSort(array); 	// sort the array

    System.out.println("After heap sort");

    for(int i:array){
      System.out.print(i + " ");
    }
  }
}
