package javaAdvance.StackAndQueues.LAB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class MatchingBrackets {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String imput = reader.readLine();

        ArrayDeque<Integer> brackets = new ArrayDeque<>();

        for (int i = 0; i < imput.length(); i++) {
            char symbol = (imput.charAt(i));

            if (symbol == '('){
                brackets.push(i);
            }else if (symbol == ')'){
                int startIndex  = brackets.pop();
               String total =  imput.substring(startIndex,i + 1);
                System.out.println(total);
            }


        }
    }
}
