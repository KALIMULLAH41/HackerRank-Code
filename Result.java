//There is a large pile of socks that must be paired by color. Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are.
//
//Example
//
//
//There is one pair of color  and one of color . There are three odd socks left, one of each color. The number of pairs is .
//
//Function Description
//
//Complete the sockMerchant function in the editor below.
//
//sockMerchant has the following parameter(s):
//
//int n: the number of socks in the pile
//int ar[n]: the colors of each sock
//Returns
//
//int: the number of pairs
//Input Format
//
//The first line contains an integer , the number of socks represented in .
//The second line contains  space-separated integers, , the colors of the socks in the pile.
//
//Constraints
//
// where 
//Sample Input
//
//STDIN                       Function
//-----                       --------
//9                           n = 9
//10 20 20 10 10 30 50 10 20  ar = [10, 20, 20, 10, 10, 30, 50, 10, 20]
//Sample Output
//
//3
//Explanation
//
//sock.png
//
//There are three pairs of socks

package IntevewQuestSolutionHacker;


/**
 *
 * @author kalim
 */

    import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class Result {
    



    public static int sockMerchant(int n, List<Integer> ar) {
        // Create a HashMap to store counts of each color
        Map<Integer, Long> colorCounts = ar.stream()
                                          .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        
        // Initialize pairs count
        int pairs = 0;
        
        // Count pairs for each color
        for (long count : colorCounts.values()) {
            pairs += count / 2;
        }
        
        return pairs;
    }

}

 class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                  .map(Integer::parseInt)
                                  .collect(Collectors.toList());

        int result = Result.sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

    

    

