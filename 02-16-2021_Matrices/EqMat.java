package com.assign16;

import java.util.Scanner;

public class EqMat {
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter i size");
        int i = sc.nextInt();
        System.out.println("Enter the j size");
        int j = sc.nextInt();
        int[][] array1 = new int[i][j];
        System.out.println("Enter i1 size");
        int i1 = sc.nextInt();
        System.out.println("Enter the j1 size");
        int j1 = sc.nextInt();
        int[][] array2 = new int[i1][j1];
        
        if(i == i1 && j == j1) {
        	 //Enter the elements of matrix 1
            System.out.println("Enter the matrix1 elements");
            for(int indexr=0;indexr<array1.length;indexr++)
            {
                for(int indexc=0;indexc<array1[indexr].length;indexc++)
                {
                    array1[indexr][indexc]=sc.nextInt();
                }
            }
            System.out.println("Enter the matrix2 elements");
            for(int indexr=0;indexr<array2.length;indexr++)
            {
                for(int indexc=0;indexc<array2[indexr].length;indexc++)
                {
                    array2[indexr][indexc]=sc.nextInt();
                }
            }
            //Printing matrix1 elements
            System.out.println("Print the matrix1 elements");
            for(int indexr=0;indexr<array1.length;indexr++)
            {
                for(int indexc=0;indexc<array1[indexr].length;indexc++)
                {
                    System.out.print(array1[indexr][indexc] + " ");
                }
                System.out.println("\n");
                
            }
            System.out.println("Print the matrix2 elements");
            for(int indexr=0;indexr<array2.length;indexr++)
            {
                for(int indexc=0;indexc<array2[indexr].length;indexc++)
                {
                    System.out.print(array2[indexr][indexc] + " ");
                }
                System.out.println("\n");
            }
            //Comparison of two Matrices
            int index = 0;
            int invalid = 0;
            for(int indexr = 0; indexr <= array1.length - 1; indexr++) {
            	for(int indexc = 0;indexc <= array1[indexr].length - 1;indexc++) {
            		if(array1[indexr][indexc] == array2[indexr][indexc]) {
            		index++;
            		}
            		else {
            			invalid++;
            		}
            	}
            }
            if (invalid > 0) {
				System.out.println("The Two matrices are different");
			}
			else {
				System.out.println("Both are same matrix");
			}
        }
        else {
           System.out.println("Matrix comparison is not possible");
        }
	}
}
