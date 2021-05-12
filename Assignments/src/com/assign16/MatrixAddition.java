package com.assign16;

import java.util.Scanner;

public class MatrixAddition {
	 
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
        int[][] array3 = new int[i1][j1];
        if(i != i1 && j != j1) {
            System.out.println("Matrix Addition is not possible");
        }
        else {
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
            //Addition of matrixes
            System.out.println("Addition of matrix");
            for(int indexr=0;indexr<array2.length;indexr++)
            {
                for(int indexc=0;indexc<array2[indexr].length;indexc++)
                {
                    
                    
                    array3 [indexr][indexc]=array1[indexr][indexc]+array2[indexr][indexc];
                }
            }
            System.out.println("print the matrix result");
            for(int indexr=0;indexr<array3.length;indexr++)
            {
                for(int indexc=0;indexc<array3[indexr].length;indexc++)
                {
                    System.out.print(array3 [indexr][indexc]+" ");
                }
                System.out.println("\n");
            }
        }
    }
}


