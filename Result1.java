///There is a new mobile game that starts with consecutively numbered clouds. Some of the clouds are thunderheads and others are cumulus. The player can jump on any cumulus cloud having a number that is equal to the number of the current cloud plus  or . The player must avoid the thunderheads. Determine the minimum number of jumps it will take to jump from the starting postion to the last cloud. It is always possible to win the game.
//
//For each game, you will get an array of clouds numbered  if they are safe or  if they must be avoided.
//
//Example
//
//Index the array from . The number on each cloud is its index in the list so the player must avoid the clouds at indices  and . They could follow these two paths:  or . The first path takes  jumps while the second takes . Return .
//
//Function Description
//
//Complete the jumpingOnClouds function in the editor below.
//
//jumpingOnClouds has the following parameter(s):
//
//int c[n]: an array of binary integers
//Returns
//
//int: the minimum number of jumps required
//Input Format
//
//The first line contains an integer , the total number of clouds. The second line contains  space-separated binary integers describing clouds  where .
//
//Constraints
//
//Output Format
//
//Print the minimum number of jumps needed to win the game.
//
//Sample Input 0
//
//7
//0 0 1 0 0 1 0
//Sample Output 0
//
//4
//Explanation 0:
//The player must avoid  and . The game can be won with a minimum of  jumps:
//
//jump(2).png
//
//Sample Input 1
//
//6
//0 0 0 0 1 0
//Sample Output 1
//
//3
//Explanation 1:
//The only thundercloud to avoid is . The game can be won in  jumps:
//
//jump(5).png
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
public class Result1 {
   


    public static int jumpingOnClouds(List<Integer> c) {
        int jumps = 0;
        int currentCloud = 0;

        while (currentCloud < c.size() - 1) {
            // Check if we can jump 2 clouds
            if (currentCloud + 2 < c.size() && c.get(currentCloud + 2) == 0) {
                currentCloud += 2;
            } else {
                currentCloud++;
            }
            jumps++;
        }

        return jumps;
    }
}

 class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> c = Stream.of(bufferedReader.readLine().split(" "))
                                  .map(Integer::parseInt)
                                  .collect(Collectors.toList());

        int result = Result1.jumpingOnClouds(c);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

    

