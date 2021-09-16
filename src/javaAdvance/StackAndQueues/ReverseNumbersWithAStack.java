package javaAdvance.StackAndQueues;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;

public class ReverseNumbersWithAStack {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = Arrays.stream(reader.readLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();

        ArrayDeque<Integer> numbs = new ArrayDeque<>();

        for (int number : numbers) {
            numbs.push(number);
        }

        for (Integer numb : numbs) {
            System.out.print(numb + " ");
        }

    }
}
