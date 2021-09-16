package javaAdvance.StackAndQueues.LAB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class SimpleCalculator {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split(" ");

        ArrayDeque<Integer> numbers = new ArrayDeque<>();
        ArrayDeque<Character> symbols = new ArrayDeque<>();

        for (String s : input) {
            if (s.equals("-") || s.equals("+")){
                symbols.offer(s.charAt(0));
            }else {
                numbers.offer(Integer.parseInt(s));
            }
        }
        int sum = numbers.pop();
        while (!numbers.isEmpty()) {
            char symb = symbols.pop();
            int second = numbers.pop();
            if (symb == '+'){
                sum += second;
            }else {
                sum -= second;
            }
        }
        System.out.println(sum);
    }
}
