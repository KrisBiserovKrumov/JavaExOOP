package javaAdvance.StackAndQueues;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class BasicQueueOperations {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");
        ArrayDeque<Integer> numbers = new ArrayDeque<>();
        int numbToFind = Integer.parseInt(input[2]);
        int numbToPop = Integer.parseInt(input[1]);
        int lenght = Integer.parseInt(input[0]);


        String[] numbs = reader.readLine().split(" ");

        for (String numb : numbs) {
            numbers.offer(Integer.parseInt(numb));
        }

        for (int i = 0; i < numbToPop ; i++) {
            numbers.poll();
        }
        for (Integer number : numbers) {
            if (number == numbToFind){
                System.out.println("true");

                return;
            }
        }
        if (numbers.isEmpty()){
            System.out.println(0);
            return;
        }

        int min = Integer.MAX_VALUE;
        for (Integer number : numbers) {
            if (number < min){
                min = number;
            }
        }
        System.out.println(min);
    }
}
