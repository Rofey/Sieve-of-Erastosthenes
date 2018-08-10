package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int array[];
        int endOfArray;
        Scanner scan = new Scanner(System.in);
        endOfArray = scan.nextInt();
        array = new int[endOfArray];

        for(int i=1; i<endOfArray; i+=2) {
            array[i] = i;
        }


        for(int i=2; i*i<endOfArray; i++) {         //square root
            for(int j=i+1;j<endOfArray; j++) {
                if(j%i == 0) {
                    array[j] = 1;
                }
            }
        }

        for(int i=1; i<endOfArray; i++) {
            if (array[i] != 1) {
                System.out.print("\n" + array[i]);
            }
        }

	// write your code here
    }
}
