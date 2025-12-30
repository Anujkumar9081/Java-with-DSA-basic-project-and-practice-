
/* 
 Java_Sorting_Order of removal

Take an Array of N size as Input, You have to remove each elements one by one. Cost of removing element = sum of array elements present at that point. Find the min cost to remove all elements.

Input:
The first line contains an Integer N representing the size of an Array.
The second line contains N integers representing the elements of the Array.

Output:
Print the min cost to remove all the elements

Problem Constraint:
1 <= N <= 100
 */
import java.util.*;
public class q1 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int[] arr = new int[a];

        for(int y =0; y<a; y++){
            arr[y] = scn.nextInt();
        }
        Arrays.sort(arr);
        int result = 0;
        for(int y = a=-1; y>=0; y--){
            result += arr[y]*(a-y); 
        }
        System.out.print(result);
    }
}