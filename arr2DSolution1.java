//A left rotation operation on an array shifts each of the array's elements 1 unit to the left. For example, 2 if  left rotations are performed on array[1,2,3,4,5] , 
//then the array would become [3,4,5,1,2]. Note that the lowest index item moves to the highest index in a rotation. This is called a circular array.
//
//Given an array a of n integers and a number,d , perform d  left rotations on the array. Return the updated 
//array to be printed as a single line of space-separated integers.
//
//Function Description
//
//Complete the function rotLeft in the editor below.
//
//rotLeft has the following parameter(s):
//
//int a[n]: the array to rotate
//int d: the number of rotations
//Returns
//
//int a'[n]: the rotated array
//Input Format
//
//The first line contains two space-separated integers n and d, the size of a and the number of left rotations.
//The second line contains  space-separated integers, each an a[i] .
//
//Constraints
//
//Sample Input
//
//5 4
//1 2 3 4 5
//Sample Output
//
//5 1 2 3 4
//Explanation
//
//When we perform  left rotations, the array undergoes the following sequence of changes:


package IntevewQuestSolutionHacker;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author kalim
 */
public class arr2DSolution1 {
    

    public static List<Integer> rotLeft(List<Integer> a, int d) {
        int n = a.size();
        // Calculate the actual number of rotations needed
        int rotations = d % n;

        // Rotate the list to the left
        List<Integer> rotated = a.subList(rotations, n);
        rotated.addAll(a.subList(0, rotations));
        return rotated;
    }
}

 class Solution1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] firstMultipleInput = bufferedReader.readLine().split(" ");
        int n = Integer.parseInt(firstMultipleInput[0]);
        int d = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> a = Stream.of(bufferedReader.readLine().split(" "))
                                .map(Integer::parseInt)
                                .collect(Collectors.toList());

        List<Integer> result =  arr2DSolution1.rotLeft(a, d);

        bufferedWriter.write(result.stream()
                                    .map(Object::toString)
                                    .collect(Collectors.joining(" "))
                              + "\n");

        bufferedReader.close();
        bufferedWriter.close();
    }
}

    

