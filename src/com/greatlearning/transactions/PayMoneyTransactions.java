package com.greatlearning.transactions;

import java.util.Scanner;

public class PayMoneyTransactions {
    Scanner sc = new Scanner(System.in);
    int size;
    int arr[];

    public void transactionInputs() {
        System.out.println("Enter the no of transactions you want to process");
        size = sc.nextInt();
        arr = new int[size];

        System.out.println("Enter the amount of each transaction");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public void target() {
        System.out.println("Enter the total no of targets to be achieved");
        int numOfTargets = sc.nextInt();
        for (int i = 0; i < numOfTargets; i++) {
            System.out.println("Enter the value of transaction");
            int targetValue = sc.nextInt();
            int sum = 0;
            for (int j = 0; j < size; j++) {
                sum += arr[j];
                if (sum >= targetValue) {
                    System.out.println("Target achieved after transaction number " + (j + 1));
                    break;
                }
            }
            if (sum < targetValue) {
                System.out.println("Target can not be achieved");
            }
        }
    }
}


