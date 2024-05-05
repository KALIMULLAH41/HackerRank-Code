//It is New Year's Day and people are in line for the Wonderland rollercoaster ride. Each person wears a sticker indicating their initial position in the queue from  to . Any person can bribe the person directly in front of them to swap positions, but they still wear their original sticker. One person can bribe at most two others.
//
//Determine the minimum number of bribes that took place to get to a given queue order. Print the number of bribes, or, if anyone has bribed more than two people, print Too chaotic.
//
//Example
//q=[1,2,3,5,6,7,8]
//
//
//If person 5 bribes person 4, the queue will look like this: .1,2,3,5,4,6,7,8 Only 1 bribe is required. Print 1.
//q=[4,1,3]
//
//Person 4 had 3to bribe  people to get to the current position. Print Too chaotic.
//
//Function Description
//
//Complete the function minimumBribes in the editor below.
//
//minimumBribes has the following parameter(s):
//
//int q[n]: the positions of the people after all bribes
//Returns
//
//No value is returned. Print the minimum number of bribes necessary or Too chaotic if someone has bribed more than 2 people.
//Input Format
//
//The first line contains an integer , the number of test cases.
//
//Each of the next t pairs of lines are as follows:
//- The first line contains an integer t, the number of people in the queue
//- The second line has n space-separated integers describing the final state of the queue.
//
//Constraints
//1<=t<=10
//1<=n<=10pow(5)
//Subtasks
//
//For 60% score 1<=n<=10pow(3) 
//For 100% score 1<=n<=10pow(5) 
//
//Sample Input
//
//STDIN       Function
//-----       --------
//2           t = 2
//5           n = 5
//2 1 5 3 4   q = [2, 1, 5, 3, 4]
//5           n = 5
//2 5 1 3 4   q = [2, 5, 1, 3, 4]
//Sample Output
//
//3
//Too chaotic
//Explanation
//
//Test Case 1
//
//The initial state:
//
//pic1(1).png
//
//After person  moves one position ahead by bribing person :
//
//pic2.png
//
//Now person  moves another position ahead by bribing person :
//
//pic3.png
//
//And person  moves one position ahead by bribing person :
//
//pic5.png
//
//So the final state is  after three bribing operations.
//
//Test Case 2
//
//No person can bribe more than two people, yet it appears person  has done so. It is
package IntevewQuestSolutionHacker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author kalim
 */
public class arr2DSolution2 {
   

    public static void minimumBribes(List<Integer> q) {
        int bribes = 0;
        for (int i = q.size() - 1; i >= 0; i--) {
            if (q.get(i) - (i + 1) > 2) {
                System.out.println("Too chaotic");
                return;
            }
            for (int j = Math.max(0, q.get(i) - 2); j < i; j++) {
                if (q.get(j) > q.get(i)) {
                    bribes++;
                }
            }
        }
        System.out.println(bribes);
    }
}

class Solution{
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bufferedReader.readLine());

        for (int tItr = 0; tItr < t; tItr++) {
            int n = Integer.parseInt(bufferedReader.readLine().trim());

            List<Integer> q = Stream.of(bufferedReader.readLine().split(" "))
                                    .map(Integer::parseInt)
                                    .collect(Collectors.toList());

            arr2DSolution2.minimumBribes(q);
        }

        bufferedReader.close();
    }
}

    

