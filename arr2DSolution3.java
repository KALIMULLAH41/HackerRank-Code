//You are given an unordered array consisting of consecutive integers  [1, 2, 3, ..., n] without any duplicates. You are allowed to swap any two elements. Find the minimum number of swaps required to sort the array in ascending order.
//
//Example
//arr=[7,1,3,2,4,5,6]
//
//Perform the following steps:
//
//i   arr                         swap (indices)
//0   [7, 1, 3, 2, 4, 5, 6]   swap (0,3)
//1   [2, 1, 3, 7, 4, 5, 6]   swap (0,1)
//2   [1, 2, 3, 7, 4, 5, 6]   swap (3,4)
//3   [1, 2, 3, 4, 7, 5, 6]   swap (4,5)
//4   [1, 2, 3, 4, 5, 7, 6]   swap (5,6)
//5   [1, 2, 3, 4, 5, 6, 7]
//It took 5  swaps to sort the array.
//
//Function Description
//
//Complete the function minimumSwaps in the editor below.
//
//minimumSwaps has the following parameter(s):
//
//int arr[n]: an unordered array of integers
//Returns
//
//int: the minimum number of swaps to sort the array
//Input Format
//
//The first line contains an integer,n , the size of arr.
//The second line contains  space-separated integers arr[i].
//
//Constraints
//1<=n<=10pow(5)
//1<=arr[i]<=n
//Sample Input 0
//
//4
//4 3 1 2
//Sample Output 0
//
//3
package IntevewQuestSolutionHacker;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

/**
 *
 * @author kalim
 */
public class arr2DSolution3 {
    

    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {
        int swaps = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            // While the current element is not in its correct position
            while (arr[i] != i + 1) {
                // Swap the current element with the element at its correct position
                int temp = arr[i];
                arr[i] = arr[temp - 1];
                arr[temp - 1] = temp;
                swaps++;
            }
        }
        return swaps;
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out))) {

            int n = Integer.parseInt(bufferedReader.readLine().trim());
            int[] arr = Arrays.stream(bufferedReader.readLine().split(" "))
                              .mapToInt(Integer::parseInt)
                              .toArray();

            int res = minimumSwaps(arr);

            bufferedWriter.write(String.valueOf(res));
            bufferedWriter.newLine();
        }
    }
}

    

