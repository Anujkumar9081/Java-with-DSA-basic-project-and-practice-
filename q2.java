/* Java_Sorting_Good Elements 1 */

/* Take an Array of N size as Input, Calculate number of good elements. An element is said to be good if No. of element < element == element itself.

Note: Array elements are distinct

Problem Constraint:
1 <= N <= 100

Input:
The first line contains an Integer N representing the size of an Array.
The second line contains N integers representing the elements of the Array.

Output:
Print the number of good elements.*/

import java.util.*;
public class q2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();

        int[] arr = new int[a];
        for(int y =0; y<a; y++){
            arr[y] = scn.nextInt();
        }
        
        Arrays.sort(arr);
        
        int count =0;
        int x =0;
        for(int y = 1; y<a; y++){
            if(arr[y]!=arr[y-1]){
               x = y;
            }
            if(arr[y]==x){ count++;}
        }

        if(arr[0]==0){count++;}
        System.out.print(count);

    }
}
