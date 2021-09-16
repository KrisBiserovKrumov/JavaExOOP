package javaAdvance.StackAndQueues;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class MaximumElement {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int commands = Integer.parseInt(reader.readLine());
        ArrayDeque<Integer> numbers = new ArrayDeque<>();

        while (commands-- > 0 ){
            String[] command = reader.readLine().split(" ");
            if (command.length == 2){
                numbers.push(Integer.parseInt(command[1]));
            }else if (Integer.parseInt(command[0]) == 2){
                numbers.pop();
            }else {
                int max = Integer.MIN_VALUE;
                for (Integer number : numbers) {
                    if (number > max){
                        max = number;
                    }
                }
                System.out.println(max);
            }


        }
    }
}
