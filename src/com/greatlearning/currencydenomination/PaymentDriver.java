package com.greatlearning.currencydenomination;
import java.util.Scanner;

public class PaymentDriver {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size;
        int arr[];

        System.out.println("Enter the no of coins/notes you have");
        size = sc.nextInt();
        arr = new int[size];


        System.out.println("Enter the denominations");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }


        System.out.println("Enter the amount you want to pay");
        int amt = sc.nextInt();


        PaymentMethod pm = new PaymentMethod();
        pm.mergeSort(arr, 0, arr.length - 1);
        pm.paymentApproach(arr, amt);

    }
}
