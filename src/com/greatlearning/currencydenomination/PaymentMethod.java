package com.greatlearning.currencydenomination;

public class PaymentMethod {
    public void paymentApproach(int arr[], int amount) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= amount) {
                int multiple = amount / arr[i];
                System.out.println(arr[i] + " : " + multiple);
                amount = amount - (arr[i] * multiple);
            }
        }
    }

    public void mergeSort(int arr[], int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
    }

    void merge(int arr[], int start, int mid, int end) {
        int i, j, k;
        int n1 = mid - start + 1;
        int n2 = end - mid;

        // temporary Arrays
        int LeftArray[] = new int[n1];
        int RightArray[] = new int[n2];

        //copy data to temp arrays
        for (i = 0; i < n1; i++)
            LeftArray[i] = arr[start + i];
        for (j = 0; j < n2; j++)
            RightArray[j] = arr[mid + 1 + j];

        i = 0; //initial index of first sub-array
        j = 0; //initial index of second sub-array
        k = start;  // initial index of merged sub-array

        while (i < n1 && j < n2) {
            if (LeftArray[i] >= RightArray[j]) {
                arr[k] = LeftArray[i];
                i++;
            } else {
                arr[k] = RightArray[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = LeftArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = RightArray[j];
            j++;
            k++;
        }
    }
}
