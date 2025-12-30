/* Java_2D Array_Transpose of a Matrix

Given a square matrix, Calculate transpose of the matrix and print it.

Note: Using another array is not allowed.

Input Format
The first line contains two integers n and m representing row and column of 2D array.
Each of next n rows contains m numbers of 2D array.

Constraints
2 <= n,m <= 1000
0 <= elements of array <= 10^4

Output Format
Print the transposed matrix. */

import java.util.*;
public class q3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();

        int[][] arr = new int[a][b];
        for(int y = 0; y<a; y++){
            for(int g = 0; g<b; g++){
                arr[y][g] = scn.nextInt();
            }
        }
        for(int v = 1; v<a; v++){
            for(int e = 0; e<v; e++){
               int temp = arr[v][e];
               arr[v][e] = arr[e][v];
               arr[e][v] = temp;
            }
            System.out.print("");
        }
        for(int c =0; c<a; c++){
            for(int x =0; x<b; x++){
                System.out.print(arr[c][x]+" ");
            }
            System.out.println("");
        }
    }
}
