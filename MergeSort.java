package recursion2;

public class MergeSort {
	 public static void mergeSort(int arr[] , int sI , int eI) {
		if(sI >= eI) {
			return;
		}
		int mid=(sI + eI)/2;
		
		mergeSort(arr , sI , mid);
		mergeSort(arr , mid + 1 , eI);
		merge(arr , sI ,eI);
		
	}
	
	private static void merge(int arr[],int sI , int eI) {
		int mid = (sI + eI)/2;
		
		int ans[] = new int [eI - sI + 1];
		int i = sI;
		int j = mid + 1;
		int k = 0;
		while(i <= mid && j<= eI ) {
			if(arr[i] < arr[j]) {
				ans[k] = arr[i];
				i++;
				k++;
			}
			
			else {
				ans[k] = arr[j];
				k++;
				j++;
			}
		}
		
		while(i <= mid) {
			ans[k] = arr[i];
			i++;
			k++;
		}
		
		while(j <= eI) {
			ans[k] = arr[j];
			k++;
			j++;
		}
		
		for(int index = 0; index < ans.length; index++) {
			arr[sI + index] = ans[index];
		}
	}
	 public static void mergeSort(int arr[]){
	        mergeSort(arr,0,arr.length-1);
	    }

	public static void main(String[] args) {
		int arr[] = {1,4,2,0,7,2};
		mergeSort(arr,0,arr.length - 1);
		for(int i = 0 ; i <arr.length ; i++) {
			System.out.println(arr[i] + " ");
		}

	}

}
