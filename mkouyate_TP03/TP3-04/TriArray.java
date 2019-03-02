public class TriArray {
	public static void main(String[] args){
        int[] test = {12, 1, 45, 77,16, 8, 68, 40};
        sort(test);

        for (int i = 0; i < test.length ; i++) {
        	 System.out.print(test[i] + " ");
        }
       
	}

	public static void swap(int[] arr, int index1,int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}

	public static int indexOfMin(int[] arr, int begin, int end){
		int minInt = arr[begin];
		int minIndex = begin;

		for (int i = begin; i < arr.length && i < end; i++){
			if (arr[i] < arr[minIndex]) { minIndex = i; }
		}
		return minIndex;
	}

	public static void sort (int[] arr){
		for (int i = 0 ; i < arr.length ; i++){
			swap(arr, i, indexOfMin(arr, i,arr.length));
		}
	} 
}