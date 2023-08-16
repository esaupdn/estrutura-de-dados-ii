#include <stdio.h> 
	void bubbleSort(int arr[], int n) {
	int troca;
		for(int i=0; i <n-1; i++){ 
			troca = 0;
		for (int j = 0; j < n - i - 1; j++) {
			if (arr[j] > arr[j + 1]){ 
			int temp = arr[j]; 
				arr[j] = arr[j + 1];
				arr[j + 1] = temp; 
				troca = 1;
 	}
 } 
	if (troca == 0) {
     	break;
	 	}
      } 
	} 
	int main() { 
	int arr[] = {64, 34, 25, 12, 22, 11, 90};
	int n = sizeof(arr) / sizeof(arr[0]);
       printf("Vetor antes da ordenacao:\n"); 
       for (int i = 0; i < n; i++) { 
 	printf("%d ", arr[i]);
 	}
       bubbleSort(arr, n); 
		printf("\nVetor apos a ordenacao:\n"); 
		for (int i = 0; i < n; i++) {
      printf("%d ", arr[i]);
 	}
	return 0; 
}
	
